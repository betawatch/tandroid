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
public final class c21 extends u51 {
    public final li.k m3;
    public final t5 n3;
    public final t5 o3;
    public final RectF p3;
    public final Paint q3;
    public final t5 r3;
    public Drawable s3;
    public int t3;
    public final Paint u3;
    public final /* synthetic */ o21 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(o21 o21Var, Context context, int i10, v11 v11Var, w11 w11Var, w11 w11Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, v11Var, w11Var, w11Var2, p6Var);
        this.v3 = o21Var;
        this.m3 = new li.k(23);
        gr grVar = gr.h;
        this.n3 = new t5(this, 320L, grVar);
        this.o3 = new t5(this, 320L, grVar);
        this.p3 = new RectF();
        this.q3 = new Paint(1);
        this.r3 = new t5(this, 420L, grVar);
        this.u3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.tk0
    public final Integer V0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float d = this.n3.d(canScrollHorizontally(-1));
        float d10 = this.o3.d(canScrollHorizontally(1));
        int i11 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        boolean z11 = i11 > 0 || d10 > 0.0f;
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f12 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof j21) {
                j21 j21Var = (j21) childAt;
                if (j21Var.s) {
                    if (width > j21Var.getX()) {
                        width = j21Var.getX();
                        RecyclerView.R(j21Var);
                    }
                    if (f12 < j21Var.getX() + j21Var.getWidth()) {
                        f12 = j21Var.getX() + j21Var.getWidth();
                        RecyclerView.R(j21Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.n2;
        if (f12 > width) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            Paint paint = this.u3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.i0.P;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + org.telegram.messenger.i0.L(1.0f), (getHeight() - org.telegram.messenger.i0.L(28.0f)) / 2.0f, f12 - org.telegram.messenger.i0.L(1.0f), (org.telegram.messenger.i0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint);
            if (this.s3 == null) {
                this.s3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.b9, p6Var);
            if (this.t3 != w02) {
                Drawable drawable = this.s3;
                this.t3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.s3.setBounds((int) (org.telegram.messenger.i0.L(-17.0f) + f12), (int) (rectF.top + org.telegram.messenger.i0.L(10.0f)), (int) (f12 + org.telegram.messenger.i0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(20.0f)));
            this.s3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        o21 o21Var = this.v3;
        long j10 = o21Var.N;
        long j11 = o21Var.h0;
        t5 t5Var = this.r3;
        if (j10 != j11) {
            o21Var.O = j10;
            t5Var.e(true, 0.0f);
        }
        o21Var.N = o21Var.h0;
        j21 j21Var2 = null;
        j21 j21Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof j21) {
                j21 j21Var4 = (j21) childAt2;
                if (!j21Var4.y) {
                    i10 = i11;
                    if (j21Var4.getTopicId() == o21Var.h0) {
                        j21Var2 = j21Var4;
                    }
                    z10 = z11;
                    if (j21Var4.getTopicId() == o21Var.O) {
                        j21Var3 = j21Var4;
                    }
                    i13++;
                    i11 = i10;
                    z11 = z10;
                }
            }
            i10 = i11;
            z10 = z11;
            i13++;
            i11 = i10;
            z11 = z10;
        }
        int i14 = i11;
        boolean z12 = z11;
        if (j21Var2 != null) {
            float x10 = j21Var2.getX() + org.telegram.messenger.i0.L(f7);
            float y3 = j21Var2.getY() + org.telegram.messenger.i0.L(4.0f);
            float x11 = (j21Var2.getX() + j21Var2.getWidth()) - org.telegram.messenger.i0.L(f7);
            float y10 = (j21Var2.getY() + getHeight()) - org.telegram.messenger.i0.L(4.0f);
            RectF rectF2 = this.p3;
            rectF2.set(x10, y3, x11, y10);
            if (j21Var3 != null) {
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(j21Var3.getX() + org.telegram.messenger.i0.L(f7), j21Var3.getY() + org.telegram.messenger.i0.L(4.0f), (j21Var3.getX() + j21Var3.getWidth()) - org.telegram.messenger.i0.L(f7), (j21Var3.getY() + getHeight()) - org.telegram.messenger.i0.L(4.0f));
                org.telegram.messenger.i0.Z1(rectF3, rectF2, t5Var.e(false, f7), rectF2);
            }
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), 31);
            Paint paint2 = this.q3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            li.k kVar = this.m3;
            if (i14 > 0) {
                RectF rectF4 = org.telegram.messenger.i0.P;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.i0.L(12.0f), getHeight());
                kVar.o(canvas2, rectF4, 0, d);
            } else {
                f11 = 0.0f;
            }
            if (d10 > f11) {
                RectF rectF5 = org.telegram.messenger.i0.P;
                rectF5.set(getWidth() - org.telegram.messenger.i0.L(12.0f), f11, getWidth(), getHeight());
                kVar.o(canvas2, rectF5, 2, d10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
