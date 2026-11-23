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
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class uu extends tu {
    public i61 d0;
    public org.telegram.ui.Components.lc e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public uu(ev evVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7, spannableStringBuilder);
        this.l0 = i5.c.g(t0.b, R.drawable.arrow_more);
        boolean z10 = pageblockblockquote.collapsed;
        this.h0 = z10;
        this.i0 = z10;
    }

    @Override // org.telegram.messenger.tu, org.telegram.messenger.zt
    public final int I() {
        if (!this.h0) {
            return super.I();
        }
        Rect rect = this.b;
        return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.I());
    }

    @Override // org.telegram.messenger.tu, org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.lc lcVar = this.e0;
        float a10 = lcVar != null ? lcVar.a(0.01f) : 1.0f;
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
                this.d0 = new i61(1);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i10 - g0.L(24.0f), i7, i10 + 1);
            this.d0.u(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        ev evVar = this.a;
        int i11 = evVar.y.i();
        int i12 = this.m0;
        Drawable drawable = this.l0;
        if (i11 != i12) {
            int i13 = evVar.y.i();
            this.m0 = i13;
            drawable.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
        }
        bg.t.e(this.l0, evVar.C - g0.L(24.0f), g0.L(8.0f) + ((i10 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.j0, ks.K2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.tu, org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.Y(motionEvent);
        }
        ev evVar = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.g0 = Y;
            if (!Y) {
                this.f0 = true;
                if (this.e0 == null && (view = evVar.Q) != null) {
                    this.e0 = new org.telegram.ui.Components.lc(view);
                }
                org.telegram.ui.Components.lc lcVar = this.e0;
                if (lcVar != null) {
                    lcVar.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f0 = false;
                    org.telegram.ui.Components.lc lcVar2 = this.e0;
                    if (lcVar2 != null) {
                        lcVar2.c(false);
                    }
                }
                return this.f0;
            }
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            org.telegram.ui.Components.lc lcVar3 = this.e0;
            if (lcVar3 != null) {
                lcVar3.c(false);
            }
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            evVar.X();
            this.h0 = !this.h0;
            evVar.u = true;
            evVar.Q();
            View view3 = evVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.r1 r1Var = evVar.E;
            org.telegram.ui.Cells.m1 m1Var = evVar.F;
            if (r1Var != null && m1Var != null) {
                m1Var.B1(r1Var, true, true);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.zt
    public final void d0() {
        super.d0();
        this.i0 = this.h0;
    }

    @Override // org.telegram.messenger.zt
    public final float z() {
        org.telegram.ui.Components.lc lcVar = this.e0;
        if (lcVar != null) {
            return lcVar.a(0.01f);
        }
        return 1.0f;
    }
}
