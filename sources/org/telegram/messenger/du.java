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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class du extends fu implements x5, ls {
    public final ij W;
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final jm0 Z;
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
    public boolean l0;
    public final RectF m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public final int q0;

    public du(kv kvVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(kvVar, rect, i7);
        this.a0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.e0 = L;
        int L2 = g0.L(9.0f);
        this.f0 = L2;
        int L3 = g0.L(44.0f);
        this.g0 = L3;
        this.k0 = -1;
        this.m0 = new RectF();
        ij ijVar = (ij) kvVar.m.get(pageblockaudio);
        this.W = ijVar;
        this.X = ijVar != null ? ijVar.F0() : null;
        this.q0 = z5.q(kvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        jm0 jm0Var = new jm0(null);
        this.Z = jm0Var;
        jm0Var.h = new p1(this, 15);
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        l0(true);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.Y.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        return this.Z.e;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        View view = this.V;
        if (view != null) {
            this.Y.n(view);
            this.Z.s = this.V;
        }
        l0(false);
        kv kvVar = this.a;
        int i7 = kvVar.a;
        int i10 = kvVar.a;
        qs.f(i7).c(this, qs.h2);
        qs.f(i10).c(this, qs.f2);
        qs.f(i10).c(this, qs.g2);
        qs.f(i10).c(this, qs.e2);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        kv kvVar = this.a;
        z5.q(kvVar.a).v(this);
        int i7 = kvVar.a;
        qs.f(i7).n(this, qs.h2);
        qs.f(i7).n(this, qs.f2);
        qs.f(i7).n(this, qs.g2);
        qs.f(i7).n(this, qs.e2);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        Drawable drawable;
        if (this.W == null || this.X == null) {
            return;
        }
        int i7 = this.k0;
        int i10 = this.c;
        kv kvVar = this.a;
        if (i7 != i10 + kvVar.S + kvVar.T || this.l0 != i0()) {
            k0();
        }
        canvas.save();
        canvas.translate(-kvVar.S, 0.0f);
        int i11 = kvVar.E() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We;
        int i12 = kvVar.E() ? org.telegram.ui.ActionBar.k6.Cc : org.telegram.ui.ActionBar.k6.Xe;
        int i13 = kvVar.E() ? org.telegram.ui.ActionBar.k6.Db : org.telegram.ui.ActionBar.k6.id;
        int i14 = kvVar.E() ? org.telegram.ui.ActionBar.k6.Eb : org.telegram.ui.ActionBar.k6.jd;
        RadialProgress2 radialProgress2 = this.Y;
        radialProgress2.g(i11, i12, i13, i14);
        radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.rc : org.telegram.ui.ActionBar.k6.pe, kvVar.D);
        radialProgress2.draw(canvas);
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.kc : org.telegram.ui.ActionBar.k6.ie, kvVar.D);
        int w03 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.lc : org.telegram.ui.ActionBar.k6.je, kvVar.D);
        int w04 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, kvVar.D);
        int w05 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, kvVar.D);
        int w06 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.mc : org.telegram.ui.ActionBar.k6.ke, kvVar.D);
        jm0 jm0Var = this.Z;
        jm0Var.g(w02, w03, w04, w05, w06);
        canvas.save();
        canvas.translate(this.h0, this.i0);
        jm0Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.c0;
        int i15 = this.e0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(g0.L(54.0f) + i15, g0.L(6.0f) + this.i0);
            this.c0.draw(canvas);
            canvas.restore();
        }
        if (this.b0 != null) {
            canvas.save();
            canvas.translate(g0.L(54.0f) + i15, this.i0 - g0.L(16.0f));
            this.b0.draw(canvas);
            canvas.restore();
        }
        boolean z9 = this.l0;
        RectF rectF = this.m0;
        if (z9) {
            if (kvVar.E()) {
                org.telegram.ui.ActionBar.f6 f6Var = kvVar.D;
                drawable = f6Var != null ? f6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.k6.c4;
            }
            int L = (this.k0 + this.b.right) - g0.L(32.0f);
            int L2 = g0.L(7.0f);
            drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
            drawable.draw(canvas);
            rectF.set(L - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L, g0.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        kv kvVar = this.a;
        float f10 = x10 + kvVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.m0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.p0 = true;
            return true;
        }
        boolean z9 = this.p0;
        TLRPC.Document document = this.X;
        if (z9) {
            if (actionMasked == 2 && !contains) {
                this.p0 = false;
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z10 = actionMasked == 1 && contains;
                this.p0 = false;
                if (z10 && i0()) {
                    View view = this.V;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    kvVar.F.K(kvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (!this.Z.e(f10 - this.h0, y10 - this.i0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.n0 != -1) {
                    if (f10 >= this.e0 && f10 <= g0.L(48.0f) + r1) {
                        if (y10 >= this.f0 && y10 <= g0.L(48.0f) + r1) {
                            this.o0 = true;
                            View view2 = this.V;
                            if (view2 != null) {
                                view2.invalidate();
                                return true;
                            }
                        }
                    }
                }
                return this.o0;
            }
            if (actionMasked == 1) {
                if (this.o0) {
                    this.o0 = false;
                    View view3 = this.V;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    int i7 = kvVar.a;
                    int i10 = this.n0;
                    RadialProgress2 radialProgress2 = this.Y;
                    if (i10 == 0) {
                        if (MediaController.B().o0(kvVar.l, this.W, 0L, false, null, 0L)) {
                            this.n0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view4 = this.V;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (i10 == 1) {
                        if (MediaController.B().R(this.W, true)) {
                            this.n0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i10 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i7).X(document, kvVar.b, 1, 1);
                        this.n0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view6 = this.V;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (i10 == 3) {
                        w7.G(i7).f(document);
                        this.n0 = 2;
                        radialProgress2.setIcon(j0(), false, true);
                        View view7 = this.V;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    }
                    View view8 = this.V;
                    if (view8 != null) {
                        view8.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.o0 = false;
            }
            return this.o0;
        }
        if (actionMasked == 0) {
            a0(true);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            a0(false);
        }
        View view9 = this.V;
        if (view9 != null) {
            view9.invalidate();
            return true;
        }
        return true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        ij ijVar2 = this.W;
        if (ijVar2 == null) {
            return;
        }
        if (i7 == qs.h2) {
            l0(true);
            return;
        }
        if (i7 == qs.f2 || i7 == qs.g2) {
            l0(true);
            return;
        }
        if (i7 == qs.e2) {
            if (ijVar2.f1() != ((Integer) objArr[0]).intValue() || (ijVar = MediaController.B().u0) == null) {
                return;
            }
            ijVar2.b0 = ijVar.b0;
            ijVar2.g0 = ijVar.g0;
            ijVar2.h0 = ijVar.h0;
            m0();
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.q0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.Y.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        if (this.n0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        kv kvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.X == null || (q1Var = (kvVar = this.a).E) == null || (l1Var = kvVar.F) == null || !l1Var.a0(q1Var)) ? false : true;
    }

    public final int j0() {
        int i7 = this.n0;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 3 ? 3 : 0;
    }

    public final void k0() {
        kv kvVar = this.a;
        this.k0 = this.c + kvVar.S + kvVar.T;
        this.l0 = i0();
        int L = g0.L(50.0f) + this.e0;
        int i7 = this.g0;
        int i10 = L + i7;
        this.h0 = i10;
        this.j0 = jg.g.e(this.l0 ? 42.0f : 18.0f, this.k0 - i10, 0);
        ij ijVar = this.W;
        String x12 = ijVar != null ? ijVar.x1(false) : null;
        String z12 = ijVar != null ? ijVar.z1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i11 = this.f0;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.b0 = null;
            this.i0 = ((i7 - g0.L(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a8.p0.D(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new o31(g0.o()), 0, x12.length(), 18);
            }
            this.a0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.j0;
            this.b0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L2, TextUtils.TruncateAt.END), this.a0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.i0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i11;
        }
        this.Z.i(this.j0, g0.L(30.0f));
    }

    public final void l0(boolean z9) {
        File K;
        int i7 = this.a.a;
        TLRPC.Document document = this.X;
        String r10 = w7.r(null, document);
        if (document == null) {
            K = null;
        } else {
            w7.G(i7);
            K = w7.K(document, null, true, true);
        }
        boolean z10 = K != null && K.exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Y;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        ij ijVar = this.W;
        if (z10) {
            z5.q(i7).v(this);
            if (!MediaController.B().I(ijVar) || MediaController.B().H()) {
                this.n0 = 0;
            } else {
                this.n0 = 1;
            }
            radialProgress2.setIcon(j0(), false, z9);
        } else {
            z5.q(i7).a(r10, null, this);
            if (!iz.B0 || ijVar == null || !ijVar.J3() || ij.S5(ijVar.k) || m5.C(ij.B0(ijVar.k))) {
                if (w7.G(i7).T(r10)) {
                    this.n0 = 3;
                    Float w10 = gc.D().w(r10);
                    radialProgress2.p(z9, w10 != null ? w10.floatValue() : 0.0f);
                    radialProgress2.setIcon(j0(), true, z9);
                } else {
                    this.n0 = 2;
                    radialProgress2.p(z9, 0.0f);
                    radialProgress2.setIcon(j0(), false, z9);
                }
            } else {
                this.n0 = (!MediaController.B().I(ijVar) || MediaController.B().H()) ? 0 : 1;
                radialProgress2.setIcon(j0(), false, z9);
            }
        }
        m0();
    }

    public final void m0() {
        ij ijVar;
        int i7;
        TLRPC.Document document = this.X;
        if (document == null || (ijVar = this.W) == null) {
            return;
        }
        jm0 jm0Var = this.Z;
        if (!jm0Var.e) {
            jm0Var.h(ijVar.b0);
        }
        if (!MediaController.B().I(ijVar)) {
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
            i7 = ijVar.g0;
        }
        String g02 = g0.g0(i7, false, false);
        String str = this.d0;
        TextPaint textPaint = this.a0;
        if (str == null || !str.equals(g02)) {
            this.d0 = g02;
            textPaint.setTextSize(g0.L(16.0f));
            this.c0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        kv kvVar = this.a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, kvVar.D));
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
