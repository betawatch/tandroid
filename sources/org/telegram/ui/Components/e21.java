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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e21 extends u51 {
    public final li.k m3;
    public final t5 n3;
    public Drawable o3;
    public int p3;
    public final Paint q3;

    public e21(Context context, int i10, v11 v11Var, w11 w11Var, w11 w11Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, v11Var, w11Var, w11Var2, p6Var);
        this.m3 = new li.k(23);
        this.n3 = new t5(this, 320L, gr.h);
        this.q3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.n3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof n21) {
                n21 n21Var = (n21) childAt;
                if (n21Var.E) {
                    if (height > n21Var.getY()) {
                        height = n21Var.getY();
                        RecyclerView.R(n21Var);
                    }
                    if (f7 < n21Var.getY() + n21Var.getHeight()) {
                        f7 = n21Var.getY() + n21Var.getHeight();
                        RecyclerView.R(n21Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.t6.s9;
            org.telegram.ui.ActionBar.p6 p6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            Paint paint = this.q3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getWidth() - org.telegram.messenger.i0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.i0.L(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            if (this.o3 == null) {
                this.o3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.b9, p6Var);
            if (this.p3 != w03) {
                Drawable drawable = this.o3;
                this.p3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.o3.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.i0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.i0.L(12.32f)));
            this.o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(12.0f));
            this.m3.o(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
