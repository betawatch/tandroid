package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import fe.j;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b30;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.v5;
import org.telegram.messenger.w0;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w8;
import rf.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends Drawable implements z5 {
    public final fe.b D;
    public final RadialProgress2 E;
    public jj F;
    public final a5.a G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final e6 a;
    public final w8 b;
    public final ImageReceiver c;
    public final View d;
    public final int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public Drawable s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    public b(int i10, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.G = new a5.a((char) 0, 16);
        this.e = i10;
        this.d = view;
        this.D = new fe.b(view, gr.h, 380L);
        e6 e6Var = new e6(false, false, false);
        this.a = e6Var;
        e6Var.b = 21;
        e6Var.w(i0.L(11.0f));
        e6Var.setCallback(view);
        this.b = new w8(i10, view, i0.L(18.0f), i0.L(8.33f), i0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.J0(i0.L(5.0f));
        paint.setColor(TLObject.FLAG_30);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(18.0f));
        radialProgress2.d = -1;
        this.I = b6.q(i10).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w10 = b8.w(photo.sizes, i0.L(36.0f), false, w9, true);
        this.c.r0(ic.f(w10, photo), "36_36", ic.f(w9, photo), "36_36_b", null, w10 != null ? w10.size : 0L, null, obj, 1);
    }

    public final void b(boolean z10) {
        if (this.F.o4() || this.F.Y2()) {
            return;
        }
        if (TextUtils.isEmpty(this.H) || !b8.G(this.e).T(this.H)) {
            g(this.w ? 0 : 4, z10);
        } else {
            g(3, z10);
        }
    }

    public final void c(Canvas canvas) {
        int x02;
        Rect bounds = getBounds();
        int L = i0.L(this.f ? 56.33f : 19.0f);
        if (this.D.e > 0.0f) {
            j jVar = this.b.c.d;
            float f7 = jVar.c.a;
            int i10 = (int) jVar.f.a;
            int W1 = (bounds.right - L) - i0.W1(f7, i0.L(2.0f), i0.L(4.0f) + i10);
            if (f7 > 0.0f) {
                w8 w8Var = this.b;
                w8Var.i = (int) (this.D.e * 255.0f);
                w8Var.setBounds((bounds.right - L) - i10, bounds.bottom - i0.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - i0.L(21.33f);
            e6 e6Var = this.a;
            e6Var.B = (int) (this.D.e * 255.0f);
            e6Var.setBounds(bounds.left, i0.L(15.0f) + L2, W1, L2 - i0.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = i0.L(36.0f);
            Rect rect = i0.Q;
            rect.set(m5.z(9.0f, bounds.right, L3), m5.z(4.0f, bounds.bottom, L3), bounds.right - i0.L(9.0f), bounds.bottom - i0.L(4.0f));
            RectF rectF = i0.P;
            rectF.set(rect);
            this.E.a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.c.z0(rect);
            if (!this.n || this.r) {
                this.c.h(canvas, null);
            }
            if (this.w || this.n) {
                if (!this.n || this.r) {
                    canvas.drawRoundRect(rectF, i0.L(5.0f), i0.L(5.0f), this.x);
                } else {
                    this.y.setColor(i0.b.o(t6.x0(null, this.F.P3() ? t6.Tc : t6.Sc, false), 16));
                    canvas.drawRoundRect(rectF, i0.L(5.0f), i0.L(5.0f), this.y);
                }
            }
            if (this.n) {
                if (this.s == null) {
                    this.s = i0.a.f(w0.b, R.drawable.media_link_24);
                }
                Drawable drawable = this.s;
                a5.a aVar = this.G;
                if (this.r) {
                    x02 = -1;
                } else {
                    x02 = t6.x0(null, this.F.P3() ? t6.gc : t6.be, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.c) == null || aVar.b != x02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.c = new PorterDuffColorFilter(x02, mode);
                    aVar.b = x02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.c);
                o.e(this.s, rectF.centerX(), rectF.centerY(), i0.L(24.0f), i0.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f7) {
        w8 w8Var = this.b;
        float c10 = this.a.c() + w8Var.c.d.f.a;
        float L = w8Var.c.d.c.a * i0.L(4.0f);
        float f10 = this.D.e;
        return (f7 * f10) + (L * f10) + c10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        return this.a.d + (this.K > 0 ? i0.L((r1 * 9.34f) + 8.66f) : 0);
    }

    public final void f(boolean z10) {
        this.f = z10;
    }

    public final void g(int i10, boolean z10) {
        if (this.L != i10) {
            this.L = i10;
            this.E.setIcon(i10, true, z10);
        }
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(jj jjVar, TLRPC.MessageMedia messageMedia, jj jjVar2, String str, boolean z10) {
        ImageReceiver imageReceiver;
        boolean z11;
        boolean z12;
        TLRPC.GeoPoint geoPoint;
        this.F = jjVar;
        String str2 = this.H;
        this.J = false;
        this.H = null;
        ImageReceiver imageReceiver2 = this.c;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            this.r = false;
            this.n = false;
            this.w = false;
            z11 = true;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.n = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.r = true;
                    a(photo, jjVar2);
                } else {
                    imageReceiver2.f();
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                        TLRPC.Document document = tL_messageMediaDocument.document;
                        if (document != null) {
                            this.H = !TextUtils.isEmpty(str) ? str : jj.U0(messageMedia);
                            if (jj.K4(tL_messageMediaDocument.document)) {
                                TLRPC.PhotoSize w9 = b8.w(document.thumbs, 40, false, null, false);
                                TLRPC.PhotoSize w10 = b8.w(document.thumbs, i0.L(36.0f), false, w9, true);
                                this.w = true;
                                this.J = true;
                                ic f7 = ic.f(w10, document);
                                ic f10 = ic.f(w9, document);
                                imageReceiver = imageReceiver2;
                                imageReceiver.r0(f7, "36_36", f10, "36_36_b", null, w10 != null ? w10.size : 0L, null, jjVar2, 1);
                            } else {
                                imageReceiver = imageReceiver2;
                                boolean z13 = jj.u4(document) || jj.N4(document);
                                boolean K2 = jj.K2(document, true);
                                if (z13 || K2) {
                                    imageReceiver.p0(ic.b(document), "36_36", v5.f(document, t6.Zc, 1.0f, null), document.size, z13 ? "webp" : null, jjVar2, 1);
                                }
                                z11 = false;
                            }
                        }
                    } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                        int min = Math.min(2, (int) Math.ceil(i0.p));
                        int i10 = b30.i;
                        ic p5 = ic.p(b30.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 36, 36, 13, min));
                        imageReceiver = imageReceiver2;
                        imageReceiver.s0(p5, null, null, null, null, jjVar2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z11 = false;
                    }
                    this.h = z11;
                    if (!z11) {
                        imageReceiver.f();
                    }
                    z12 = this.w;
                    RadialProgress2 radialProgress2 = this.E;
                    if (z12) {
                        radialProgress2.setColors(0, 0, t6.x0(null, t6.bf, false), t6.x0(null, t6.cf, false));
                    } else {
                        int i11 = t6.Ze;
                        int x02 = t6.x0(null, i11, false);
                        int i12 = t6.af;
                        int x03 = t6.x0(null, i12, false);
                        int i13 = t6.bf;
                        int x04 = t6.x0(null, i13, false);
                        int i14 = t6.cf;
                        radialProgress2.setColors(x02, x03, x04, t6.x0(null, i14, false));
                        radialProgress2.g(i11, i12, i13, i14);
                    }
                    if (!TextUtils.equals(str2, this.H)) {
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        int i15 = this.e;
                        if (!isEmpty) {
                            b6.q(i15).v(this);
                        }
                        if (!TextUtils.isEmpty(this.H)) {
                            b6.q(i15).a(this.H, null, this);
                        }
                    }
                    b(z10);
                }
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.J = true;
                this.H = !TextUtils.isEmpty(str) ? str : jj.U0(messageMedia);
                a(tL_messageMediaPhoto.photo, jjVar2);
            }
            imageReceiver = imageReceiver2;
            this.h = z11;
            if (!z11) {
            }
            z12 = this.w;
            RadialProgress2 radialProgress22 = this.E;
            if (z12) {
            }
            if (!TextUtils.equals(str2, this.H)) {
            }
            b(z10);
        }
        imageReceiver = imageReceiver2;
        z11 = false;
        this.h = z11;
        if (!z11) {
        }
        z12 = this.w;
        RadialProgress2 radialProgress222 = this.E;
        if (z12) {
        }
        if (!TextUtils.equals(str2, this.H)) {
        }
        b(z10);
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.E.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        this.K = arrayList != null ? arrayList.size() : 0;
        this.b.d(arrayList, z10);
    }

    public final void k(int i10, boolean z10) {
        this.a.t(i10 > 0 ? cd.S(null, i10) : null, z10, true);
    }

    public final void l(int i10) {
        this.a.u(i10);
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.E.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
