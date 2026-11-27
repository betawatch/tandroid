// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mh8 extends Drawable implements jq3, qy9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public r47 I;
    public double J;
    public int K;
    public final ry9 L;
    public float M;
    public float N;
    public ggb O;
    public jj2 P;
    public Drawable Q;
    public yc4 R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final fm0 a;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final ViewGroup d;
    public String e;
    public final int e0;
    public String f;
    public int f0;
    public byte g0;
    public String h;
    public int h0;
    public pkb n;
    public pkb r;
    public pkb s;
    public pkb w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = jn7.d4;

    public mh8(int i, ViewGroup viewGroup, vnb vnbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, vnbVar);
        this.d = viewGroup;
        ry9 ry9Var = new ry9(viewGroup);
        this.L = ry9Var;
        ry9Var.h = this;
        this.a = new fm0(180L, viewGroup, un.a);
        this.e0 = lq3.q(i).k();
    }

    @Override // jq3
    public final void B(boolean z) {
        c();
    }

    @Override // jq3
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.b.I();
        this.y.e();
    }

    public final void b(boolean z) {
        pkb pkbVar = this.n;
        if (pkbVar != null) {
            pkbVar.m(aob.w0(null, z ? aob.wc : aob.ue, false));
        }
        this.x.setColor(1711276032);
        pkb pkbVar2 = this.w;
        if (pkbVar2 != null) {
            pkbVar2.m(-1);
        }
        ggb ggbVar = this.O;
        if (ggbVar != null) {
            ggbVar.m = z ? aob.Gc : aob.hf;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
            return;
        }
        ry9 ry9Var = this.L;
        if (z) {
            int w0 = aob.w0(null, aob.nc, false);
            int w02 = aob.w0(null, aob.oc, false);
            int i = aob.qc;
            ry9Var.f(w0, w02, aob.w0(null, i, false), aob.w0(null, i, false), aob.w0(null, aob.pc, false));
            radialProgress2.g(aob.Ec, aob.Fc, aob.Gb, aob.Hb);
            return;
        }
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        int w03 = aob.w0(null, aob.le, false);
        int w04 = aob.w0(null, aob.me, false);
        int i2 = aob.oe;
        ry9Var.f(w03, w04, aob.w0(null, i2, false), aob.w0(null, i2, false), aob.w0(null, aob.ne, false));
    }

    public final void c() {
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z) {
        int width = getBounds().width() - hl.L(this.E ? 64.0f : 72.0f);
        if (this.a0 != width || z) {
            this.a0 = width;
            String str = this.e;
            if (str != null) {
                pkb pkbVar = this.n;
                if (pkbVar == null) {
                    pkbVar = new pkb(str, 15.0f, hl.o());
                    this.n = pkbVar;
                }
                pkbVar.p(TextUtils.ellipsize(this.e, pkbVar.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                pkb pkbVar2 = this.r;
                if (pkbVar2 == null) {
                    pkbVar2 = new pkb(str2, 14.0f, null);
                    this.r = pkbVar2;
                }
                pkbVar2.p(TextUtils.ellipsize(this.f, pkbVar2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                pkb pkbVar3 = this.s;
                if (pkbVar3 == null) {
                    pkbVar3 = new pkb(str3, 12.0f, null);
                    this.s = pkbVar3;
                }
                pkbVar3.p(TextUtils.ellipsize(this.h, pkbVar3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new pkb(hl.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.d0 == 0 || bounds.isEmpty()) {
            return;
        }
        d(false);
        boolean z = this.X;
        int i = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z || this.Y) {
            int i2 = bounds.left;
            boolean z2 = this.E;
            int L = i2 + (z2 ? 0 : hl.L(8.0f));
            int L2 = bounds.top + (z2 ? 0 : hl.L(3.0f));
            int L3 = this.Y ? 0 : hl.L(3.0f);
            pkb pkbVar = this.n;
            if (pkbVar != null) {
                pkbVar.e(canvas, hl.L(56.0f) + L, hl.L(15.0f) + L2 + L3);
            }
            if (this.Y) {
                float f = this.a.e;
                if (this.r != null && f < 1.0f) {
                    canvas.save();
                    float f2 = 1.0f - f;
                    int i3 = L2 + L3;
                    canvas.scale(f2, f2, hl.L(56.0f) + L, hl.L(35.0f) + i3);
                    this.r.a.setAlpha((int) (f2 * 255.0f));
                    this.r.e(canvas, hl.L(56.0f) + L, hl.L(35.0f) + i3);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    ry9 ry9Var = this.L;
                    ry9Var.t = f;
                    ry9Var.h(ik8.B(56.0f, L, bounds.right), hl.L(30.0f));
                    canvas.save();
                    float L4 = hl.L(45.0f) + L;
                    this.M = L4;
                    float L5 = hl.L(21.0f) + L2 + L3;
                    this.N = L5;
                    canvas.translate(L4, L5);
                    ry9Var.b(canvas);
                    canvas.restore();
                }
            }
            pkb pkbVar2 = this.s;
            if (pkbVar2 != null) {
                pkbVar2.e(canvas, hl.L(56.0f) + L, hl.L((this.Y ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = hl.L(2.0f) + L;
            this.b0 = L6;
            int L7 = hl.L(5.0f) + L2;
            this.c0 = L7;
            radialProgress2.p(L6, L7, hl.L(44.0f) + hl.L(2.0f) + L, hl.L(44.0f) + hl.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.d0 / 255.0f);
            imageReceiver.j0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Z && (drawable = this.Q) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                int z3 = (int) bp1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - k43.k.getInterpolation(imageReceiver.i1)) * hl.L(16.0f)));
                this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                this.Q.setBounds(z3, interpolation, intrinsicWidth + z3, intrinsicHeight + interpolation);
                this.Q.draw(canvas);
            }
            radialProgress2.p(bounds.centerX() - hl.L(22.0f), bounds.centerY() - hl.L(22.0f), hl.L(22.0f) + bounds.centerX(), hl.L(22.0f) + bounds.centerY());
            if (this.H && this.w != null) {
                canvas.drawRoundRect(hl.L(6.0f) + bounds.left, hl.L(6.0f) + bounds.top, bounds.left + this.w.c + hl.L(18.0f), hl.L(23.0f) + bounds.top, hl.L(8.5f), hl.L(8.5f), this.x);
                this.w.e(canvas, hl.L(12.0f) + bounds.left, hl.L(15.0f) + bounds.top);
            }
        }
        if (this.Z) {
            return;
        }
        r47 r47Var = this.I;
        if (r47Var == null || !r47Var.n4()) {
            yc4 yc4Var = this.R;
            if (yc4Var == null || !yc4Var.g) {
                if (this.Y) {
                    if (yc4Var != null && yc4Var.f) {
                        i = 4;
                    }
                    n(i, true);
                } else {
                    m(e());
                }
            } else if (this.Y) {
                n(3, true);
            } else {
                m(3);
            }
        } else if (in5.z().t(this.G) == null) {
            radialProgress2.o(true, 1.0f);
            if (this.Y) {
                n(6, true);
            } else {
                m(6);
            }
        }
        if (this.Y) {
            m(e());
        }
        radialProgress2.draw(canvas);
    }

    public final int e() {
        boolean z = this.Y;
        if (z && this.a.f) {
            return !MediaController.z().G() ? 1 : 0;
        }
        if (this.H || z) {
            return 0;
        }
        if (!this.X) {
            return 4;
        }
        yc4 yc4Var = this.R;
        return (yc4Var == null || !yc4Var.f) ? 2 : 5;
    }

    public final int f(int i) {
        if (this.Y) {
            return hl.L(63.0f);
        }
        if (this.X) {
            return hl.L(56.0f);
        }
        int i2 = this.V;
        if (i2 == 0) {
            return hl.L(100.0f);
        }
        return Math.min(Math.round((i / i2) * this.W), this.E ? (i << 2) / 5 : (i * 5) / 4);
    }

    @Override // qy9
    public final void g(float f) {
        if (j()) {
            MediaController.z().k0(MediaController.z().v0, f);
            p(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // qy9
    public final void h(float f) {
        if (j()) {
            r47 r47Var = MediaController.z().v0;
            r47Var.b0 = f;
            r47Var.i0 = (int) (r47Var.L0() * f);
            p(true);
        }
    }

    @Override // jq3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
        }
        if (this.Y) {
            n(min >= 1.0f ? 4 : 3, true);
        } else {
            m(min >= 1.0f ? e() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.Y && MediaController.z().H(this.I) && MediaController.z().v0 != null && MediaController.z().v0.m0 == this.E;
    }

    public final boolean k(float f, float f2, int i) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i == 0) {
            int L = hl.L(36.0f);
            int L2 = hl.L(27.0f);
            if (f >= this.b0 + L2 && f <= r4 + L) {
                if (f2 >= this.c0 + L2 && f2 <= r7 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z = this.S;
        if (z) {
            if (i == 1) {
                yc4 yc4Var = this.R;
                if (yc4Var != null) {
                    TLRPC.Document document = yc4Var.b;
                    int i2 = yc4Var.a;
                    if (yc4Var.g) {
                        xb4.G(i2).f(document);
                        yc4Var.a();
                    } else if (!yc4Var.f) {
                        xb4.G(i2).X(document, yc4Var.d, 2, 0);
                        yc4Var.a();
                    }
                    c();
                }
                this.S = false;
                return true;
            }
            if (i == 3) {
                this.S = false;
                return true;
            }
        }
        return z;
    }

    @Override // jq3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
        }
        if (this.Y) {
            n(min >= 1.0f ? 4 : 3, true);
        } else {
            m(min >= 1.0f ? e() : 3);
        }
        this.d.invalidate();
    }

    public final void m(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            this.y.setIcon(i, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(int i, boolean z) {
        if (this.g0 != i) {
            this.g0 = i;
            this.y.k(i, true, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(r47 r47Var, TLRPC.MessageMedia messageMedia, r47 r47Var2, int i, String str, boolean z) {
        boolean z2;
        boolean z3;
        TLRPC.Document document;
        int i2;
        double d;
        String str2 = this.F;
        this.V = 0;
        this.W = 0;
        this.I = r47Var;
        this.U = messageMedia;
        this.X = false;
        this.Y = false;
        this.H = false;
        this.Z = false;
        this.J = 0.0d;
        this.K = 0;
        this.G = str;
        this.F = null;
        this.R = null;
        int i3 = this.c;
        RadialProgress2 radialProgress2 = this.y;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize w = xb4.w(photo.sizes, 40, false, null, false);
                TLRPC.PhotoSize w2 = xb4.w(photo.sizes, hl.Y0(false), true, w, true);
                if (w2 != null) {
                    int i4 = w2.w;
                    this.V = i4;
                    int i5 = w2.h;
                    this.W = i5;
                    Locale locale = Locale.US;
                    float f = hl.p;
                    String m = qd4.m((int) (i4 / f), (int) (i5 / f), "_");
                    String concat = m.concat("_b");
                    this.F = !TextUtils.isEmpty(str) ? str : r47.U0(messageMedia);
                    z3 = true;
                    imageReceiver.Z(jn5.f(w2, photo), m, jn5.f(w, photo), concat, null, w2.size, null, r47Var2, 1);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z3 = true;
                if (messageMedia.geo != null) {
                    if (this.O == null) {
                        ggb c = lp3.c((aob.I.o() ? 3 : 6) * 0.12f, aob.Gc);
                        this.O = c;
                        c.t = true;
                        this.P = new jj2(c);
                    }
                    if (this.Q == null) {
                        this.Q = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Z = true;
                    this.V = i;
                    int i6 = (i * 9) / 16;
                    this.W = i6;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f2 = hl.p;
                    imageReceiver.a0(jn5.p(jxc.b(geoPoint, (int) (i / f2), (int) (i6 / f2), 15, Math.min(2, (int) Math.ceil(f2)))), null, null, null, this.P, r47Var2, 0);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.R = new yc4(i3, r47Var, document, str);
                this.F = !TextUtils.isEmpty(str) ? str : r47.U0(messageMedia);
                if (r47.J3(document)) {
                    this.Y = true;
                    this.e = r47.x1(document);
                    this.f = r47.v1(document);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i7++;
                    }
                    if (r47.W2(document)) {
                        TLRPC.PhotoSize w3 = xb4.w(document.thumbs, hl.L(22.0f), true, null, false);
                        radialProgress2.j(xb4.w(document.thumbs, hl.L(44.0f), true, w3, true), w3, document, this.I);
                    } else {
                        String t0 = r47.t0(document, true);
                        if (TextUtils.isEmpty(t0)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t0);
                        }
                    }
                    this.J = d;
                    this.h = hl.k0(j() ? MediaController.z().v0.i0 : 0, (int) this.J);
                    z3 = true;
                } else if (r47.J4(document)) {
                    this.K = (int) Math.max(1L, Math.round(r47.H0(document)));
                    this.H = true;
                    TLRPC.PhotoSize w4 = xb4.w(document.thumbs, hl.Y0(false), true, null, true);
                    float f3 = i;
                    TLRPC.PhotoSize w5 = xb4.w(document.thumbs, (int) (f3 / hl.p), false, w4, false);
                    jn5 c2 = jn5.c(w4, document);
                    jn5 c3 = jn5.c(w5, document);
                    int i8 = (int) (f3 / hl.p);
                    if (w4 != null) {
                        int i9 = w4.w;
                        this.V = i9;
                        int i10 = w4.h;
                        this.W = i10;
                        if (i9 != 0) {
                            i2 = (i10 * i8) / i9;
                            String m2 = qd4.m(i8, i2, "_");
                            z3 = true;
                            imageReceiver.Y(null, m2, c2, m2, c3, m2, null, 0L, null, r47Var2, 0);
                        }
                        i2 = i8;
                        String m22 = qd4.m(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, m22, c2, m22, c3, m22, null, 0L, null, r47Var2, 0);
                    } else {
                        if (w5 != null) {
                            int i11 = w5.w;
                            this.V = i11;
                            int i12 = w5.h;
                            this.W = i12;
                            if (i11 != 0) {
                                i2 = (i12 * i8) / i11;
                                String m222 = qd4.m(i8, i2, "_");
                                z3 = true;
                                imageReceiver.Y(null, m222, c2, m222, c3, m222, null, 0L, null, r47Var2, 0);
                            }
                        }
                        i2 = i8;
                        String m2222 = qd4.m(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, m2222, c2, m2222, c3, m2222, null, 0L, null, r47Var2, 0);
                    }
                } else {
                    z3 = true;
                    this.X = true;
                    this.e = xb4.B(document);
                    String str3 = hl.i0(document.size, false, false) + " " + xb4.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                d(z3);
                z2 = z3;
            }
            this.T = z2;
            if (!z2) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.F)) {
                if (!TextUtils.isEmpty(str2)) {
                    lq3.q(i3).v(this);
                }
                if (!TextUtils.isEmpty(this.F)) {
                    lq3.q(i3).a(this.F, null, this);
                }
            }
            if (!this.Y) {
                radialProgress2.i(null, null, null);
                n(4, false);
            }
            p(z);
        }
        z2 = false;
        this.T = z2;
        if (!z2) {
        }
        if (!TextUtils.equals(str2, this.F)) {
        }
        if (!this.Y) {
        }
        p(z);
    }

    public final void p(boolean z) {
        int i;
        if (!this.Y || this.I == null) {
            return;
        }
        r47 r47Var = MediaController.z().v0;
        boolean j = j();
        this.a.a(j, z);
        if (r47Var == null || !j) {
            i = 0;
        } else {
            i = r47Var.i0;
            ry9 ry9Var = this.L;
            if (!ry9Var.e) {
                ry9Var.g(r47Var.b0);
                ry9Var.q = r47Var.g0;
            }
            ry9Var.i(r47Var);
        }
        if (this.h0 != i) {
            this.h0 = i;
            this.h = hl.k0(i, (int) this.J);
            d(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d0 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
