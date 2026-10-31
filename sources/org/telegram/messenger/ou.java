package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ou extends qu implements z5, us {
    public final jj W;
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final kn0 Z;
    public final TextPaint a0;
    public StaticLayout b0;
    public StaticLayout c0;
    public String d0;
    public final int e0;
    public final int f0;
    public final int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final int n0;

    public ou(vv vvVar, Rect rect, int i10, TL_iv.pageBlockAudio pageblockaudio) {
        super(vvVar, rect, i10);
        this.a0 = new TextPaint(1);
        int L = i0.L(16.0f);
        this.e0 = L;
        int L2 = i0.L(9.0f);
        this.f0 = L2;
        int L3 = i0.L(44.0f);
        this.g0 = L3;
        this.k0 = -1;
        jj jjVar = (jj) vvVar.m.get(pageblockaudio);
        this.W = jjVar;
        this.X = jjVar != null ? jjVar.F0() : null;
        this.n0 = b6.q(vvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        kn0 kn0Var = new kn0(null);
        this.Z = kn0Var;
        kn0Var.h = new s1(this, 14);
        i0();
        j0(false);
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        j0(true);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return i0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.Y.p(true, 1.0f);
        j0(true);
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        return this.Z.e;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        View view = this.V;
        if (view != null) {
            this.Y.n(view);
            this.Z.s = this.V;
        }
        j0(false);
        vv vvVar = this.a;
        int i10 = vvVar.a;
        int i11 = vvVar.a;
        zs.f(i10).c(this, zs.h2);
        zs.f(i11).c(this, zs.f2);
        zs.f(i11).c(this, zs.g2);
        zs.f(i11).c(this, zs.e2);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        vv vvVar = this.a;
        b6.q(vvVar.a).v(this);
        int i10 = vvVar.a;
        zs.f(i10).n(this, zs.h2);
        zs.f(i10).n(this, zs.f2);
        zs.f(i10).n(this, zs.g2);
        zs.f(i10).n(this, zs.e2);
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        if (this.W == null || this.X == null) {
            return;
        }
        int i10 = this.k0;
        int i11 = this.c;
        vv vvVar = this.a;
        if (i10 != i11 + vvVar.S + vvVar.T) {
            i0();
        }
        canvas.save();
        canvas.translate(-vvVar.S, 0.0f);
        int i12 = vvVar.E() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We;
        int i13 = vvVar.E() ? org.telegram.ui.ActionBar.t6.Cc : org.telegram.ui.ActionBar.t6.Xe;
        int i14 = vvVar.E() ? org.telegram.ui.ActionBar.t6.Db : org.telegram.ui.ActionBar.t6.id;
        int i15 = vvVar.E() ? org.telegram.ui.ActionBar.t6.Eb : org.telegram.ui.ActionBar.t6.jd;
        RadialProgress2 radialProgress2 = this.Y;
        radialProgress2.g(i12, i13, i14, i15);
        radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.rc : org.telegram.ui.ActionBar.t6.pe, vvVar.D);
        radialProgress2.draw(canvas);
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.kc : org.telegram.ui.ActionBar.t6.ie, vvVar.D);
        int w03 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.lc : org.telegram.ui.ActionBar.t6.je, vvVar.D);
        int w04 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le, vvVar.D);
        int w05 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le, vvVar.D);
        int w06 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.mc : org.telegram.ui.ActionBar.t6.ke, vvVar.D);
        kn0 kn0Var = this.Z;
        kn0Var.g(w02, w03, w04, w05, w06);
        canvas.save();
        canvas.translate(this.h0, this.i0);
        kn0Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.c0;
        int i16 = this.e0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(i0.L(54.0f) + i16, i0.L(6.0f) + this.i0);
            this.c0.draw(canvas);
            canvas.restore();
        }
        if (this.b0 != null) {
            canvas.save();
            canvas.translate(i0.L(54.0f) + i16, this.i0 - i0.L(16.0f));
            this.b0.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        vv vvVar = this.a;
        float f7 = x10 + vvVar.S;
        float y3 = motionEvent.getY();
        if (!this.Z.e(f7 - this.h0, y3 - this.i0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.l0 != -1) {
                    if (f7 >= this.e0 && f7 <= i0.L(48.0f) + r0) {
                        if (y3 >= this.f0 && y3 <= i0.L(48.0f) + r0) {
                            this.m0 = true;
                            View view = this.V;
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        }
                    }
                }
                return this.m0;
            }
            if (actionMasked == 1) {
                if (this.m0) {
                    this.m0 = false;
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    int i10 = vvVar.a;
                    int i11 = this.l0;
                    RadialProgress2 radialProgress2 = this.Y;
                    if (i11 == 0) {
                        if (MediaController.B().o0(vvVar.l, this.W, 0L, false, null)) {
                            this.l0 = 1;
                            radialProgress2.setIcon(h0(), false, true);
                            View view3 = this.V;
                            if (view3 != null) {
                                view3.invalidate();
                            }
                        }
                    } else if (i11 != 1) {
                        TLRPC.Document document = this.X;
                        if (i11 == 2) {
                            radialProgress2.p(false, 0.0f);
                            b8.G(i10).X(document, vvVar.b, 1, 1);
                            this.l0 = 3;
                            radialProgress2.setIcon(h0(), true, true);
                            View view4 = this.V;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        } else if (i11 == 3) {
                            b8.G(i10).f(document);
                            this.l0 = 2;
                            radialProgress2.setIcon(h0(), false, true);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (MediaController.B().R(this.W, true)) {
                        this.l0 = 0;
                        radialProgress2.setIcon(h0(), false, true);
                        View view6 = this.V;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    }
                    View view7 = this.V;
                    if (view7 != null) {
                        view7.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.m0 = false;
            }
            return this.m0;
        }
        if (actionMasked == 0) {
            Z(true);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            Z(false);
        }
        View view8 = this.V;
        if (view8 != null) {
            view8.invalidate();
            return true;
        }
        return true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        jj jjVar2 = this.W;
        if (jjVar2 == null) {
            return;
        }
        if (i10 == zs.h2) {
            j0(true);
            return;
        }
        if (i10 == zs.f2 || i10 == zs.g2) {
            j0(true);
            return;
        }
        if (i10 == zs.e2) {
            if (jjVar2.f1() != ((Integer) objArr[0]).intValue() || (jjVar = MediaController.B().u0) == null) {
                return;
            }
            jjVar2.b0 = jjVar.b0;
            jjVar2.g0 = jjVar.g0;
            jjVar2.h0 = jjVar.h0;
            k0();
        }
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.n0;
    }

    public final int h0() {
        int i10 = this.l0;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.Y.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        if (this.l0 != 3) {
            j0(true);
        }
    }

    public final void i0() {
        vv vvVar = this.a;
        this.k0 = this.c + vvVar.S + vvVar.T;
        int L = i0.L(50.0f) + this.e0;
        int i10 = this.g0;
        int i11 = L + i10;
        this.h0 = i11;
        this.j0 = i0.a.d(18.0f, this.k0 - i11, 0);
        jj jjVar = this.W;
        String x12 = jjVar != null ? jjVar.x1(false) : null;
        String z12 = jjVar != null ? jjVar.z1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i12 = this.f0;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.b0 = null;
            this.i0 = ((i10 - i0.L(30.0f)) / 2) + i12;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new x41(i0.o()), 0, x12.length(), 18);
            }
            this.a0.setTextSize(i0.L(16.0f));
            int L2 = i0.L(50.0f) + this.j0;
            this.b0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.t6.O2, L2, TextUtils.TruncateAt.END), this.a0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.i0 = i0.L(11.0f) + ((i10 - i0.L(30.0f)) / 2) + i12;
        }
        this.Z.i(this.j0, i0.L(30.0f));
    }

    public final void j0(boolean z10) {
        File K;
        int i10 = this.a.a;
        TLRPC.Document document = this.X;
        String r10 = b8.r(null, document);
        if (document == null) {
            K = null;
        } else {
            b8.G(i10);
            K = b8.K(document, null, true, true);
        }
        boolean z11 = K != null && K.exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Y;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        jj jjVar = this.W;
        if (z11) {
            b6.q(i10).v(this);
            if (!MediaController.B().I(jjVar) || MediaController.B().H()) {
                this.l0 = 0;
            } else {
                this.l0 = 1;
            }
            radialProgress2.setIcon(h0(), false, z10);
        } else {
            b6.q(i10).a(r10, null, this);
            if (!tz.B0 || jjVar == null || !jjVar.I3() || jj.Q5(jjVar.k) || o5.C(jj.B0(jjVar.k))) {
                if (b8.G(i10).T(r10)) {
                    this.l0 = 3;
                    Float w9 = hc.D().w(r10);
                    radialProgress2.p(z10, w9 != null ? w9.floatValue() : 0.0f);
                    radialProgress2.setIcon(h0(), true, z10);
                } else {
                    this.l0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(h0(), false, z10);
                }
            } else {
                this.l0 = (!MediaController.B().I(jjVar) || MediaController.B().H()) ? 0 : 1;
                radialProgress2.setIcon(h0(), false, z10);
            }
        }
        k0();
    }

    public final void k0() {
        jj jjVar;
        int i10;
        TLRPC.Document document = this.X;
        if (document == null || (jjVar = this.W) == null) {
            return;
        }
        kn0 kn0Var = this.Z;
        if (!kn0Var.e) {
            kn0Var.h(jjVar.b0);
        }
        if (!MediaController.B().I(jjVar)) {
            int i11 = 0;
            while (true) {
                if (i11 >= document.attributes.size()) {
                    i10 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = jjVar.g0;
        }
        String g02 = i0.g0(i10, false, false);
        String str = this.d0;
        TextPaint textPaint = this.a0;
        if (str == null || !str.equals(g02)) {
            this.d0 = g02;
            textPaint.setTextSize(i0.L(16.0f));
            this.c0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        vv vvVar = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D));
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
