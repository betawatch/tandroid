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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ck9 extends dk9 implements jq3, fn7 {
    public final r47 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final ry9 a0;
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

    public ck9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(hl9Var, rect, i);
        this.b0 = new TextPaint(1);
        int L = hl.L(16.0f);
        this.f0 = L;
        int L2 = hl.L(9.0f);
        this.g0 = L2;
        int L3 = hl.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        r47 r47Var = (r47) hl9Var.m.get(pageblockaudio);
        this.X = r47Var;
        this.Y = r47Var != null ? r47Var.F0() : null;
        this.r0 = lq3.q(hl9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        ry9 ry9Var = new ry9(null);
        this.a0 = ry9Var;
        ry9Var.h = new ye9(this, (byte) 6);
        j0();
        k0(false);
    }

    @Override // jq3
    public final void B(boolean z) {
        k0(true);
    }

    @Override // dk9
    public final int I() {
        return J();
    }

    @Override // jq3
    public final void N(String str) {
        this.Z.o(true, 1.0f);
        k0(true);
    }

    @Override // dk9
    public final boolean P() {
        return this.a0.e;
    }

    @Override // dk9
    public final void S() {
        View view = this.W;
        if (view != null) {
            this.Z.m(view);
            this.a0.s = this.W;
        }
        k0(false);
        hl9 hl9Var = this.a;
        int i = hl9Var.a;
        int i2 = hl9Var.a;
        jn7.f(i).b(this, jn7.h2);
        jn7.f(i2).b(this, jn7.f2);
        jn7.f(i2).b(this, jn7.g2);
        jn7.f(i2).b(this, jn7.e2);
    }

    @Override // dk9
    public final void U() {
        hl9 hl9Var = this.a;
        lq3.q(hl9Var.a).v(this);
        int i = hl9Var.a;
        jn7.f(i).n(this, jn7.h2);
        jn7.f(i).n(this, jn7.f2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.e2);
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        Drawable drawable;
        if (this.X == null || this.Y == null) {
            return;
        }
        int i = this.l0;
        int i2 = this.c;
        hl9 hl9Var = this.a;
        if (i != i2 + hl9Var.S + hl9Var.T || this.m0 != h0()) {
            j0();
        }
        canvas.save();
        canvas.translate(-hl9Var.S, 0.0f);
        int i3 = hl9Var.D() ? aob.Ec : aob.Ze;
        int i4 = hl9Var.D() ? aob.Fc : aob.af;
        int i5 = hl9Var.D() ? aob.Gb : aob.ld;
        int i6 = hl9Var.D() ? aob.Hb : aob.md;
        RadialProgress2 radialProgress2 = this.Z;
        radialProgress2.g(i3, i4, i5, i6);
        radialProgress2.d = aob.v0(hl9Var.D() ? aob.uc : aob.se, hl9Var.D);
        radialProgress2.draw(canvas);
        int v0 = aob.v0(hl9Var.D() ? aob.nc : aob.le, hl9Var.D);
        int v02 = aob.v0(hl9Var.D() ? aob.oc : aob.me, hl9Var.D);
        int v03 = aob.v0(hl9Var.D() ? aob.qc : aob.oe, hl9Var.D);
        int v04 = aob.v0(hl9Var.D() ? aob.qc : aob.oe, hl9Var.D);
        int v05 = aob.v0(hl9Var.D() ? aob.pc : aob.ne, hl9Var.D);
        ry9 ry9Var = this.a0;
        ry9Var.f(v0, v02, v03, v04, v05);
        canvas.save();
        canvas.translate(this.i0, this.j0);
        ry9Var.b(canvas);
        canvas.restore();
        StaticLayout staticLayout = this.d0;
        int i7 = this.f0;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(hl.L(54.0f) + i7, hl.L(6.0f) + this.j0);
            this.d0.draw(canvas);
            canvas.restore();
        }
        if (this.c0 != null) {
            canvas.save();
            canvas.translate(hl.L(54.0f) + i7, this.j0 - hl.L(16.0f));
            this.c0.draw(canvas);
            canvas.restore();
        }
        boolean z = this.m0;
        RectF rectF = this.n0;
        if (z) {
            if (hl9Var.D()) {
                vnb vnbVar = hl9Var.D;
                drawable = vnbVar != null ? vnbVar.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = aob.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = aob.c4;
            }
            int L = (this.l0 + this.b.right) - hl.L(32.0f);
            int L2 = hl.L(7.0f);
            drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
            drawable.draw(canvas);
            rectF.set(L - hl.L(8.0f), 0.0f, hl.L(8.0f) + drawable.getIntrinsicWidth() + L, hl.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1 == 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // dk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        hl9 hl9Var = this.a;
        float f = x + hl9Var.S;
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
                    if (z && h0()) {
                        view = this.W;
                        if (view != null) {
                            view.playSoundEffect(0);
                        }
                        hl9Var.F.F(hl9Var.E, document, E());
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
                hl9Var.F.F(hl9Var.E, document, E());
                return true;
            }
            return true;
        }
        if (!this.a0.e(f - this.i0, y - this.j0, actionMasked)) {
            if (actionMasked == 0) {
                if (this.o0 != -1) {
                    if (f >= this.f0 && f <= hl.L(48.0f) + r1) {
                        if (y >= this.g0 && y <= hl.L(48.0f) + r1) {
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
                    int i = hl9Var.a;
                    byte b = this.o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (b == 0) {
                        if (MediaController.z().q0(hl9Var.l, this.X, 0L, false, null, 0L)) {
                            this.o0 = (byte) 1;
                            radialProgress2.setIcon(i0(), false, true);
                            View view4 = this.W;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (b == 1) {
                        if (MediaController.z().U(this.X, true)) {
                            this.o0 = (byte) 0;
                            radialProgress2.setIcon(i0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (b == 2) {
                        radialProgress2.o(false, 0.0f);
                        xb4.G(i).X(document, hl9Var.b, 1, 1);
                        this.o0 = (byte) 3;
                        radialProgress2.setIcon(i0(), true, true);
                        View view6 = this.W;
                        if (view6 != null) {
                            view6.invalidate();
                        }
                    } else if (b == 3) {
                        xb4.G(i).f(document);
                        this.o0 = (byte) 2;
                        radialProgress2.setIcon(i0(), false, true);
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
            Z(true);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            Z(false);
        }
        View view9 = this.W;
        if (view9 != null) {
            view9.invalidate();
            return true;
        }
        return true;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        r47 r47Var2 = this.X;
        if (r47Var2 != null) {
            if (i == jn7.h2) {
                k0(true);
                return;
            }
            if (i == jn7.f2 || i == jn7.g2) {
                k0(true);
                return;
            }
            if (i == jn7.e2) {
                if (r47Var2.e1() != ((Integer) objArr[0]).intValue() || (r47Var = MediaController.z().v0) == null) {
                    return;
                }
                r47Var2.b0 = r47Var.b0;
                r47Var2.i0 = r47Var.i0;
                r47Var2.j0 = r47Var.j0;
                l0();
            }
        }
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.r0;
    }

    public final boolean h0() {
        hl9 hl9Var;
        wb2 wb2Var;
        rb2 rb2Var;
        return (this.Y == null || (wb2Var = (hl9Var = this.a).E) == null || (rb2Var = hl9Var.F) == null || !rb2Var.W1(wb2Var)) ? false : true;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.Z.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        if (this.o0 != 3) {
            k0(true);
        }
    }

    public final int i0() {
        byte b = this.o0;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 3 ? 3 : 0;
    }

    public final void j0() {
        hl9 hl9Var = this.a;
        this.l0 = this.c + hl9Var.S + hl9Var.T;
        this.m0 = h0();
        int L = hl.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        this.k0 = c00.d(this.m0 ? 42.0f : 18.0f, this.l0 - i2, 0);
        r47 r47Var = this.X;
        String w1 = r47Var != null ? r47Var.w1(false) : null;
        String y1 = r47Var != null ? r47Var.y1(false) : null;
        boolean isEmpty = TextUtils.isEmpty(y1);
        int i3 = this.g0;
        if (isEmpty && TextUtils.isEmpty(w1)) {
            this.c0 = null;
            this.j0 = ((i - hl.L(30.0f)) / 2) + i3;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y1) || TextUtils.isEmpty(w1)) ? !TextUtils.isEmpty(y1) ? new SpannableStringBuilder(y1) : new SpannableStringBuilder(w1) : new SpannableStringBuilder(qd4.p(w1, " - ", y1));
            if (!TextUtils.isEmpty(w1)) {
                spannableStringBuilder.setSpan(new y7c(hl.o()), 0, w1.length(), 18);
            }
            this.b0.setTextSize(hl.L(16.0f));
            int L2 = hl.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, aob.O2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = hl.L(11.0f) + ((i - hl.L(30.0f)) / 2) + i3;
        }
        this.a0.h(this.k0, hl.L(30.0f));
    }

    public final void k0(boolean z) {
        File J;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = xb4.r(null, document);
        if (document == null) {
            J = null;
        } else {
            xb4.G(i);
            J = xb4.J(document, null, true, true);
        }
        boolean z2 = J != null && J.exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        r47 r47Var = this.X;
        if (z2) {
            lq3.q(i).v(this);
            if (!MediaController.z().H(r47Var) || MediaController.z().G()) {
                this.o0 = (byte) 0;
            } else {
                this.o0 = (byte) 1;
            }
            radialProgress2.setIcon(i0(), false, z);
        } else {
            lq3.q(i).a(r, null, this);
            if (!xea.x0 || r47Var == null || !r47Var.I3() || r47.Q5(r47Var.k) || wf3.B(r47.B0(r47Var.k))) {
                if (xb4.G(i).S(r)) {
                    this.o0 = (byte) 3;
                    Float s = in5.z().s(r);
                    radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                    radialProgress2.setIcon(i0(), true, z);
                } else {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(i0(), false, z);
                }
            } else {
                this.o0 = (!MediaController.z().H(r47Var) || MediaController.z().G()) ? (byte) 0 : (byte) 1;
                radialProgress2.setIcon(i0(), false, z);
            }
        }
        l0();
    }

    public final void l0() {
        r47 r47Var;
        int i;
        TLRPC.Document document = this.Y;
        if (document == null || (r47Var = this.X) == null) {
            return;
        }
        ry9 ry9Var = this.a0;
        if (!ry9Var.e) {
            ry9Var.g(r47Var.b0);
        }
        if (!MediaController.z().H(r47Var)) {
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
            i = r47Var.i0;
        }
        String g0 = hl.g0(i, false, false);
        String str = this.e0;
        TextPaint textPaint = this.b0;
        if (str == null || !str.equals(g0)) {
            this.e0 = g0;
            textPaint.setTextSize(hl.L(16.0f));
            this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        hl9 hl9Var = this.a;
        textPaint.setColor(aob.v0(hl9Var.D() ? aob.Wc : aob.Vc, hl9Var.D));
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
