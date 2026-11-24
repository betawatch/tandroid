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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ag8 extends Drawable implements cr3, zw9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public k47 I;
    public double J;
    public int K;
    public final ax9 L;
    public float M;
    public float N;
    public meb O;
    public bk2 P;
    public Drawable Q;
    public bd4 R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final fn0 a;
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
    public uib n;
    public uib r;
    public uib s;
    public uib w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = nm7.d4;

    public ag8(int i, ViewGroup viewGroup, ylb ylbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(gm.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, ylbVar);
        this.d = viewGroup;
        ax9 ax9Var = new ax9(viewGroup);
        this.L = ax9Var;
        ax9Var.h = this;
        this.a = new fn0(180L, viewGroup, uo.a);
        this.e0 = er3.q(i).k();
    }

    @Override // cr3
    public final void A(boolean z) {
        c();
    }

    @Override // cr3
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.b.I();
        this.y.e();
    }

    public final void b(boolean z) {
        uib uibVar = this.n;
        if (uibVar != null) {
            uibVar.m(cmb.w0(null, z ? cmb.vc : cmb.te, false));
        }
        this.x.setColor(1711276032);
        uib uibVar2 = this.w;
        if (uibVar2 != null) {
            uibVar2.m(-1);
        }
        meb mebVar = this.O;
        if (mebVar != null) {
            mebVar.m = z ? cmb.Fc : cmb.gf;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(cmb.bf, cmb.cf, cmb.df, cmb.ef);
            return;
        }
        ax9 ax9Var = this.L;
        if (z) {
            int w0 = cmb.w0(null, cmb.mc, false);
            int w02 = cmb.w0(null, cmb.nc, false);
            int i = cmb.pc;
            ax9Var.f(w0, w02, cmb.w0(null, i, false), cmb.w0(null, i, false), cmb.w0(null, cmb.oc, false));
            radialProgress2.g(cmb.Dc, cmb.Ec, cmb.Fb, cmb.Gb);
            return;
        }
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        int w03 = cmb.w0(null, cmb.ke, false);
        int w04 = cmb.w0(null, cmb.le, false);
        int i2 = cmb.ne;
        ax9Var.f(w03, w04, cmb.w0(null, i2, false), cmb.w0(null, i2, false), cmb.w0(null, cmb.me, false));
    }

    public final void c() {
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z) {
        int width = getBounds().width() - gm.L(this.E ? 64.0f : 72.0f);
        if (this.a0 != width || z) {
            this.a0 = width;
            String str = this.e;
            if (str != null) {
                uib uibVar = this.n;
                if (uibVar == null) {
                    uibVar = new uib(str, 15.0f, gm.o());
                    this.n = uibVar;
                }
                uibVar.p(TextUtils.ellipsize(this.e, uibVar.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                uib uibVar2 = this.r;
                if (uibVar2 == null) {
                    uibVar2 = new uib(str2, 14.0f, null);
                    this.r = uibVar2;
                }
                uibVar2.p(TextUtils.ellipsize(this.f, uibVar2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                uib uibVar3 = this.s;
                if (uibVar3 == null) {
                    uibVar3 = new uib(str3, 12.0f, null);
                    this.s = uibVar3;
                }
                uibVar3.p(TextUtils.ellipsize(this.h, uibVar3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new uib(gm.g0(this.K, true, false), 12.0f, null);
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
            int L = i2 + (z2 ? 0 : gm.L(8.0f));
            int L2 = bounds.top + (z2 ? 0 : gm.L(3.0f));
            int L3 = this.Y ? 0 : gm.L(3.0f);
            uib uibVar = this.n;
            if (uibVar != null) {
                uibVar.e(canvas, gm.L(56.0f) + L, gm.L(15.0f) + L2 + L3);
            }
            if (this.Y) {
                float f = this.a.e;
                if (this.r != null && f < 1.0f) {
                    canvas.save();
                    float f2 = 1.0f - f;
                    int i3 = L2 + L3;
                    canvas.scale(f2, f2, gm.L(56.0f) + L, gm.L(35.0f) + i3);
                    this.r.a.setAlpha((int) (f2 * 255.0f));
                    this.r.e(canvas, gm.L(56.0f) + L, gm.L(35.0f) + i3);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    ax9 ax9Var = this.L;
                    ax9Var.t = f;
                    ax9Var.h(wi8.B(56.0f, L, bounds.right), gm.L(30.0f));
                    canvas.save();
                    float L4 = gm.L(45.0f) + L;
                    this.M = L4;
                    float L5 = gm.L(21.0f) + L2 + L3;
                    this.N = L5;
                    canvas.translate(L4, L5);
                    ax9Var.b(canvas);
                    canvas.restore();
                }
            }
            uib uibVar2 = this.s;
            if (uibVar2 != null) {
                uibVar2.e(canvas, gm.L(56.0f) + L, gm.L((this.Y ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = gm.L(2.0f) + L;
            this.b0 = L6;
            int L7 = gm.L(5.0f) + L2;
            this.c0 = L7;
            radialProgress2.p(L6, L7, gm.L(44.0f) + gm.L(2.0f) + L, gm.L(44.0f) + gm.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.d0 / 255.0f);
            imageReceiver.j0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Z && (drawable = this.Q) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                int z3 = (int) aq1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - d53.k.getInterpolation(imageReceiver.i1)) * gm.L(16.0f)));
                this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                this.Q.setBounds(z3, interpolation, intrinsicWidth + z3, intrinsicHeight + interpolation);
                this.Q.draw(canvas);
            }
            radialProgress2.p(bounds.centerX() - gm.L(22.0f), bounds.centerY() - gm.L(22.0f), gm.L(22.0f) + bounds.centerX(), gm.L(22.0f) + bounds.centerY());
            if (this.H && this.w != null) {
                canvas.drawRoundRect(gm.L(6.0f) + bounds.left, gm.L(6.0f) + bounds.top, bounds.left + this.w.c + gm.L(18.0f), gm.L(23.0f) + bounds.top, gm.L(8.5f), gm.L(8.5f), this.x);
                this.w.e(canvas, gm.L(12.0f) + bounds.left, gm.L(15.0f) + bounds.top);
            }
        }
        if (this.Z) {
            return;
        }
        k47 k47Var = this.I;
        if (k47Var == null || !k47Var.n4()) {
            bd4 bd4Var = this.R;
            if (bd4Var == null || !bd4Var.g) {
                if (this.Y) {
                    if (bd4Var != null && bd4Var.f) {
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
        } else if (fn5.z().t(this.G) == null) {
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
            return !MediaController.w().C() ? 1 : 0;
        }
        if (this.H || z) {
            return 0;
        }
        if (!this.X) {
            return 4;
        }
        bd4 bd4Var = this.R;
        return (bd4Var == null || !bd4Var.f) ? 2 : 5;
    }

    @Override // zw9
    public final void f(float f) {
        if (j()) {
            MediaController.w().h0(MediaController.w().v0, f);
            p(true);
        }
    }

    public final int g(int i) {
        if (this.Y) {
            return gm.L(63.0f);
        }
        if (this.X) {
            return gm.L(56.0f);
        }
        int i2 = this.V;
        if (i2 == 0) {
            return gm.L(100.0f);
        }
        return Math.min(Math.round((i / i2) * this.W), this.E ? (i << 2) / 5 : (i * 5) / 4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // cr3
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // zw9
    public final void h(float f) {
        if (j()) {
            k47 k47Var = MediaController.w().v0;
            k47Var.b0 = f;
            k47Var.i0 = (int) (k47Var.L0() * f);
            p(true);
        }
    }

    @Override // cr3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
        }
        if (this.Y) {
            n(min >= 1.0f ? 4 : 3, true);
        } else {
            m(min >= 1.0f ? e() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.Y && MediaController.w().D(this.I) && MediaController.w().v0 != null && MediaController.w().v0.m0 == this.E;
    }

    public final boolean k(float f, float f2, int i) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i == 0) {
            int L = gm.L(36.0f);
            int L2 = gm.L(27.0f);
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
                bd4 bd4Var = this.R;
                if (bd4Var != null) {
                    TLRPC.Document document = bd4Var.b;
                    int i2 = bd4Var.a;
                    if (bd4Var.g) {
                        bc4.G(i2).f(document);
                        bd4Var.a();
                    } else if (!bd4Var.f) {
                        bc4.G(i2).X(document, bd4Var.d, 2, 0);
                        bd4Var.a();
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

    @Override // cr3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
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
    public final void o(k47 k47Var, TLRPC.MessageMedia messageMedia, k47 k47Var2, int i, String str, boolean z) {
        boolean z2;
        boolean z3;
        TLRPC.Document document;
        int i2;
        double d;
        String str2 = this.F;
        this.V = 0;
        this.W = 0;
        this.I = k47Var;
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
                TLRPC.PhotoSize w = bc4.w(photo.sizes, 40, false, null, false);
                TLRPC.PhotoSize w2 = bc4.w(photo.sizes, gm.Y0(false), true, w, true);
                if (w2 != null) {
                    int i4 = w2.w;
                    this.V = i4;
                    int i5 = w2.h;
                    this.W = i5;
                    Locale locale = Locale.US;
                    float f = gm.p;
                    String n = td4.n((int) (i4 / f), (int) (i5 / f), "_");
                    String concat = n.concat("_b");
                    this.F = !TextUtils.isEmpty(str) ? str : k47.U0(messageMedia);
                    z3 = true;
                    imageReceiver.Z(gn5.f(w2, photo), n, gn5.f(w, photo), concat, null, w2.size, null, k47Var2, 1);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z3 = true;
                if (messageMedia.geo != null) {
                    if (this.O == null) {
                        meb c = eq3.c((cmb.I.o() ? 3 : 6) * 0.12f, cmb.Fc);
                        this.O = c;
                        c.t = true;
                        this.P = new bk2(c);
                    }
                    if (this.Q == null) {
                        this.Q = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Z = true;
                    this.V = i;
                    int i6 = (i * 9) / 16;
                    this.W = i6;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f2 = gm.p;
                    imageReceiver.a0(gn5.p(vuc.b(geoPoint, (int) (i / f2), (int) (i6 / f2), 15, Math.min(2, (int) Math.ceil(f2)))), null, null, null, this.P, k47Var2, 0);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.R = new bd4(i3, k47Var, document, str);
                this.F = !TextUtils.isEmpty(str) ? str : k47.U0(messageMedia);
                if (k47.J3(document)) {
                    this.Y = true;
                    this.e = k47.x1(document);
                    this.f = k47.v1(document);
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
                    if (k47.W2(document)) {
                        TLRPC.PhotoSize w3 = bc4.w(document.thumbs, gm.L(22.0f), true, null, false);
                        radialProgress2.j(bc4.w(document.thumbs, gm.L(44.0f), true, w3, true), w3, document, this.I);
                    } else {
                        String t0 = k47.t0(document, true);
                        if (TextUtils.isEmpty(t0)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t0);
                        }
                    }
                    this.J = d;
                    this.h = gm.k0(j() ? MediaController.w().v0.i0 : 0, (int) this.J);
                    z3 = true;
                } else if (k47.J4(document)) {
                    this.K = (int) Math.max(1L, Math.round(k47.H0(document)));
                    this.H = true;
                    TLRPC.PhotoSize w4 = bc4.w(document.thumbs, gm.Y0(false), true, null, true);
                    float f3 = i;
                    TLRPC.PhotoSize w5 = bc4.w(document.thumbs, (int) (f3 / gm.p), false, w4, false);
                    gn5 c2 = gn5.c(w4, document);
                    gn5 c3 = gn5.c(w5, document);
                    int i8 = (int) (f3 / gm.p);
                    if (w4 != null) {
                        int i9 = w4.w;
                        this.V = i9;
                        int i10 = w4.h;
                        this.W = i10;
                        if (i9 != 0) {
                            i2 = (i10 * i8) / i9;
                            String n2 = td4.n(i8, i2, "_");
                            z3 = true;
                            imageReceiver.Y(null, n2, c2, n2, c3, n2, null, 0L, null, k47Var2, 0);
                        }
                        i2 = i8;
                        String n22 = td4.n(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, n22, c2, n22, c3, n22, null, 0L, null, k47Var2, 0);
                    } else {
                        if (w5 != null) {
                            int i11 = w5.w;
                            this.V = i11;
                            int i12 = w5.h;
                            this.W = i12;
                            if (i11 != 0) {
                                i2 = (i12 * i8) / i11;
                                String n222 = td4.n(i8, i2, "_");
                                z3 = true;
                                imageReceiver.Y(null, n222, c2, n222, c3, n222, null, 0L, null, k47Var2, 0);
                            }
                        }
                        i2 = i8;
                        String n2222 = td4.n(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, n2222, c2, n2222, c3, n2222, null, 0L, null, k47Var2, 0);
                    }
                } else {
                    z3 = true;
                    this.X = true;
                    this.e = bc4.B(document);
                    String str3 = gm.i0(document.size, false, false) + " " + bc4.A(document);
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
                    er3.q(i3).v(this);
                }
                if (!TextUtils.isEmpty(this.F)) {
                    er3.q(i3).a(this.F, null, this);
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
        k47 k47Var = MediaController.w().v0;
        boolean j = j();
        this.a.a(j, z);
        if (k47Var == null || !j) {
            i = 0;
        } else {
            i = k47Var.i0;
            ax9 ax9Var = this.L;
            if (!ax9Var.e) {
                ax9Var.g(k47Var.b0);
                ax9Var.q = k47Var.g0;
            }
            ax9Var.i(k47Var);
        }
        if (this.h0 != i) {
            this.h0 = i;
            this.h = gm.k0(i, (int) this.J);
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
