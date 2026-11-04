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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w01 extends l41 {
    public final k4.j n3;
    public final u5 o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public w01(Context context, int i3, p01 p01Var, q01 q01Var, q01 q01Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, 0, false, p01Var, q01Var, q01Var2, e6Var);
        this.n3 = new k4.j(24);
        this.o3 = new u5(this, 320L, xq.h);
        this.r3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.l41, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.o3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof f11) {
                f11 f11Var = (f11) childAt;
                if (f11Var.F) {
                    if (height > f11Var.getY()) {
                        height = f11Var.getY();
                        RecyclerView.R(f11Var);
                    }
                    if (f10 < f11Var.getY() + f11Var.getHeight()) {
                        f10 = f11Var.getY() + f11Var.getHeight();
                        RecyclerView.R(f11Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i10 = org.telegram.ui.ActionBar.k6.s9;
            org.telegram.ui.ActionBar.e6 e6Var = this.o2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            Paint paint = this.r3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b9, e6Var);
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
            this.n3.w(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
