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
public final class u01 extends l41 {
    public final k4.j n3;
    public final u5 o3;
    public final u5 p3;
    public final RectF q3;
    public final Paint r3;
    public final u5 s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final /* synthetic */ g11 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(g11 g11Var, Context context, int i3, p01 p01Var, q01 q01Var, q01 q01Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, 0, false, p01Var, q01Var, q01Var2, e6Var);
        this.w3 = g11Var;
        this.n3 = new k4.j(24);
        xq xqVar = xq.h;
        this.o3 = new u5(this, 320L, xqVar);
        this.p3 = new u5(this, 320L, xqVar);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new u5(this, 420L, xqVar);
        this.v3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.tj0
    public final Integer V0(int i3) {
        return 0;
    }

    @Override // org.telegram.ui.Components.l41, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i3;
        boolean z10;
        float d = this.o3.d(canScrollHorizontally(-1));
        float d10 = this.p3.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        boolean z11 = i10 > 0 || d10 > 0.0f;
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof b11) {
                b11 b11Var = (b11) childAt;
                if (b11Var.s) {
                    if (width > b11Var.getX()) {
                        width = b11Var.getX();
                        RecyclerView.R(b11Var);
                    }
                    if (f13 < b11Var.getX() + b11Var.getWidth()) {
                        f13 = b11Var.getX() + b11Var.getWidth();
                        RecyclerView.R(b11Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.o2;
        if (f13 > width) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            Paint paint = this.v3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.t3 == null) {
                this.t3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b9, e6Var);
            if (this.u3 != w02) {
                Drawable drawable = this.t3;
                this.u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.t3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.t3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        g11 g11Var = this.w3;
        long j10 = g11Var.L;
        long j11 = g11Var.f0;
        u5 u5Var = this.s3;
        if (j10 != j11) {
            g11Var.M = j10;
            u5Var.e(true, 0.0f);
        }
        g11Var.L = g11Var.f0;
        b11 b11Var2 = null;
        b11 b11Var3 = null;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof b11) {
                b11 b11Var4 = (b11) childAt2;
                if (!b11Var4.y) {
                    i3 = i10;
                    if (b11Var4.getTopicId() == g11Var.f0) {
                        b11Var2 = b11Var4;
                    }
                    z10 = z11;
                    if (b11Var4.getTopicId() == g11Var.M) {
                        b11Var3 = b11Var4;
                    }
                    i12++;
                    i10 = i3;
                    z11 = z10;
                }
            }
            i3 = i10;
            z10 = z11;
            i12++;
            i10 = i3;
            z11 = z10;
        }
        int i13 = i10;
        boolean z12 = z11;
        if (b11Var2 != null) {
            float x10 = b11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y9 = b11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (b11Var2.getX() + b11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y10 = (b11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x10, y9, x11, y10);
            if (b11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(b11Var3.getX() + org.telegram.messenger.g0.L(f10), b11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (b11Var3.getX() + b11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (b11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, u5Var.e(false, f10), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), 31);
            Paint paint2 = this.r3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            k4.j jVar = this.n3;
            if (i13 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                jVar.w(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d10 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                jVar.w(canvas2, rectF5, 2, d10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
