package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n21 extends e61 {
    public final org.telegram.ui.l20 f3;
    public final c6 g3;
    public Drawable h3;
    public int i3;
    public final Paint j3;

    public n21(Context context, int i10, k21 k21Var, c21 c21Var, c21 c21Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, k21Var, c21Var, c21Var2, e6Var);
        this.f3 = new org.telegram.ui.l20();
        this.g3 = new c6(this, 320L, qr.h);
        this.j3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.e61, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.g3.e(canScrollVertically(-1));
        if (e > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w21) {
                w21 w21Var = (w21) childAt;
                if (w21Var.y) {
                    if (height > w21Var.getY()) {
                        height = w21Var.getY();
                        RecyclerView.R(w21Var);
                    }
                    if (f7 < w21Var.getY() + w21Var.getHeight()) {
                        f7 = w21Var.getY() + w21Var.getHeight();
                        RecyclerView.R(w21Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.i6.s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.h3 == null) {
                this.h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.b9, e6Var);
            if (this.i3 != v03) {
                Drawable drawable = this.h3;
                this.i3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.h3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.h3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.f3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
