// default package

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
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kh8 extends Drawable implements jq3 {
    public final fm0 E;
    public final RadialProgress2 F;
    public r47 G;
    public final lp H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final hn a;
    public final lc0 b;
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

    public kh8(int i, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new lp((byte) 12, false);
        this.e = i;
        this.d = view;
        this.E = new fm0(380L, view, k43.h);
        hn hnVar = new hn(false, false, false);
        this.a = hnVar;
        hnVar.b = 21;
        hnVar.w(hl.L(11.0f));
        hnVar.setCallback(view);
        this.b = new lc0(i, view, hl.L(18.0f), hl.L(8.33f), hl.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.q0(hl.L(5.0f));
        paint.setColor(TLObject.FLAG_30);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(18.0f));
        radialProgress2.d = -1;
        this.J = lq3.q(i).k();
    }

    public final void a(TLRPC.Photo photo, r47 r47Var) {
        TLRPC.PhotoSize w = xb4.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w2 = xb4.w(photo.sizes, hl.L(36.0f), false, w, true);
        this.c.Z(jn5.f(w2, photo), "36_36", jn5.f(w, photo), "36_36_b", null, w2 != null ? w2.size : 0L, null, r47Var, 1);
    }

    public final void b(boolean z) {
        if (this.G.n4() || this.G.Y2()) {
            return;
        }
        if (TextUtils.isEmpty(this.I) || !xb4.G(this.e).S(this.I)) {
            f(this.w ? 0 : 4, z);
        } else {
            f(3, z);
        }
    }

    public final void c(Canvas canvas) {
        int w0;
        Rect bounds = getBounds();
        int L = hl.L(this.f ? 56.33f : 19.0f);
        if (this.E.e > 0.0f) {
            a76 a76Var = this.b.c.d;
            float f = a76Var.c.a;
            int i = (int) a76Var.f.a;
            int U1 = (bounds.right - L) - hl.U1(f, hl.L(2.0f), hl.L(4.0f) + i);
            if (f > 0.0f) {
                lc0 lc0Var = this.b;
                lc0Var.i = (int) (this.E.e * 255.0f);
                lc0Var.setBounds((bounds.right - L) - i, bounds.bottom - hl.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - hl.L(21.33f);
            hn hnVar = this.a;
            hnVar.C = (int) (this.E.e * 255.0f);
            hnVar.setBounds(bounds.left, hl.L(15.0f) + L2, U1, L2 - hl.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = hl.L(36.0f);
            Rect rect = hl.Q;
            rect.set(qu6.x(9.0f, bounds.right, L3), qu6.x(4.0f, bounds.bottom, L3), bounds.right - hl.L(9.0f), bounds.bottom - hl.L(4.0f));
            RectF rectF = hl.P;
            rectF.set(rect);
            this.F.a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.c.j0(rect);
            if (!this.n || this.r) {
                this.c.h(canvas, null);
            }
            if (this.w || this.n) {
                if (!this.n || this.r) {
                    canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), this.x);
                } else {
                    this.y.setColor(vm2.o(aob.w0(null, this.G.O3() ? aob.Wc : aob.Vc, false), 16));
                    canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), this.y);
                }
            }
            if (this.n) {
                Drawable drawable = this.s;
                if (drawable == null) {
                    drawable = c00.e(a.b, R.drawable.media_link_24);
                    this.s = drawable;
                }
                lp lpVar = this.H;
                if (this.r) {
                    w0 = -1;
                } else {
                    w0 = aob.w0(null, this.G.O3() ? aob.jc : aob.ee, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                lpVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) lpVar.c;
                if (porterDuffColorFilter == null || lpVar.b != w0 || ((PorterDuff.Mode) lpVar.d) != mode) {
                    porterDuffColorFilter = new PorterDuffColorFilter(w0, mode);
                    lpVar.c = porterDuffColorFilter;
                    lpVar.b = w0;
                    lpVar.d = mode;
                }
                drawable.setColorFilter(porterDuffColorFilter);
                br3.e(this.s, rectF.centerX(), rectF.centerY(), hl.L(24.0f), hl.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f) {
        lc0 lc0Var = this.b;
        float c = this.a.c() + lc0Var.c.d.f.a;
        float L = lc0Var.c.d.c.a * hl.L(4.0f);
        float f2 = this.E.e;
        return (f * f2) + (L * f2) + c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        return this.a.d + (this.L > 0 ? hl.L((r2 * 9.34f) + 8.66f) : 0);
    }

    public final void f(int i, boolean z) {
        if (this.M != i) {
            this.M = i;
            this.F.setIcon(i, true, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(r47 r47Var, TLRPC.MessageMedia messageMedia, r47 r47Var2, String str, boolean z) {
        ImageReceiver imageReceiver;
        boolean z2;
        boolean z3;
        TLRPC.GeoPoint geoPoint;
        this.G = r47Var;
        String str2 = this.I;
        this.K = false;
        this.I = null;
        ImageReceiver imageReceiver2 = this.c;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            this.r = false;
            this.n = false;
            this.w = false;
            z2 = true;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.n = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.r = true;
                    a(photo, r47Var2);
                } else {
                    imageReceiver2.f();
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                        TLRPC.Document document = tL_messageMediaDocument.document;
                        if (document != null) {
                            this.I = !TextUtils.isEmpty(str) ? str : r47.U0(messageMedia);
                            if (r47.J4(tL_messageMediaDocument.document)) {
                                TLRPC.PhotoSize w = xb4.w(document.thumbs, 40, false, null, false);
                                TLRPC.PhotoSize w2 = xb4.w(document.thumbs, hl.L(36.0f), false, w, true);
                                this.w = true;
                                this.K = true;
                                jn5 f = jn5.f(w2, document);
                                jn5 f2 = jn5.f(w, document);
                                imageReceiver = imageReceiver2;
                                imageReceiver.Z(f, "36_36", f2, "36_36_b", null, w2 != null ? w2.size : 0L, null, r47Var2, 1);
                            } else {
                                imageReceiver = imageReceiver2;
                                boolean z4 = r47.t4(document) || r47.M4(document);
                                boolean K2 = r47.K2(document, true);
                                if (z4 || K2) {
                                    imageReceiver.c0(jn5.b(document), "36_36", lp3.f(document, aob.cd, 1.0f, null), document.size, z4 ? "webp" : null, r47Var2, 1);
                                }
                                z2 = false;
                            }
                        }
                    } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                        int min = Math.min(2, (int) Math.ceil(hl.p));
                        int i = jxc.i;
                        jn5 p = jn5.p(jxc.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 36, 36, 13, min));
                        imageReceiver = imageReceiver2;
                        imageReceiver.a0(p, null, null, null, null, r47Var2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z2 = false;
                    }
                    this.h = z2;
                    if (!z2) {
                        imageReceiver.f();
                    }
                    z3 = this.w;
                    RadialProgress2 radialProgress2 = this.F;
                    if (z3) {
                        radialProgress2.setColors(0, 0, aob.w0(null, aob.ef, false), aob.w0(null, aob.ff, false));
                    } else {
                        int i2 = aob.cf;
                        int w0 = aob.w0(null, i2, false);
                        int i3 = aob.df;
                        int w02 = aob.w0(null, i3, false);
                        int i4 = aob.ef;
                        int w03 = aob.w0(null, i4, false);
                        int i5 = aob.ff;
                        radialProgress2.setColors(w0, w02, w03, aob.w0(null, i5, false));
                        radialProgress2.g(i2, i3, i4, i5);
                    }
                    if (!TextUtils.equals(str2, this.I)) {
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        int i6 = this.e;
                        if (!isEmpty) {
                            lq3.q(i6).v(this);
                        }
                        if (!TextUtils.isEmpty(this.I)) {
                            lq3.q(i6).a(this.I, null, this);
                        }
                    }
                    b(z);
                }
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.K = true;
                this.I = !TextUtils.isEmpty(str) ? str : r47.U0(messageMedia);
                a(tL_messageMediaPhoto.photo, r47Var2);
            }
            imageReceiver = imageReceiver2;
            this.h = z2;
            if (!z2) {
            }
            z3 = this.w;
            RadialProgress2 radialProgress22 = this.F;
            if (z3) {
            }
            if (!TextUtils.equals(str2, this.I)) {
            }
            b(z);
        }
        imageReceiver = imageReceiver2;
        z2 = false;
        this.h = z2;
        if (!z2) {
        }
        z3 = this.w;
        RadialProgress2 radialProgress222 = this.F;
        if (z3) {
        }
        if (!TextUtils.equals(str2, this.I)) {
        }
        b(z);
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final void h(ArrayList arrayList, boolean z) {
        this.L = arrayList != null ? arrayList.size() : 0;
        this.b.d(arrayList, z);
    }

    @Override // jq3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.o(true, min);
        f(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    public final void j(int i, boolean z) {
        this.a.t(i > 0 ? ob6.S(null, i) : null, z, true);
    }

    public final void k(int i) {
        this.a.u(i);
    }

    @Override // jq3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.o(true, min);
        f(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // jq3
    public final void B(boolean z) {
    }

    @Override // jq3
    public final void N(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
