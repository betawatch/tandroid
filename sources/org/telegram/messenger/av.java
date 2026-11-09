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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class av extends zu {
    public h6.m c0;
    public org.telegram.ui.Components.ic d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public float i0;
    public int j0;
    public final Drawable k0;
    public int l0;

    public av(kv kvVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7, spannableStringBuilder);
        this.k0 = jg.g.h(t0.b, R.drawable.arrow_more);
        boolean z9 = pageblockblockquote.collapsed;
        this.g0 = z9;
        this.h0 = z9;
    }

    @Override // org.telegram.messenger.zu, org.telegram.messenger.fu
    public final int I() {
        if (!this.g0) {
            return super.I();
        }
        Rect rect = this.b;
        return (int) Math.min((this.W.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.Z + rect.bottom, super.I());
    }

    @Override // org.telegram.messenger.zu, org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.ic icVar = this.d0;
        float a10 = icVar != null ? icVar.a(0.01f) : 1.0f;
        int i7 = this.c;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, i7 / 2.0f, I() / 2.0f);
        }
        boolean z9 = this.i0 > 0.0f;
        int i10 = (this.j0 - this.b.bottom) - this.a0;
        canvas.save();
        canvas.clipRect(0, 0, i7, i10);
        if (z9) {
            canvas.saveLayer(0.0f, 0.0f, i7, i10, null);
        }
        super.W(canvas);
        if (z9) {
            if (this.c0 == null) {
                this.c0 = new h6.m(28);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i10 - g0.L(24.0f), i7, i10 + 1);
            this.c0.m(canvas, rectF, 3, this.i0);
            canvas.restore();
        }
        canvas.restore();
        kv kvVar = this.a;
        int i11 = kvVar.y.i();
        int i12 = this.l0;
        Drawable drawable = this.k0;
        if (i11 != i12) {
            int i13 = kvVar.y.i();
            this.l0 = i13;
            drawable.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
        }
        bg.s.e(this.k0, kvVar.C - g0.L(24.0f), g0.L(8.0f) + ((i10 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.i0, qs.K2, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.zu, org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f0 = false;
            }
            return super.Y(motionEvent);
        }
        kv kvVar = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f0 = Y;
            if (!Y) {
                this.e0 = true;
                if (this.d0 == null && (view = kvVar.Q) != null) {
                    this.d0 = new org.telegram.ui.Components.ic(view);
                }
                org.telegram.ui.Components.ic icVar = this.d0;
                if (icVar != null) {
                    icVar.c(true);
                    return true;
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.e0 = false;
                    org.telegram.ui.Components.ic icVar2 = this.d0;
                    if (icVar2 != null) {
                        icVar2.c(false);
                    }
                }
                return this.e0;
            }
            if (!this.e0) {
                return false;
            }
            this.e0 = false;
            org.telegram.ui.Components.ic icVar3 = this.d0;
            if (icVar3 != null) {
                icVar3.c(false);
            }
            View view2 = kvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            kvVar.X();
            this.g0 = !this.g0;
            kvVar.u = true;
            kvVar.Q();
            View view3 = kvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = kvVar.E;
            org.telegram.ui.Cells.l1 l1Var = kvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.q1(q1Var, true, true);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final void d0() {
        super.d0();
        this.h0 = this.g0;
    }

    @Override // org.telegram.messenger.fu
    public final float z() {
        org.telegram.ui.Components.ic icVar = this.d0;
        if (icVar != null) {
            return icVar.a(0.01f);
        }
        return 1.0f;
    }
}
