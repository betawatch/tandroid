// default package

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
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lg9 extends mg9 implements sp3, gk7 {
    public final k27 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final xu9 a0;
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
    public byte o0;
    public boolean p0;
    public boolean q0;
    public final int r0;

    public lg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(rh9Var, rect, i);
        this.b0 = new TextPaint(1);
        int L = gl.L(16.0f);
        this.f0 = L;
        int L2 = gl.L(9.0f);
        this.g0 = L2;
        int L3 = gl.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        k27 k27Var = (k27) rh9Var.m.get(pageblockaudio);
        this.X = k27Var;
        this.Y = k27Var != null ? k27Var.F0() : null;
        this.r0 = up3.q(rh9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        xu9 xu9Var = new xu9(null);
        this.a0 = xu9Var;
        xu9Var.h = new k88(this, (byte) 29);
        k0();
        l0(false);
    }

    @Override // sp3
    public final void B(boolean z) {
        l0(true);
    }

    @Override // mg9
    public final int J() {
        return K();
    }

    @Override // sp3
    public final void N(String str) {
        this.Z.o(true, 1.0f);
        l0(true);
    }

    @Override // mg9
    public final boolean Q() {
        return this.a0.e;
    }

    @Override // mg9
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.m(view);
            this.a0.s = this.W;
        }
        l0(false);
        rh9 rh9Var = this.a;
        int i = rh9Var.a;
        int i2 = rh9Var.a;
        kk7.f(i).b(this, kk7.g2);
        kk7.f(i2).b(this, kk7.e2);
        kk7.f(i2).b(this, kk7.f2);
        kk7.f(i2).b(this, kk7.d2);
    }

    @Override // mg9
    public final void V() {
        rh9 rh9Var = this.a;
        up3.q(rh9Var.a).v(this);
        int i = rh9Var.a;
        kk7.f(i).n(this, kk7.g2);
        kk7.f(i).n(this, kk7.e2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.d2);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i = this.l0;
        int i2 = this.c;
        rh9 rh9Var = this.a;
        if (i != i2 + rh9Var.S + rh9Var.T || this.m0 != i0()) {
            k0();
        }
        canvas.save();
        canvas.translate(-rh9Var.S, 0.0f);
        int i3 = rh9Var.D() ? bkb.Dc : bkb.Ye;
        int i4 = rh9Var.D() ? bkb.Ec : bkb.Ze;
        int i5 = rh9Var.D() ? bkb.Fb : bkb.kd;
        int i6 = rh9Var.D() ? bkb.Gb : bkb.ld;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i3, i4, i5, i6);
        radialProgress2.d = bkb.v0(rh9Var.D() ? bkb.tc : bkb.re, rh9Var.D);
        radialProgress2.draw(canvas);
        int v0 = bkb.v0(rh9Var.D() ? bkb.mc : bkb.ke, rh9Var.D);
        int v02 = bkb.v0(rh9Var.D() ? bkb.nc : bkb.le, rh9Var.D);
        int v03 = bkb.v0(rh9Var.D() ? bkb.pc : bkb.ne, rh9Var.D);
        int v04 = bkb.v0(rh9Var.D() ? bkb.pc : bkb.ne, rh9Var.D);
        int v05 = bkb.v0(rh9Var.D() ? bkb.oc : bkb.me, rh9Var.D);
        xu9 xu9Var = this.a0;
        xu9Var.f(v0, v02, v03, v04, v05);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        xu9Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.d0;
        int i7 = this.f0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(gl.L(54.0f) + i7, gl.L(6.0f) + this.j0);
            this.d0.draw(canvas);
            canvas.restore();
        }
        if (this.c0 != null) {
            canvas.save();
            canvas.translate(gl.L(54.0f) + i7, this.j0 - gl.L(16.0f));
            this.c0.draw(canvas);
            canvas.restore();
        }
        boolean z = this.m0;
        RectF rectF = this.n0;
        if (z) {
            if (rh9Var.D()) {
                wjb wjbVar = rh9Var.D;
                drawable = wjbVar != null ? wjbVar.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = bkb.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = bkb.b4;
            }
            int L = (this.l0 + this.b.right) - gl.L(32.0f);
            int L2 = gl.L(7.0f);
            drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
            drawable.draw(canvas);
            rectF.set(L - gl.L(8.0f), 0.0f, gl.L(8.0f) + drawable.getIntrinsicWidth() + L, gl.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1 == 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // mg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        rh9 rh9Var = this.a;
        float f = x + rh9Var.S;
        float y = motionEvent.getY();
        boolean contains = this.n0.contains(f, y);
        if (actionMasked == 0 && contains) {
            this.q0 = true;
            return true;
        }
        boolean z2 = this.q0;
        TLRPC.Document document = this.Y;
        if (z2) {
            if (actionMasked == 2 && !contains) {
                this.q0 = false;
                return true;
            }
            if (actionMasked == 1) {
                if (contains) {
                    z = true;
                    this.q0 = false;
                    if (z && i0()) {
                        view = this.W;
                        if (view != null) {
                            view.playSoundEffect(0);
                        }
                        rh9Var.F.I(rh9Var.E, document, F());
                        return true;
                    }
                    return true;
                }
            }
            z = false;
            this.q0 = false;
            if (z) {
                view = this.W;
                if (view != null) {
                }
                rh9Var.F.I(rh9Var.E, document, F());
                return true;
            }
            return true;
        }
        if (!this.a0.e(f - this.i0, y - this.j0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.o0 != -1) {
                    if (f >= this.f0 && f <= gl.L(48.0f) + r1) {
                        if (y >= this.g0 && y <= gl.L(48.0f) + r1) {
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
                    int i = rh9Var.a;
                    byte b = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (b == 0) {
                        if (MediaController.w().n0(rh9Var.l, this.X, 0L, false, null, 0L)) {
                            this.o0 = (byte) 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (b == 1) {
                        if (MediaController.w().Q(this.X, true)) {
                            this.o0 = (byte) 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (b == 2) {
                        radialProgress2.o(false, 0.0f);
                        ba4.G(i).X(document, rh9Var.b, 1, 1);
                        this.o0 = (byte) 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view6 = this.W;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (b == 3) {
                        ba4.G(i).f(document);
                        this.o0 = (byte) 2;
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

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        k27 k27Var2 = this.X;
        if (k27Var2 != null) {
            if (i == kk7.g2) {
                l0(true);
                return;
            }
            if (i == kk7.e2 || i == kk7.f2) {
                l0(true);
                return;
            }
            if (i == kk7.d2) {
                if (k27Var2.e1() != ((Integer) objArr[0]).intValue() || (k27Var = MediaController.w().v0) == null) {
                    return;
                }
                k27Var2.b0 = k27Var.b0;
                k27Var2.i0 = k27Var.i0;
                k27Var2.j0 = k27Var.j0;
                m0();
            }
        }
    }

    @Override // sp3
    public final int getObserverTag() {
        return this.r0;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.Z.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        if (this.o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        rh9 rh9Var;
        gb2 gb2Var;
        bb2 bb2Var;
        return (this.Y == null || (gb2Var = (rh9Var = this.a).E) == null || (bb2Var = rh9Var.F) == null || !bb2Var.l2(gb2Var)) ? false : true;
    }

    public final int j0() {
        byte b = this.o0;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 3 ? 3 : 0;
    }

    public final void k0() {
        rh9 rh9Var = this.a;
        this.l0 = this.c + rh9Var.S + rh9Var.T;
        this.m0 = i0();
        int L = gl.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        this.k0 = b00.c(this.m0 ? 42.0f : 18.0f, this.l0 - i2, 0);
        k27 k27Var = this.X;
        String w1 = k27Var != null ? k27Var.w1(false) : null;
        String y1 = k27Var != null ? k27Var.y1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(y1);
        int i3 = this.g0;
        if (isEmpty && TextUtils.isEmpty(w1)) {
            this.c0 = null;
            this.j0 = ((i - gl.L(30.0f)) / 2) + i3;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y1) || TextUtils.isEmpty(w1)) ? !TextUtils.isEmpty(y1) ? new SpannableStringBuilder(y1) : new SpannableStringBuilder(w1) : new SpannableStringBuilder(tb4.p(w1, " - ", y1));
            if (!TextUtils.isEmpty(w1)) {
                spannableStringBuilder.setSpan(new z3c(gl.o()), 0, w1.length(), 18);
            }
            this.b0.setTextSize(gl.L(16.0f));
            int L2 = gl.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, bkb.N2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = gl.L(11.0f) + ((i - gl.L(30.0f)) / 2) + i3;
        }
        this.a0.h(this.k0, gl.L(30.0f));
    }

    public final void l0(boolean z) {
        File J;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = ba4.r(null, document);
        if (document == null) {
            J = null;
        } else {
            ba4.G(i);
            J = ba4.J(document, null, true, true);
        }
        boolean z2 = J != null && J.exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        k27 k27Var = this.X;
        if (z2) {
            up3.q(i).v(this);
            if (!MediaController.w().D(k27Var) || MediaController.w().C()) {
                this.o0 = (byte) 0;
            } else {
                this.o0 = (byte) 1;
            }
            radialProgress2.setIcon(j0(), false, z);
        } else {
            up3.q(i).a(r, null, this);
            if (!gba.x0 || k27Var == null || !k27Var.I3() || k27.Q5(k27Var.k) || cf3.B(k27.B0(k27Var.k))) {
                if (ba4.G(i).S(r)) {
                    this.o0 = (byte) 3;
                    Float s = fl5.z().s(r);
                    radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                    radialProgress2.setIcon(j0(), true, z);
                } else {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(j0(), false, z);
                }
            } else {
                this.o0 = (!MediaController.w().D(k27Var) || MediaController.w().C()) ? (byte) 0 : (byte) 1;
                radialProgress2.setIcon(j0(), false, z);
            }
        }
        m0();
    }

    public final void m0() {
        k27 k27Var;
        int i;
        TLRPC.Document document = this.Y;
        if (document == null || (k27Var = this.X) == null) {
            return;
        }
        xu9 xu9Var = this.a0;
        if (!xu9Var.e) {
            xu9Var.g(k27Var.b0);
        }
        if (!MediaController.w().D(k27Var)) {
            int i2 = 0;
            while (true) {
                if (i2 >= document.attributes.size()) {
                    i = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i = (int) documentAttribute.duration;
                    break;
                }
                i2++;
            }
        } else {
            i = k27Var.i0;
        }
        String g0 = gl.g0(i, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g0)) {
            this.e0 = g0;
            textPaint.setTextSize(gl.L(16.0f));
            this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        rh9 rh9Var = this.a;
        textPaint.setColor(bkb.v0(rh9Var.D() ? bkb.Vc : bkb.Uc, rh9Var.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
