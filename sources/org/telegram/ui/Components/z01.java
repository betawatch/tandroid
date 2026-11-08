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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class z01 extends q41 {
    public final h6.m m3;
    public final w5 n3;
    public final w5 o3;
    public final RectF p3;
    public final Paint q3;
    public final w5 r3;
    public Drawable s3;
    public int t3;
    public final Paint u3;
    public final /* synthetic */ m11 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(m11 m11Var, Context context, int i7, u01 u01Var, v01 v01Var, v01 v01Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, 0, false, u01Var, v01Var, v01Var2, f6Var);
        this.v3 = m11Var;
        this.m3 = new h6.m(28);
        xq xqVar = xq.h;
        this.n3 = new w5(this, 320L, xqVar);
        this.o3 = new w5(this, 320L, xqVar);
        this.p3 = new RectF();
        this.q3 = new Paint(1);
        this.r3 = new w5(this, 420L, xqVar);
        this.u3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.pj0
    public final Integer V0(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.Components.q41, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        boolean z9;
        float d = this.n3.d(canScrollHorizontally(-1));
        float d2 = this.o3.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        boolean z10 = i10 > 0 || d2 > 0.0f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof h11) {
                h11 h11Var = (h11) childAt;
                if (h11Var.s) {
                    if (width > h11Var.getX()) {
                        width = h11Var.getX();
                        RecyclerView.R(h11Var);
                    }
                    if (f13 < h11Var.getX() + h11Var.getWidth()) {
                        f13 = h11Var.getX() + h11Var.getWidth();
                        RecyclerView.R(h11Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.n2;
        if (f13 > width) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            Paint paint = this.u3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.s3 == null) {
                this.s3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b9, f6Var);
            if (this.t3 != w02) {
                Drawable drawable = this.s3;
                this.t3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.s3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.s3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        m11 m11Var = this.v3;
        long j3 = m11Var.K;
        long j10 = m11Var.e0;
        w5 w5Var = this.r3;
        if (j3 != j10) {
            m11Var.L = j3;
            w5Var.e(true, 0.0f);
        }
        m11Var.K = m11Var.e0;
        h11 h11Var2 = null;
        h11 h11Var3 = null;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof h11) {
                h11 h11Var4 = (h11) childAt2;
                if (!h11Var4.y) {
                    i7 = i10;
                    if (h11Var4.getTopicId() == m11Var.e0) {
                        h11Var2 = h11Var4;
                    }
                    z9 = z10;
                    if (h11Var4.getTopicId() == m11Var.L) {
                        h11Var3 = h11Var4;
                    }
                    i12++;
                    i10 = i7;
                    z10 = z9;
                }
            }
            i7 = i10;
            z9 = z10;
            i12++;
            i10 = i7;
            z10 = z9;
        }
        int i13 = i10;
        boolean z11 = z10;
        if (h11Var2 != null) {
            float x10 = h11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y10 = h11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (h11Var2.getX() + h11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y11 = (h11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.p3;
            rectF2.set(x10, y10, x11, y11);
            if (h11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(h11Var3.getX() + org.telegram.messenger.g0.L(f10), h11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (h11Var3.getX() + h11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (h11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, w5Var.e(false, f10), rectF2);
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var), 31);
            Paint paint2 = this.q3;
            paint2.setColor(o4);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z11) {
            canvas2.save();
            h6.m mVar = this.m3;
            if (i13 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                mVar.m(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d2 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                mVar.m(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
