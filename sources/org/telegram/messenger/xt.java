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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class xt extends zt implements y5, fs {
    public final fj X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final vm0 a0;
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

    public xt(ev evVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(evVar, rect, i7);
        this.b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f0 = L;
        int L2 = g0.L(9.0f);
        this.g0 = L2;
        int L3 = g0.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        fj fjVar = (fj) evVar.m.get(pageblockaudio);
        this.X = fjVar;
        this.Y = fjVar != null ? fjVar.F0() : null;
        this.r0 = a6.q(evVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        vm0 vm0Var = new vm0(null);
        this.a0 = vm0Var;
        vm0Var.h = new j1(this, 16);
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        l0(true);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.zt
    public final boolean Q() {
        return this.a0.e;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.a0.s = this.W;
        }
        l0(false);
        ev evVar = this.a;
        int i7 = evVar.a;
        int i10 = evVar.a;
        ks.f(i7).c(this, ks.h2);
        ks.f(i10).c(this, ks.f2);
        ks.f(i10).c(this, ks.g2);
        ks.f(i10).c(this, ks.e2);
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        ev evVar = this.a;
        a6.q(evVar.a).v(this);
        int i7 = evVar.a;
        ks.f(i7).n(this, ks.h2);
        ks.f(i7).n(this, ks.f2);
        ks.f(i7).n(this, ks.g2);
        ks.f(i7).n(this, ks.e2);
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i7 = this.l0;
        int i10 = this.c;
        ev evVar = this.a;
        if (i7 != i10 + evVar.S + evVar.T || this.m0 != i0()) {
            k0();
        }
        canvas.save();
        canvas.translate(-evVar.S, 0.0f);
        int i11 = evVar.E() ? org.telegram.ui.ActionBar.n6.Ec : org.telegram.ui.ActionBar.n6.Ze;
        int i12 = evVar.E() ? org.telegram.ui.ActionBar.n6.Fc : org.telegram.ui.ActionBar.n6.af;
        int i13 = evVar.E() ? org.telegram.ui.ActionBar.n6.Gb : org.telegram.ui.ActionBar.n6.ld;
        int i14 = evVar.E() ? org.telegram.ui.ActionBar.n6.Hb : org.telegram.ui.ActionBar.n6.md;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i11, i12, i13, i14);
        radialProgress2.d = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.uc : org.telegram.ui.ActionBar.n6.se, evVar.D);
        radialProgress2.draw(canvas);
        int w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.nc : org.telegram.ui.ActionBar.n6.le, evVar.D);
        int w03 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.oc : org.telegram.ui.ActionBar.n6.me, evVar.D);
        int w04 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.qc : org.telegram.ui.ActionBar.n6.oe, evVar.D);
        int w05 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.qc : org.telegram.ui.ActionBar.n6.oe, evVar.D);
        int w06 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.pc : org.telegram.ui.ActionBar.n6.ne, evVar.D);
        vm0 vm0Var = this.a0;
        vm0Var.g(w02, w03, w04, w05, w06);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        vm0Var.b(canvas);
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
            if (evVar.E()) {
                org.telegram.ui.ActionBar.i6 i6Var = evVar.D;
                drawable = i6Var != null ? i6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.n6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.n6.c4;
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

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        ev evVar = this.a;
        float f10 = x10 + evVar.S;
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
                    evVar.F.N(evVar.E, document, F());
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
                    int i7 = evVar.a;
                    int i10 = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i10 == 0) {
                        if (MediaController.B().o0(evVar.l, this.X, 0L, false, null, 0L)) {
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
                        w7.G(i7).W(document, evVar.b, 1, 1);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        fj fjVar2 = this.X;
        if (fjVar2 == null) {
            return;
        }
        if (i7 == ks.h2) {
            l0(true);
            return;
        }
        if (i7 == ks.f2 || i7 == ks.g2) {
            l0(true);
            return;
        }
        if (i7 == ks.e2) {
            if (fjVar2.e1() != ((Integer) objArr[0]).intValue() || (fjVar = MediaController.B().v0) == null) {
                return;
            }
            fjVar2.b0 = fjVar.b0;
            fjVar2.i0 = fjVar.i0;
            fjVar2.j0 = fjVar.j0;
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
        ev evVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        return (this.Y == null || (r1Var = (evVar = this.a).E) == null || (m1Var = evVar.F) == null || !m1Var.d0(r1Var)) ? false : true;
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
        ev evVar = this.a;
        this.l0 = this.c + evVar.S + evVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f0;
        int i7 = this.h0;
        int i10 = L + i7;
        this.i0 = i10;
        this.k0 = i5.c.d(this.m0 ? 42.0f : 18.0f, this.l0 - i10, 0);
        fj fjVar = this.X;
        String w12 = fjVar != null ? fjVar.w1(false) : null;
        String y12 = fjVar != null ? fjVar.y1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(y12);
        int i11 = this.g0;
        if (isEmpty && TextUtils.isEmpty(w12)) {
            this.c0 = null;
            this.j0 = ((i7 - g0.L(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y12) || TextUtils.isEmpty(w12)) ? !TextUtils.isEmpty(y12) ? new SpannableStringBuilder(y12) : new SpannableStringBuilder(w12) : new SpannableStringBuilder(a8.p0.E(w12, " - ", y12));
            if (!TextUtils.isEmpty(w12)) {
                spannableStringBuilder.setSpan(new i41(g0.o()), 0, w12.length(), 18);
            }
            this.b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.n6.O2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        fj fjVar = this.X;
        if (z11) {
            a6.q(i7).v(this);
            if (!MediaController.B().I(fjVar) || MediaController.B().H()) {
                this.o0 = 0;
            } else {
                this.o0 = 1;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            a6.q(i7).a(r10, null, this);
            if (!bz.B0 || fjVar == null || !fjVar.I3() || fj.R5(fjVar.k) || n5.C(fj.B0(fjVar.k))) {
                if (w7.G(i7).S(r10)) {
                    this.o0 = 3;
                    Float w10 = ec.D().w(r10);
                    radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                    radialProgress2.setIcon(j0(), true, z10);
                } else {
                    this.o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                }
            } else {
                this.o0 = (!MediaController.B().I(fjVar) || MediaController.B().H()) ? 0 : 1;
                radialProgress2.setIcon(j0(), false, z10);
            }
        }
        m0();
    }

    public final void m0() {
        fj fjVar;
        int i7;
        TLRPC.Document document = this.Y;
        if (document == null || (fjVar = this.X) == null) {
            return;
        }
        vm0 vm0Var = this.a0;
        if (!vm0Var.e) {
            vm0Var.h(fjVar.b0);
        }
        if (!MediaController.B().I(fjVar)) {
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
            i7 = fjVar.i0;
        }
        String g02 = g0.g0(i7, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g02)) {
            this.e0 = g02;
            textPaint.setTextSize(g0.L(16.0f));
            this.d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        ev evVar = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
