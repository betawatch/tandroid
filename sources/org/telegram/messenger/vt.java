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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class vt extends xt implements x5, cs {
    public final zi X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final mm0 a0;
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

    public vt(cv cvVar, Rect rect, int i3, TL_iv.pageBlockAudio pageblockaudio) {
        super(cvVar, rect, i3);
        this.b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f0 = L;
        int L2 = g0.L(9.0f);
        this.g0 = L2;
        int L3 = g0.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        zi ziVar = (zi) cvVar.m.get(pageblockaudio);
        this.X = ziVar;
        this.Y = ziVar != null ? ziVar.F0() : null;
        this.r0 = z5.q(cvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        mm0 mm0Var = new mm0(null);
        this.a0 = mm0Var;
        mm0Var.h = new p1(this, 14);
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        l0(true);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        return this.a0.e;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.a0.s = this.W;
        }
        l0(false);
        cv cvVar = this.a;
        int i3 = cvVar.a;
        int i10 = cvVar.a;
        hs.f(i3).c(this, hs.h2);
        hs.f(i10).c(this, hs.f2);
        hs.f(i10).c(this, hs.g2);
        hs.f(i10).c(this, hs.e2);
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        cv cvVar = this.a;
        z5.q(cvVar.a).v(this);
        int i3 = cvVar.a;
        hs.f(i3).n(this, hs.h2);
        hs.f(i3).n(this, hs.f2);
        hs.f(i3).n(this, hs.g2);
        hs.f(i3).n(this, hs.e2);
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i3 = this.l0;
        int i10 = this.c;
        cv cvVar = this.a;
        if (i3 != i10 + cvVar.S + cvVar.T || this.m0 != i0()) {
            k0();
        }
        canvas.save();
        canvas.translate(-cvVar.S, 0.0f);
        int i11 = cvVar.E() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We;
        int i12 = cvVar.E() ? org.telegram.ui.ActionBar.k6.Cc : org.telegram.ui.ActionBar.k6.Xe;
        int i13 = cvVar.E() ? org.telegram.ui.ActionBar.k6.Db : org.telegram.ui.ActionBar.k6.id;
        int i14 = cvVar.E() ? org.telegram.ui.ActionBar.k6.Eb : org.telegram.ui.ActionBar.k6.jd;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i11, i12, i13, i14);
        radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.rc : org.telegram.ui.ActionBar.k6.pe, cvVar.D);
        radialProgress2.draw(canvas);
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.kc : org.telegram.ui.ActionBar.k6.ie, cvVar.D);
        int w03 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.lc : org.telegram.ui.ActionBar.k6.je, cvVar.D);
        int w04 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, cvVar.D);
        int w05 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, cvVar.D);
        int w06 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.mc : org.telegram.ui.ActionBar.k6.ke, cvVar.D);
        mm0 mm0Var = this.a0;
        mm0Var.g(w02, w03, w04, w05, w06);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        mm0Var.b(canvas);
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
            if (cvVar.E()) {
                org.telegram.ui.ActionBar.e6 e6Var = cvVar.D;
                drawable = e6Var != null ? e6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.k6.c4;
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

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        cv cvVar = this.a;
        float f10 = x10 + cvVar.S;
        float y9 = motionEvent.getY();
        boolean contains = this.n0.contains(f10, y9);
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
                    cvVar.F.K(cvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (!this.a0.e(f10 - this.i0, y9 - this.j0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.o0 != -1) {
                    if (f10 >= this.f0 && f10 <= g0.L(48.0f) + r1) {
                        if (y9 >= this.g0 && y9 <= g0.L(48.0f) + r1) {
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
                    int i3 = cvVar.a;
                    int i10 = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i10 == 0) {
                        if (MediaController.B().o0(cvVar.l, this.X, 0L, false, null, 0L)) {
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
                        w7.G(i3).X(document, cvVar.b, 1, 1);
                        this.o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view6 = this.W;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (i10 == 3) {
                        w7.G(i3).f(document);
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        zi ziVar2 = this.X;
        if (ziVar2 == null) {
            return;
        }
        if (i3 == hs.h2) {
            l0(true);
            return;
        }
        if (i3 == hs.f2 || i3 == hs.g2) {
            l0(true);
            return;
        }
        if (i3 == hs.e2) {
            if (ziVar2.f1() != ((Integer) objArr[0]).intValue() || (ziVar = MediaController.B().v0) == null) {
                return;
            }
            ziVar2.b0 = ziVar.b0;
            ziVar2.g0 = ziVar.g0;
            ziVar2.h0 = ziVar.h0;
            m0();
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.r0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.Z.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        if (this.o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        cv cvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.Y == null || (q1Var = (cvVar = this.a).E) == null || (l1Var = cvVar.F) == null || !l1Var.b0(q1Var)) ? false : true;
    }

    public final int j0() {
        int i3 = this.o0;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return i3 == 3 ? 3 : 0;
    }

    public final void k0() {
        cv cvVar = this.a;
        this.l0 = this.c + cvVar.S + cvVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f0;
        int i3 = this.h0;
        int i10 = L + i3;
        this.i0 = i10;
        this.k0 = k2.p1.d(this.m0 ? 42.0f : 18.0f, this.l0 - i10, 0);
        zi ziVar = this.X;
        String x12 = ziVar != null ? ziVar.x1(false) : null;
        String z12 = ziVar != null ? ziVar.z1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i11 = this.g0;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.c0 = null;
            this.j0 = ((i3 - g0.L(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new o31(g0.o()), 0, x12.length(), 18);
            }
            this.b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = g0.L(11.0f) + ((i3 - g0.L(30.0f)) / 2) + i11;
        }
        this.a0.i(this.k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File K;
        int i3 = this.a.a;
        TLRPC.Document document = this.Y;
        String r5 = w7.r(null, document);
        if (document == null) {
            K = null;
        } else {
            w7.G(i3);
            K = w7.K(document, null, true, true);
        }
        boolean z11 = K != null && K.exists();
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        zi ziVar = this.X;
        if (z11) {
            z5.q(i3).v(this);
            if (!MediaController.B().I(ziVar) || MediaController.B().H()) {
                this.o0 = 0;
            } else {
                this.o0 = 1;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            z5.q(i3).a(r5, null, this);
            if (!az.B0 || ziVar == null || !ziVar.J3() || zi.S5(ziVar.k) || m5.C(zi.B0(ziVar.k))) {
                if (w7.G(i3).T(r5)) {
                    this.o0 = 3;
                    Float w10 = zb.D().w(r5);
                    radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                    radialProgress2.setIcon(j0(), true, z10);
                } else {
                    this.o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                }
            } else {
                this.o0 = (!MediaController.B().I(ziVar) || MediaController.B().H()) ? 0 : 1;
                radialProgress2.setIcon(j0(), false, z10);
            }
        }
        m0();
    }

    public final void m0() {
        zi ziVar;
        int i3;
        TLRPC.Document document = this.Y;
        if (document == null || (ziVar = this.X) == null) {
            return;
        }
        mm0 mm0Var = this.a0;
        if (!mm0Var.e) {
            mm0Var.h(ziVar.b0);
        }
        if (!MediaController.B().I(ziVar)) {
            int i10 = 0;
            while (true) {
                if (i10 >= document.attributes.size()) {
                    i3 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i3 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i3 = ziVar.g0;
        }
        String g02 = g0.g0(i3, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g02)) {
            this.e0 = g02;
            textPaint.setTextSize(g0.L(16.0f));
            this.d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        cv cvVar = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
