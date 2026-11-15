package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class yu extends xu {
    public h6.m d0;
    public org.telegram.ui.Components.dc e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public yu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7, spannableStringBuilder);
        this.l0 = i5.c.g(t0.b, R.drawable.arrow_more);
        boolean z10 = pageblockblockquote.collapsed;
        this.h0 = z10;
        this.i0 = z10;
    }

    @Override // org.telegram.messenger.xu, org.telegram.messenger.cu
    public final int I() {
        if (!this.h0) {
            return super.I();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.I());
    }

    @Override // org.telegram.messenger.xu, org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.dc dcVar = this.e0;
        float a10 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
        int i7 = this.c;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, i7 / 2.0f, I() / 2.0f);
        }
        boolean z10 = this.j0 > 0.0f;
        int i10 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i7, i10);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i7, i10, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.d0 == null) {
                this.d0 = new h6.m(29);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i10 - g0.L(24.0f), i7, i10 + 1);
            this.d0.m(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        iv ivVar = this.a;
        int i11 = ivVar.y.i();
        int i12 = this.m0;
        Drawable drawable = this.l0;
        if (i11 != i12) {
            int i13 = ivVar.y.i();
            this.m0 = i13;
            drawable.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
        }
        bg.s.e(this.l0, ivVar.C - g0.L(24.0f), g0.L(8.0f) + ((i10 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.j0, ns.K2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.xu, org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.Y(motionEvent);
        }
        iv ivVar = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.g0 = Y;
            if (!Y) {
                this.f0 = true;
                if (this.e0 == null && (view = ivVar.Q) != null) {
                    this.e0 = new org.telegram.ui.Components.dc(view);
                }
                org.telegram.ui.Components.dc dcVar = this.e0;
                if (dcVar != null) {
                    dcVar.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    org.telegram.ui.Components.dc dcVar2 = this.e0;
                    if (dcVar2 != null) {
                        dcVar2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            org.telegram.ui.Components.dc dcVar3 = this.e0;
            if (dcVar3 != null) {
                dcVar3.c(false);
            }
            View view2 = ivVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            ivVar.X();
            this.h0 = !this.h0;
            ivVar.u = true;
            ivVar.Q();
            View view3 = ivVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = ivVar.E;
            org.telegram.ui.Cells.l1 l1Var = ivVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.B1(q1Var, true, true);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final void d0() {
        super.d0();
        this.i0 = this.h0;
    }

    @Override // org.telegram.messenger.cu
    public final float z() {
        org.telegram.ui.Components.dc dcVar = this.e0;
        if (dcVar != null) {
            return dcVar.a(0.01f);
        }
        return 1.0f;
    }
}
