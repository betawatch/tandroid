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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class lv extends kv {
    public li.k c0;
    public org.telegram.ui.Components.dc d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public float i0;
    public int j0;
    public final Drawable k0;
    public int l0;

    public lv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10, spannableStringBuilder);
        this.k0 = i0.a.f(w0.b, R.drawable.arrow_more);
        boolean z10 = pageblockblockquote.collapsed;
        this.g0 = z10;
        this.h0 = z10;
    }

    @Override // org.telegram.messenger.kv, org.telegram.messenger.qu
    public final int H() {
        if (!this.g0) {
            return super.H();
        }
        Rect rect = this.b;
        return (int) Math.min((this.W.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.Z + rect.bottom, super.H());
    }

    @Override // org.telegram.messenger.kv, org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        org.telegram.ui.Components.dc dcVar = this.d0;
        float a2 = dcVar != null ? dcVar.a(0.01f) : 1.0f;
        int i10 = this.c;
        if (a2 != 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, i10 / 2.0f, H() / 2.0f);
        }
        boolean z10 = this.i0 > 0.0f;
        int i11 = (this.j0 - this.b.bottom) - this.a0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.V(canvas);
        if (z10) {
            if (this.c0 == null) {
                this.c0 = new li.k(23);
            }
            RectF rectF = i0.P;
            rectF.set(0.0f, i11 - i0.L(24.0f), i10, i11 + 1);
            this.c0.o(canvas, rectF, 3, this.i0);
            canvas.restore();
        }
        canvas.restore();
        vv vvVar = this.a;
        int i12 = vvVar.y.i();
        int i13 = this.l0;
        Drawable drawable = this.k0;
        if (i12 != i13) {
            int i14 = vvVar.y.i();
            this.l0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        rf.o.e(this.k0, vvVar.C - i0.L(24.0f), i0.L(8.0f) + ((i11 - i0.L(16.0f)) - i0.L(2.0f)), i0.L(16.0f), i0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(i0.W1(this.i0, zs.K2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a2 != 1.0f) {
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.kv, org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f0 = false;
            }
            return super.X(motionEvent);
        }
        vv vvVar = this.a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.f0 = X;
            if (!X) {
                this.e0 = true;
                if (this.d0 == null && (view = vvVar.Q) != null) {
                    this.d0 = new org.telegram.ui.Components.dc(view);
                }
                org.telegram.ui.Components.dc dcVar = this.d0;
                if (dcVar != null) {
                    dcVar.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.e0 = false;
                    org.telegram.ui.Components.dc dcVar2 = this.d0;
                    if (dcVar2 != null) {
                        dcVar2.c(false);
                    }
                }
                return this.e0;
            }
            if (!this.e0) {
                return false;
            }
            this.e0 = false;
            org.telegram.ui.Components.dc dcVar3 = this.d0;
            if (dcVar3 != null) {
                dcVar3.c(false);
            }
            View view2 = vvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            vvVar.X();
            this.g0 = !this.g0;
            vvVar.u = true;
            vvVar.Q();
            View view3 = vvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = vvVar.E;
            org.telegram.ui.Cells.l1 l1Var = vvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.l1(q1Var, true, true);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final void c0() {
        super.c0();
        this.h0 = this.g0;
    }

    @Override // org.telegram.messenger.qu
    public final float z() {
        org.telegram.ui.Components.dc dcVar = this.d0;
        if (dcVar != null) {
            return dcVar.a(0.01f);
        }
        return 1.0f;
    }
}
