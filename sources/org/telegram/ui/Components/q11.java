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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q11 extends h51 {
    public final h6.m n3;
    public final d6 o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public q11(Context context, int i7, j11 j11Var, k11 k11Var, k11 k11Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, j11Var, k11Var, k11Var2, h6Var);
        this.n3 = new h6.m(29);
        this.o3 = new d6(this, 320L, nr.h);
        this.r3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.h51, org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.o3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ks.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a21) {
                a21 a21Var = (a21) childAt;
                if (a21Var.F) {
                    if (height > a21Var.getY()) {
                        height = a21Var.getY();
                        RecyclerView.R(a21Var);
                    }
                    if (f10 < a21Var.getY() + a21Var.getHeight()) {
                        f10 = a21Var.getY() + a21Var.getHeight();
                        RecyclerView.R(a21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i10 = org.telegram.ui.ActionBar.m6.s9;
            org.telegram.ui.ActionBar.h6 h6Var = this.o2;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            Paint paint = this.r3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.b9, h6Var);
            if (this.q3 != w03) {
                Drawable drawable = this.p3;
                this.q3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.n3.n(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
