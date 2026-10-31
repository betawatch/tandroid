package ih;

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
import org.telegram.messenger.b30;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.hc;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.v5;
import org.telegram.messenger.z20;
import org.telegram.messenger.z5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends Drawable implements z5, jn0 {
    public final boolean D;
    public String E;
    public String F;
    public boolean G;
    public jj H;
    public double I;
    public int J;
    public final kn0 K;
    public float L;
    public float M;
    public c00 N;
    public up O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final fe.b a;
    public int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public final ViewGroup d;
    public final int d0;
    public String e;
    public int e0;
    public String f;
    public int f0;
    public int g0;
    public String h;
    public qz0 n;
    public qz0 r;
    public qz0 s;
    public qz0 w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int Z = 0;
    public int c0 = zs.e4;

    public h(int i10, ViewGroup viewGroup, p6 p6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.J0(i0.L(6.0f));
        this.c = i10;
        this.D = z10;
        this.y = new RadialProgress2(viewGroup, p6Var);
        this.d = viewGroup;
        kn0 kn0Var = new kn0(viewGroup);
        this.K = kn0Var;
        kn0Var.h = this;
        this.a = new fe.b(viewGroup, ee.a.a, 180L);
        this.d0 = b6.q(i10).k();
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        e();
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        e();
    }

    public final void a() {
        this.b.P();
        this.y.e();
    }

    public final void b(boolean z10) {
        qz0 qz0Var = this.n;
        if (qz0Var != null) {
            qz0Var.n(t6.x0(null, z10 ? t6.tc : t6.re, false));
        }
        this.x.setColor(1711276032);
        qz0 qz0Var2 = this.w;
        if (qz0Var2 != null) {
            qz0Var2.n(-1);
        }
        c00 c00Var = this.N;
        if (c00Var != null) {
            c00Var.m = z10 ? t6.Dc : t6.ef;
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.y;
        if (!z11 && !this.W) {
            radialProgress2.g(t6.Ze, t6.af, t6.bf, t6.cf);
            return;
        }
        kn0 kn0Var = this.K;
        if (z10) {
            int x02 = t6.x0(null, t6.kc, false);
            int x03 = t6.x0(null, t6.lc, false);
            int i10 = t6.nc;
            kn0Var.g(x02, x03, t6.x0(null, i10, false), t6.x0(null, i10, false), t6.x0(null, t6.mc, false));
            radialProgress2.g(t6.Bc, t6.Cc, t6.Db, t6.Eb);
            return;
        }
        radialProgress2.g(t6.We, t6.Xe, t6.id, t6.jd);
        int x04 = t6.x0(null, t6.ie, false);
        int x05 = t6.x0(null, t6.je, false);
        int i11 = t6.le;
        kn0Var.g(x04, x05, t6.x0(null, i11, false), t6.x0(null, i11, false), t6.x0(null, t6.ke, false));
    }

    @Override // org.telegram.ui.Components.jn0
    public final void c(float f7) {
        if (j()) {
            MediaController.B().i0(MediaController.B().u0, f7);
            p(true);
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void d(float f7) {
        if (j()) {
            jj jjVar = MediaController.B().u0;
            jjVar.b0 = f7;
            jjVar.g0 = (int) (jjVar.L0() * f7);
            p(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.c0 == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.W;
        int i10 = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z10 || this.X) {
            int i11 = bounds.left;
            boolean z11 = this.D;
            int L = i11 + (z11 ? 0 : i0.L(8.0f));
            int L2 = bounds.top + (z11 ? 0 : i0.L(3.0f));
            int L3 = this.X ? 0 : i0.L(3.0f);
            qz0 qz0Var = this.n;
            if (qz0Var != null) {
                qz0Var.e(canvas, i0.L(56.0f) + L, i0.L(15.0f) + L2 + L3);
            }
            if (this.X) {
                float f7 = this.a.e;
                if (this.r != null && f7 < 1.0f) {
                    canvas.save();
                    float f10 = 1.0f - f7;
                    int i12 = L2 + L3;
                    canvas.scale(f10, f10, i0.L(56.0f) + L, i0.L(35.0f) + i12);
                    this.r.a.setAlpha((int) (f10 * 255.0f));
                    this.r.e(canvas, i0.L(56.0f) + L, i0.L(35.0f) + i12);
                    canvas.restore();
                }
                if (f7 > 0.0f) {
                    kn0 kn0Var = this.K;
                    kn0Var.t = f7;
                    kn0Var.i(z20.w(56.0f, L, bounds.right), i0.L(30.0f));
                    canvas.save();
                    float L4 = i0.L(45.0f) + L;
                    this.L = L4;
                    float L5 = i0.L(21.0f) + L2 + L3;
                    this.M = L5;
                    canvas.translate(L4, L5);
                    kn0Var.b(canvas);
                    canvas.restore();
                }
            }
            qz0 qz0Var2 = this.s;
            if (qz0Var2 != null) {
                qz0Var2.e(canvas, i0.L(56.0f) + L, i0.L((this.X ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = i0.L(2.0f) + L;
            this.a0 = L6;
            int L7 = i0.L(5.0f) + L2;
            this.b0 = L7;
            radialProgress2.r(L6, L7, i0.L(44.0f) + i0.L(2.0f) + L, i0.L(44.0f) + i0.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.c0 / 255.0f);
            imageReceiver.z0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Y && (drawable = this.P) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                int B = (int) c3.i0.B(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - gr.k.getInterpolation(imageReceiver.h1)) * i0.L(16.0f)));
                this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.h1 * 5.0f) * 255.0f));
                this.P.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
                this.P.draw(canvas);
            }
            radialProgress2.r(bounds.centerX() - i0.L(22.0f), bounds.centerY() - i0.L(22.0f), i0.L(22.0f) + bounds.centerX(), i0.L(22.0f) + bounds.centerY());
            if (this.G && this.w != null) {
                canvas.drawRoundRect(i0.L(6.0f) + bounds.left, i0.L(6.0f) + bounds.top, bounds.left + this.w.c + i0.L(18.0f), i0.L(23.0f) + bounds.top, i0.L(8.5f), i0.L(8.5f), this.x);
                this.w.e(canvas, i0.L(12.0f) + bounds.left, i0.L(15.0f) + bounds.top);
            }
        }
        if (this.Y) {
            return;
        }
        jj jjVar = this.H;
        if (jjVar == null || !jjVar.o4()) {
            a aVar = this.Q;
            if (aVar == null || !aVar.g) {
                if (this.X) {
                    if (aVar != null && aVar.f) {
                        i10 = 4;
                    }
                    m(i10, true);
                } else {
                    l(g());
                }
            } else if (this.X) {
                m(3, true);
            } else {
                l(3);
            }
        } else if (hc.D().x(this.F) == null) {
            radialProgress2.p(true, 1.0f);
            if (this.X) {
                m(6, true);
            } else {
                l(6);
            }
        }
        if (this.X) {
            l(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        int width = getBounds().width() - i0.L(this.D ? 64.0f : 72.0f);
        if (this.Z != width || z10) {
            this.Z = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new qz0(str, 15.0f, i0.o());
                }
                qz0 qz0Var = this.n;
                qz0Var.q(TextUtils.ellipsize(this.e, qz0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new qz0(str2, 14.0f, null);
                }
                qz0 qz0Var2 = this.r;
                qz0Var2.q(TextUtils.ellipsize(this.f, qz0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new qz0(str3, 12.0f, null);
                }
                qz0 qz0Var3 = this.s;
                qz0Var3.q(TextUtils.ellipsize(this.h, qz0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.G && this.w == null) {
                this.w = new qz0(i0.g0(this.J, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.a.f) {
            return !MediaController.B().H() ? 1 : 0;
        }
        if (this.G || z10) {
            return 0;
        }
        if (!this.W) {
            return 4;
        }
        a aVar = this.Q;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c0;
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.d0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        if (this.X) {
            return i0.L(63.0f);
        }
        if (this.W) {
            return i0.L(56.0f);
        }
        int i11 = this.U;
        if (i11 == 0) {
            return i0.L(100.0f);
        }
        return Math.min(Math.round((i10 / i11) * this.V), this.D ? (i10 * 4) / 5 : (i10 * 5) / 4);
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.X && MediaController.B().I(this.H) && MediaController.B().u0 != null && MediaController.B().u0.k0 == this.D;
    }

    public final boolean k(float f7, float f10, int i10) {
        if (!this.X || this.f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int L = i0.L(36.0f);
            int L2 = i0.L(27.0f);
            if (f7 >= this.a0 + L2 && f7 <= r4 + L) {
                if (f10 >= this.b0 + L2 && f10 <= r7 + L) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z10 = this.R;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i11 = aVar.a;
                    if (aVar.g) {
                        b8.G(i11).f(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        b8.G(i11).X(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.R = false;
                return true;
            }
            if (i10 == 3) {
                this.R = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i10) {
        if (this.e0 != i10) {
            this.e0 = i10;
            this.y.setIcon(i10, true, true);
        }
    }

    public final void m(int i10, boolean z10) {
        if (this.f0 != i10) {
            this.f0 = i10;
            this.y.k(i10, true, z10);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(jj jjVar, TLRPC.MessageMedia messageMedia, jj jjVar2, int i10, String str, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.Document document;
        int i11;
        double d;
        String str2 = this.E;
        this.U = 0;
        this.V = 0;
        this.H = jjVar;
        this.T = messageMedia;
        this.W = false;
        this.X = false;
        this.G = false;
        this.Y = false;
        this.I = 0.0d;
        this.J = 0;
        this.F = str;
        this.E = null;
        this.Q = null;
        int i12 = this.c;
        RadialProgress2 radialProgress2 = this.y;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, 40, false, null, false);
                TLRPC.PhotoSize w10 = b8.w(photo.sizes, i0.Z0(false), true, w9, true);
                if (w10 != null) {
                    int i13 = w10.w;
                    this.U = i13;
                    int i14 = w10.h;
                    this.V = i14;
                    Locale locale = Locale.US;
                    float f7 = i0.p;
                    String i15 = a1.g.i((int) (i13 / f7), (int) (i14 / f7), "_");
                    String concat = i15.concat("_b");
                    this.E = !TextUtils.isEmpty(str) ? str : jj.U0(messageMedia);
                    z12 = true;
                    imageReceiver.r0(ic.f(w10, photo), i15, ic.f(w9, photo), concat, null, w10.size, null, jjVar2, 1);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z12 = true;
                if (messageMedia.geo != null) {
                    if (this.N == null) {
                        c00 c10 = v5.c((t6.I.q() ? 3 : 6) * 0.12f, t6.Dc);
                        this.N = c10;
                        c10.t = true;
                        this.O = new up(c10);
                    }
                    if (this.P == null) {
                        this.P = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Y = true;
                    this.U = i10;
                    int i16 = (i10 * 9) / 16;
                    this.V = i16;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f10 = i0.p;
                    imageReceiver.s0(ic.p(b30.b(geoPoint, (int) (i10 / f10), (int) (i16 / f10), 15, Math.min(2, (int) Math.ceil(f10)))), null, null, null, this.O, jjVar2, 0);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.Q = new a(i12, jjVar, document, str);
                this.E = !TextUtils.isEmpty(str) ? str : jj.U0(messageMedia);
                if (jj.J3(document)) {
                    this.X = true;
                    this.e = jj.y1(document);
                    this.f = jj.w1(document);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i17);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i17++;
                    }
                    if (jj.W2(document)) {
                        TLRPC.PhotoSize w11 = b8.w(document.thumbs, i0.L(22.0f), true, null, false);
                        radialProgress2.j(b8.w(document.thumbs, i0.L(44.0f), true, w11, true), w11, document, this.H);
                    } else {
                        String t02 = jj.t0(document, true);
                        if (TextUtils.isEmpty(t02)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t02);
                        }
                    }
                    this.I = d;
                    this.h = i0.k0(j() ? MediaController.B().u0.g0 : 0, (int) this.I);
                    z12 = true;
                } else if (jj.K4(document)) {
                    this.J = (int) Math.max(1L, Math.round(jj.H0(document)));
                    this.G = true;
                    TLRPC.PhotoSize w12 = b8.w(document.thumbs, i0.Z0(false), true, null, true);
                    float f11 = i10;
                    TLRPC.PhotoSize w13 = b8.w(document.thumbs, (int) (f11 / i0.p), false, w12, false);
                    ic c11 = ic.c(w12, document);
                    ic c12 = ic.c(w13, document);
                    int i18 = (int) (f11 / i0.p);
                    if (w12 != null) {
                        int i19 = w12.w;
                        this.U = i19;
                        int i20 = w12.h;
                        this.V = i20;
                        if (i19 != 0) {
                            i11 = (i20 * i18) / i19;
                            String i21 = a1.g.i(i18, i11, "_");
                            z12 = true;
                            imageReceiver.u0(null, i21, c11, i21, c12, i21, null, 0L, null, jjVar2, 0);
                        }
                        i11 = i18;
                        String i212 = a1.g.i(i18, i11, "_");
                        z12 = true;
                        imageReceiver.u0(null, i212, c11, i212, c12, i212, null, 0L, null, jjVar2, 0);
                    } else {
                        if (w13 != null) {
                            int i22 = w13.w;
                            this.U = i22;
                            int i23 = w13.h;
                            this.V = i23;
                            if (i22 != 0) {
                                i11 = (i23 * i18) / i22;
                                String i2122 = a1.g.i(i18, i11, "_");
                                z12 = true;
                                imageReceiver.u0(null, i2122, c11, i2122, c12, i2122, null, 0L, null, jjVar2, 0);
                            }
                        }
                        i11 = i18;
                        String i21222 = a1.g.i(i18, i11, "_");
                        z12 = true;
                        imageReceiver.u0(null, i21222, c11, i21222, c12, i21222, null, 0L, null, jjVar2, 0);
                    }
                } else {
                    z12 = true;
                    this.W = true;
                    this.e = b8.B(document);
                    String str3 = i0.i0(document.size, false, false) + " " + b8.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z12);
                z11 = z12;
            }
            this.S = z11;
            if (!z11) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.E)) {
                if (!TextUtils.isEmpty(str2)) {
                    b6.q(i12).v(this);
                }
                if (!TextUtils.isEmpty(this.E)) {
                    b6.q(i12).a(this.E, null, this);
                }
            }
            if (!this.X) {
                radialProgress2.i(null, null, null);
                m(4, false);
            }
            p(z10);
        }
        z11 = false;
        this.S = z11;
        if (!z11) {
        }
        if (!TextUtils.equals(str2, this.E)) {
        }
        if (!this.X) {
        }
        p(z10);
    }

    public final void p(boolean z10) {
        int i10;
        if (!this.X || this.H == null) {
            return;
        }
        jj jjVar = MediaController.B().u0;
        boolean j10 = j();
        this.a.a(j10, z10);
        if (jjVar == null || !j10) {
            i10 = 0;
        } else {
            i10 = jjVar.g0;
            kn0 kn0Var = this.K;
            if (!kn0Var.e) {
                kn0Var.h(jjVar.b0);
                kn0Var.q = jjVar.e0;
            }
            kn0Var.j(jjVar);
        }
        if (this.g0 != i10) {
            this.g0 = i10;
            this.h = i0.k0(i10, (int) this.I);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c0 = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
