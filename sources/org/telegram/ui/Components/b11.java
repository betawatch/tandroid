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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b11 extends q41 {
    public final h6.m m3;
    public final w5 n3;
    public Drawable o3;
    public int p3;
    public final Paint q3;

    public b11(Context context, int i7, u01 u01Var, v01 v01Var, v01 v01Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, 0, false, u01Var, v01Var, v01Var2, f6Var);
        this.m3 = new h6.m(28);
        this.n3 = new w5(this, 320L, xq.h);
        this.q3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.q41, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.n3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof l11) {
                l11 l11Var = (l11) childAt;
                if (l11Var.E) {
                    if (height > l11Var.getY()) {
                        height = l11Var.getY();
                        RecyclerView.R(l11Var);
                    }
                    if (f10 < l11Var.getY() + l11Var.getHeight()) {
                        f10 = l11Var.getY() + l11Var.getHeight();
                        RecyclerView.R(l11Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i10 = org.telegram.ui.ActionBar.k6.s9;
            org.telegram.ui.ActionBar.f6 f6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            Paint paint = this.q3;
            paint.setColor(w02);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getWidth() - org.telegram.messenger.g0.L(56.0f)) / 2.0f, height, (org.telegram.messenger.g0.L(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            if (this.o3 == null) {
                this.o3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b9, f6Var);
            if (this.p3 != w03) {
                Drawable drawable = this.o3;
                this.p3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.o3.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(4.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(2.66f)), (int) (rectF.left + org.telegram.messenger.g0.L(13.66f)), (int) (rectF.top + org.telegram.messenger.g0.L(12.32f)));
            this.o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f) {
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f));
            this.m3.m(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
