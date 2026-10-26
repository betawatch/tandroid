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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u31 extends r71 {
    public final org.telegram.ui.w10 n3;
    public final h6 o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public u31(Context context, int i10, r31 r31Var, m31 m31Var, m31 m31Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, 0, false, r31Var, m31Var, m31Var2, u6Var);
        this.n3 = new org.telegram.ui.w10();
        this.o3 = new h6(this, 320L, ds.h);
        this.r3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.r71, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.o3.e(canScrollVertically(-1));
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
            if (childAt instanceof d41) {
                d41 d41Var = (d41) childAt;
                if (d41Var.E) {
                    if (height > d41Var.getY()) {
                        height = d41Var.getY();
                        RecyclerView.R(d41Var);
                    }
                    if (f7 < d41Var.getY() + d41Var.getHeight()) {
                        f7 = d41Var.getY() + d41Var.getHeight();
                        RecyclerView.R(d41Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.y6.s9;
            org.telegram.ui.ActionBar.u6 u6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
            Paint paint = this.r3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.b9, u6Var);
            if (this.q3 != w03) {
                Drawable drawable = this.p3;
                this.q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.n3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
