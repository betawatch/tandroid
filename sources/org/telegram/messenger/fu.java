package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class fu extends zt {
    public final TL_iv.pageBlockDetails X;
    public final dv Y;
    public final dv[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public org.telegram.ui.Components.mc c0;
    public boolean d0;
    public float e0;
    public float f0;

    public fu(ev evVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        dv dvVar = new dv(evVar, spannableStringBuilder, i5.c.d(16.0f, this.c - g0.L(53.0f), 0));
        this.Y = dvVar;
        this.Z = new dv[]{dvVar};
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.m6.w0(evVar.E() ? org.telegram.ui.ActionBar.m6.vl : org.telegram.ui.ActionBar.m6.ul, evVar.D));
        this.a0 = animatedArrowDrawable;
        animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
    }

    @Override // org.telegram.messenger.zt
    public final void A(int i7, Rect rect) {
        int i10 = (int) this.N;
        Rect rect2 = this.b;
        int i11 = i10 + rect2.top;
        int i12 = rect2.left;
        ev evVar = this.a;
        rect.set(i12 - evVar.S, i11, (evVar.C + evVar.T) - rect2.right, i0() + i11);
    }

    @Override // org.telegram.messenger.zt
    public final int B() {
        return 1;
    }

    @Override // org.telegram.messenger.zt
    public final CharSequence D() {
        return gd.N0(this.X.open ? 2131754882 : 2131754892, null);
    }

    @Override // org.telegram.messenger.zt
    public final CharSequence E(int i7) {
        StaticLayout staticLayout;
        dv dvVar = this.Y;
        CharSequence h02 = (dvVar == null || (staticLayout = dvVar.b) == null) ? null : zt.h0(staticLayout.getText());
        return TextUtils.concat(gd.N0(2131753984, null), ", ", gd.N0(this.X.open ? 2131754882 : 2131754892, null), TextUtils.isEmpty(h02) ? "" : TextUtils.concat(", ", h02));
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        this.Y.i(this.W);
    }

    @Override // org.telegram.messenger.zt
    public final boolean U(int i7, View view) {
        j0();
        return true;
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        this.Y.f(this.W);
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        org.telegram.ui.Components.mc mcVar = this.c0;
        float a10 = mcVar != null ? mcVar.a(0.02f) : 1.0f;
        ev evVar = this.a;
        float f10 = -evVar.S;
        int i7 = evVar.C + evVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (a10 != 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, (f10 + f11) / 2.0f, i0() / 2.0f);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(evVar.E() ? org.telegram.ui.ActionBar.m6.vl : org.telegram.ui.ActionBar.m6.ul, evVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f10, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f10, g0.L(14.0f));
        dv dvVar = this.Y;
        dvVar.d(canvas, dvVar.T);
        canvas.restore();
        if (a10 != 1.0f) {
            canvas.restore();
        }
        if (this.X.open || evVar.s) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(evVar.E() ? org.telegram.ui.ActionBar.m6.xl : org.telegram.ui.ActionBar.m6.wl, evVar.D);
        Paint paint = this.b0;
        paint.setColor(w03);
        canvas.drawRect(f10, i0() - 1.0f, f11, i0(), paint);
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        ev evVar = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            if (this.c0 == null && (view = evVar.Q) != null) {
                this.c0 = new org.telegram.ui.Components.mc(view);
            }
            org.telegram.ui.Components.mc mcVar = this.c0;
            if (mcVar != null) {
                mcVar.c(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.d0 = false;
                org.telegram.ui.Components.mc mcVar2 = this.c0;
                if (mcVar2 != null) {
                    mcVar2.c(false);
                }
            }
            return this.d0;
        }
        if (!this.d0) {
            return false;
        }
        this.d0 = false;
        org.telegram.ui.Components.mc mcVar3 = this.c0;
        if (mcVar3 != null) {
            mcVar3.c(false);
        }
        View view2 = evVar.Q;
        if (view2 != null) {
            view2.playSoundEffect(0);
        }
        j0();
        return true;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.a.S);
        dv dvVar = this.Y;
        dvVar.c = L - dvVar.f;
        dvVar.d = g0.L(14.0f) + i10;
        dvVar.e = i11;
    }

    public final int i0() {
        return f3.b(12.66f, this.Y.b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        ev evVar = this.a;
        evVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        this.a0.a(!z10 ? 0.0f : 1.0f);
        evVar.s = true;
        evVar.Q();
        View view = evVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        org.telegram.ui.Cells.m1 m1Var = evVar.F;
        if (r1Var == null || m1Var == null) {
            return;
        }
        m1Var.B1(r1Var, true, true);
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override // org.telegram.messenger.zt
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        if (!this.Y.o(characterStyle, qtVar)) {
            return false;
        }
        Rect rect = this.b;
        qtVar.e = (g0.L(53.0f) + (rect.left - this.a.S)) - r0.f;
        qtVar.f = g0.L(14.0f) + i7 + rect.top;
        return true;
    }
}
