package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ym0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class yt extends au implements y5, gs {
    public final gj X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final ym0 a0;
    public final TextPaint b0;
    public StaticLayout c0;
    public StaticLayout d0;
    public String e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final RectF n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final int r0;

    public yt(fv fvVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(fvVar, rect, i7);
        this.b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f0 = L;
        int L2 = g0.L(9.0f);
        this.g0 = L2;
        int L3 = g0.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        gj gjVar = (gj) fvVar.m.get(pageblockaudio);
        this.X = gjVar;
        this.Y = gjVar != null ? gjVar.F0() : null;
        this.r0 = a6.q(fvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        ym0 ym0Var = new ym0(null);
        this.a0 = ym0Var;
        ym0Var.h = new j1(this, 16);
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        l0(true);
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.au
    public final boolean Q() {
        return this.a0.e;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.a0.s = this.W;
        }
        l0(false);
        fv fvVar = this.a;
        int i7 = fvVar.a;
        int i10 = fvVar.a;
        ls.f(i7).c(this, ls.h2);
        ls.f(i10).c(this, ls.f2);
        ls.f(i10).c(this, ls.g2);
        ls.f(i10).c(this, ls.e2);
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        fv fvVar = this.a;
        a6.q(fvVar.a).v(this);
        int i7 = fvVar.a;
        ls.f(i7).n(this, ls.h2);
        ls.f(i7).n(this, ls.f2);
        ls.f(i7).n(this, ls.g2);
        ls.f(i7).n(this, ls.e2);
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i7 = this.l0;
        int i10 = this.c;
        fv fvVar = this.a;
        if (i7 != i10 + fvVar.S + fvVar.T || this.m0 != i0()) {
            k0();
        }
        canvas.save();
        canvas.translate(-fvVar.S, 0.0f);
        int i11 = fvVar.E() ? org.telegram.ui.ActionBar.m6.Ec : org.telegram.ui.ActionBar.m6.Ze;
        int i12 = fvVar.E() ? org.telegram.ui.ActionBar.m6.Fc : org.telegram.ui.ActionBar.m6.af;
        int i13 = fvVar.E() ? org.telegram.ui.ActionBar.m6.Gb : org.telegram.ui.ActionBar.m6.ld;
        int i14 = fvVar.E() ? org.telegram.ui.ActionBar.m6.Hb : org.telegram.ui.ActionBar.m6.md;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i11, i12, i13, i14);
        radialProgress2.d = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.uc : org.telegram.ui.ActionBar.m6.se, fvVar.D);
        radialProgress2.draw(canvas);
        int w02 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.nc : org.telegram.ui.ActionBar.m6.le, fvVar.D);
        int w03 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.oc : org.telegram.ui.ActionBar.m6.me, fvVar.D);
        int w04 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.qc : org.telegram.ui.ActionBar.m6.oe, fvVar.D);
        int w05 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.qc : org.telegram.ui.ActionBar.m6.oe, fvVar.D);
        int w06 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.pc : org.telegram.ui.ActionBar.m6.ne, fvVar.D);
        ym0 ym0Var = this.a0;
        ym0Var.g(w02, w03, w04, w05, w06);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        ym0Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.d0;
        int i15 = this.f0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(g0.L(54.0f) + i15, g0.L(6.0f) + this.j0);
            this.d0.draw(canvas);
            canvas.restore();
        }
        if (this.c0 != null) {
            canvas.save();
            canvas.translate(g0.L(54.0f) + i15, this.j0 - g0.L(16.0f));
            this.c0.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.m0;
        RectF rectF = this.n0;
        if (z10) {
            if (fvVar.E()) {
                org.telegram.ui.ActionBar.h6 h6Var = fvVar.D;
                drawable = h6Var != null ? h6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.m6.c4;
            }
            int L = (this.l0 + this.b.right) - g0.L(32.0f);
            int L2 = g0.L(7.0f);
            drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
            drawable.draw(canvas);
            rectF.set(L - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L, g0.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        fv fvVar = this.a;
        float f10 = x10 + fvVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.n0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.q0 = true;
            return true;
        }
        boolean z10 = this.q0;
        TLRPC.Document document = this.Y;
        if (z10) {
            if (actionMasked == 2 && !contains) {
                this.q0 = false;
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z11 = actionMasked == 1 && contains;
                this.q0 = false;
                if (z11 && i0()) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    fvVar.F.N(fvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (!this.a0.e(f10 - this.i0, y10 - this.j0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.o0 != -1) {
                    if (f10 >= this.f0 && f10 <= g0.L(48.0f) + r1) {
                        if (y10 >= this.g0 && y10 <= g0.L(48.0f) + r1) {
                            this.p0 = true;
                            View view2 = this.W;
                            if (view2 != null) {
                                view2.invalidate();
                                return true;
                            }
                        }
                    }
                }
                return this.p0;
            }
            if (actionMasked == 1) {
                if (this.p0) {
                    this.p0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    int i7 = fvVar.a;
                    int i10 = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i10 == 0) {
                        if (MediaController.B().o0(fvVar.l, this.X, 0L, false, null, 0L)) {
                            this.o0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (i10 == 1) {
                        if (MediaController.B().R(this.X, true)) {
                            this.o0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i10 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i7).W(document, fvVar.b, 1, 1);
                        this.o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view6 = this.W;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (i10 == 3) {
                        w7.G(i7).f(document);
                        this.o0 = 2;
                        radialProgress2.setIcon(j0(), false, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    }
                    View view8 = this.W;
                    if (view8 != null) {
                        view8.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.p0 = false;
            }
            return this.p0;
        }
        if (actionMasked == 0) {
            a0(true);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            a0(false);
        }
        View view9 = this.W;
        if (view9 != null) {
            view9.invalidate();
            return true;
        }
        return true;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        gj gjVar2 = this.X;
        if (gjVar2 == null) {
            return;
        }
        if (i7 == ls.h2) {
            l0(true);
            return;
        }
        if (i7 == ls.f2 || i7 == ls.g2) {
            l0(true);
            return;
        }
        if (i7 == ls.e2) {
            if (gjVar2.e1() != ((Integer) objArr[0]).intValue() || (gjVar = MediaController.B().v0) == null) {
                return;
            }
            gjVar2.b0 = gjVar.b0;
            gjVar2.i0 = gjVar.i0;
            gjVar2.j0 = gjVar.j0;
            m0();
        }
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.r0;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.Z.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        if (this.o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        fv fvVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        return (this.Y == null || (r1Var = (fvVar = this.a).E) == null || (m1Var = fvVar.F) == null || !m1Var.d0(r1Var)) ? false : true;
    }

    public final int j0() {
        int i7 = this.o0;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 3 ? 3 : 0;
    }

    public final void k0() {
        fv fvVar = this.a;
        this.l0 = this.c + fvVar.S + fvVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f0;
        int i7 = this.h0;
        int i10 = L + i7;
        this.i0 = i10;
        this.k0 = i5.c.d(this.m0 ? 42.0f : 18.0f, this.l0 - i10, 0);
        gj gjVar = this.X;
        String w12 = gjVar != null ? gjVar.w1(false) : null;
        String y12 = gjVar != null ? gjVar.y1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(y12);
        int i11 = this.g0;
        if (isEmpty && TextUtils.isEmpty(w12)) {
            this.c0 = null;
            this.j0 = ((i7 - g0.L(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y12) || TextUtils.isEmpty(w12)) ? !TextUtils.isEmpty(y12) ? new SpannableStringBuilder(y12) : new SpannableStringBuilder(w12) : new SpannableStringBuilder(a8.p0.E(w12, " - ", y12));
            if (!TextUtils.isEmpty(w12)) {
                spannableStringBuilder.setSpan(new l41(g0.o()), 0, w12.length(), 18);
            }
            this.b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.m6.O2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i11;
        }
        this.a0.i(this.k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File J;
        int i7 = this.a.a;
        TLRPC.Document document = this.Y;
        String r10 = w7.r(null, document);
        if (document == null) {
            J = null;
        } else {
            w7.G(i7);
            J = w7.J(document, null, true, true);
        }
        boolean z11 = J != null && J.exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        gj gjVar = this.X;
        if (z11) {
            a6.q(i7).v(this);
            if (!MediaController.B().I(gjVar) || MediaController.B().H()) {
                this.o0 = 0;
            } else {
                this.o0 = 1;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            a6.q(i7).a(r10, null, this);
            if (!cz.B0 || gjVar == null || !gjVar.I3() || gj.R5(gjVar.k) || n5.C(gj.B0(gjVar.k))) {
                if (w7.G(i7).S(r10)) {
                    this.o0 = 3;
                    Float w10 = fc.D().w(r10);
                    radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                    radialProgress2.setIcon(j0(), true, z10);
                } else {
                    this.o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                }
            } else {
                this.o0 = (!MediaController.B().I(gjVar) || MediaController.B().H()) ? 0 : 1;
                radialProgress2.setIcon(j0(), false, z10);
            }
        }
        m0();
    }

    public final void m0() {
        gj gjVar;
        int i7;
        TLRPC.Document document = this.Y;
        if (document == null || (gjVar = this.X) == null) {
            return;
        }
        ym0 ym0Var = this.a0;
        if (!ym0Var.e) {
            ym0Var.h(gjVar.b0);
        }
        if (!MediaController.B().I(gjVar)) {
            int i10 = 0;
            while (true) {
                if (i10 >= document.attributes.size()) {
                    i7 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i7 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i7 = gjVar.i0;
        }
        String g02 = g0.g0(i7, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g02)) {
            this.e0 = g02;
            textPaint.setTextSize(g0.L(16.0f));
            this.d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        fv fvVar = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.Wc : org.telegram.ui.ActionBar.m6.Vc, fvVar.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
