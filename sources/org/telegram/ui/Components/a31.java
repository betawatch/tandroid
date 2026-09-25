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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class a31 extends r61 {
    public final org.telegram.ui.g20 f3;
    public final e6 g3;
    public Drawable h3;
    public int i3;
    public final Paint j3;

    public a31(Context context, int i10, x21 x21Var, p21 p21Var, p21 p21Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, x21Var, p21Var, p21Var2, d6Var);
        this.f3 = new org.telegram.ui.g20();
        this.g3 = new e6(this, 320L, rr.h);
        this.j3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.r61, org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
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
            if (childAt instanceof j31) {
                j31 j31Var = (j31) childAt;
                if (j31Var.y) {
                    if (height > j31Var.getY()) {
                        height = j31Var.getY();
                        RecyclerView.R(j31Var);
                    }
                    if (f7 < j31Var.getY() + j31Var.getHeight()) {
                        f7 = j31Var.getY() + j31Var.getHeight();
                        RecyclerView.R(j31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.h6.s9;
            org.telegram.ui.ActionBar.d6 d6Var = this.p2;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
            Paint paint = this.j3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.h3 == null) {
                this.h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.b9, d6Var);
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
