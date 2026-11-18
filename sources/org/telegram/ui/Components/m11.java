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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m11 extends e51 {
    public final h6.m n3;
    public final c6 o3;
    public final c6 p3;
    public final RectF q3;
    public final Paint r3;
    public final c6 s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final /* synthetic */ z11 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m11(z11 z11Var, Context context, int i7, h11 h11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, h11Var, i11Var, i11Var2, i6Var);
        this.w3 = z11Var;
        this.n3 = new h6.m(29);
        lr lrVar = lr.h;
        this.o3 = new c6(this, 320L, lrVar);
        this.p3 = new c6(this, 320L, lrVar);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new c6(this, 420L, lrVar);
        this.v3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.ck0
    public final Integer V0(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        boolean z10;
        float d = this.o3.d(canScrollHorizontally(-1));
        float d2 = this.p3.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        boolean z11 = i10 > 0 || d2 > 0.0f;
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ks.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u11) {
                u11 u11Var = (u11) childAt;
                if (u11Var.s) {
                    if (width > u11Var.getX()) {
                        width = u11Var.getX();
                        RecyclerView.R(u11Var);
                    }
                    if (f13 < u11Var.getX() + u11Var.getWidth()) {
                        f13 = u11Var.getX() + u11Var.getWidth();
                        RecyclerView.R(u11Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.o2;
        if (f13 > width) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
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
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.b9, i6Var);
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
        z11 z11Var = this.w3;
        long j3 = z11Var.L;
        long j10 = z11Var.f0;
        c6 c6Var = this.s3;
        if (j3 != j10) {
            z11Var.M = j3;
            c6Var.e(true, 0.0f);
        }
        z11Var.L = z11Var.f0;
        u11 u11Var2 = null;
        u11 u11Var3 = null;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof u11) {
                u11 u11Var4 = (u11) childAt2;
                if (!u11Var4.y) {
                    i7 = i10;
                    if (u11Var4.getTopicId() == z11Var.f0) {
                        u11Var2 = u11Var4;
                    }
                    z10 = z11;
                    if (u11Var4.getTopicId() == z11Var.M) {
                        u11Var3 = u11Var4;
                    }
                    i12++;
                    i10 = i7;
                    z11 = z10;
                }
            }
            i7 = i10;
            z10 = z11;
            i12++;
            i10 = i7;
            z11 = z10;
        }
        int i13 = i10;
        boolean z12 = z11;
        if (u11Var2 != null) {
            float x10 = u11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y10 = u11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (u11Var2.getX() + u11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y11 = (u11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x10, y10, x11, y11);
            if (u11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(u11Var3.getX() + org.telegram.messenger.g0.L(f10), u11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (u11Var3.getX() + u11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (u11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, c6Var.e(false, f10), rectF2);
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), 31);
            Paint paint2 = this.r3;
            paint2.setColor(o4);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            h6.m mVar = this.n3;
            if (i13 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                mVar.n(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d2 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                mVar.n(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
