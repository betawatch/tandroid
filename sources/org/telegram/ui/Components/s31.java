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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s31 extends k71 {
    public final org.telegram.ui.j20 d3;
    public final g6 e3;
    public Drawable f3;
    public int g3;
    public final Paint h3;

    public s31(Context context, int i10, p31 p31Var, h31 h31Var, h31 h31Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, p31Var, h31Var, h31Var2, e6Var);
        this.d3 = new org.telegram.ui.j20();
        this.e3 = new g6(this, 320L, hs.h);
        this.h3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.k71, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.e3.e(canScrollVertically(-1));
        if (e7 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof b41) {
                b41 b41Var = (b41) childAt;
                if (b41Var.y) {
                    if (height > b41Var.getY()) {
                        height = b41Var.getY();
                        RecyclerView.R(b41Var);
                    }
                    if (f7 < b41Var.getY() + b41Var.getHeight()) {
                        f7 = b41Var.getY() + b41Var.getHeight();
                        RecyclerView.R(b41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.i6.s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
            Paint paint = this.h3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f3 == null) {
                this.f3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.b9, e6Var);
            if (this.g3 != w03) {
                Drawable drawable = this.f3;
                this.g3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e7 > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.d3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
