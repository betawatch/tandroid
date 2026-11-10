package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class yt implements x5 {
    public static ColorMatrixColorFilter U;
    public final boolean D;
    public final float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public View S;
    public final fv T;
    public final kv a;
    public final TL_iv.PageBlock b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public Bitmap e;
    public RadialProgress2 f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize n;
    public final TLRPC.TL_photoStrippedSize r;
    public final TLRPC.Document s;
    public final TLRPC.PhotoSize w;
    public final TLRPC.TL_photoStrippedSize x;
    public final boolean y;

    public yt(kv kvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i7;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.a = kvVar;
        this.b = pageblockphoto;
        TLRPC.Photo v = kvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.r = w7.Q(v.sizes);
        } else {
            this.n = null;
            this.r = null;
        }
        this.s = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.D = false;
        TLRPC.PhotoSize photoSize = this.n;
        this.E = (photoSize == null || (i7 = photoSize.h) <= 0) ? 1.0f : photoSize.w / i7;
        this.O = z5.q(kvVar.a).k();
        imageReceiver.z1 = true;
        imageReceiver2.z1 = true;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        m(this.S, false);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.y && (a() || this.R)) {
            b(true);
        }
        m(this.S, true);
    }

    public final boolean a() {
        if (this.D) {
            int i7 = iz.a;
            return sc.e(1024);
        }
        int i10 = iz.a;
        return sc.e(2048);
    }

    public final void b(boolean z9) {
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        kv kvVar = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            hc i7 = tL_photoStrippedSize != null ? hc.i(tL_photoStrippedSize, photo) : null;
            imageReceiver.N = hc.i(photoSize, photo);
            if (z9) {
                imageReceiver.u0(null, null, hc.i(photoSize, photo), null, i7, "b1", null, photoSize.size, null, kvVar.b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, i7, "b1", null, photoSize.size, null, kvVar.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            hc c10 = tL_photoStrippedSize2 != null ? hc.c(tL_photoStrippedSize2, document) : null;
            TLRPC.PhotoSize photoSize2 = this.w;
            hc c11 = photoSize2 != null ? hc.c(photoSize2, document) : null;
            imageReceiver.N = hc.b(document);
            if (!z9 || !this.y || (!a() && !this.R)) {
                imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", kvVar.b, 1);
                return;
            }
            imageReceiver.t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(hc.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", kvVar.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.c;
        xh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            fv fvVar = this.T;
            if (!fvVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.e || imageReceiver2.n() == null)) {
                    this.e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (U == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        U = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.o1 = U;
                }
                float f10 = imageReceiver.K0;
                float f11 = imageReceiver.L0;
                float f12 = imageReceiver.M0;
                float f13 = imageReceiver.N0;
                if (f12 <= 0.0f || f13 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.clipRect(f10, f11, f10 + f12, f11 + f13);
                fvVar.a(canvas);
                if (imageReceiver2.n() != null) {
                    imageReceiver2.y0(f10, f11, f12, f13);
                    imageReceiver2.setAlpha(imageReceiver.h1);
                    imageReceiver2.h(canvas, null);
                }
                kv kvVar = this.a;
                View view = kvVar.Q;
                if (view != null) {
                    xh.e eVar2 = kvVar.R;
                    if (eVar2 != null && eVar2.i) {
                        kvVar.R = null;
                    }
                    if (kvVar.R == null) {
                        kvVar.R = xh.e.e(view);
                    }
                    eVar = kvVar.R;
                }
                if (eVar != null) {
                    canvas.translate(f10, f11);
                    eVar.c(canvas, this.S, Math.round(f12), Math.round(f13), imageReceiver.h1, false);
                }
                canvas.restore();
                View view2 = this.S;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 == null || this.K == -1) {
            return;
        }
        radialProgress2.draw(canvas);
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f;
        int i7 = this.N;
        if (radialProgress2 != null || view == null) {
            if (radialProgress2 == null || view == null) {
                return;
            }
            radialProgress2.n(view);
            RadialProgress2 radialProgress22 = this.f;
            int i10 = this.L;
            int i11 = this.M;
            radialProgress22.r(i10, i11, i10 + i7, i7 + i11);
            return;
        }
        RadialProgress2 radialProgress23 = new RadialProgress2(view, null);
        this.f = radialProgress23;
        radialProgress23.d = -1;
        radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
        RadialProgress2 radialProgress24 = this.f;
        int i12 = this.L;
        int i13 = this.M;
        radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        kv kvVar = this.a;
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            w7.G(kvVar.a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(kvVar.a);
            File J2 = w7.J(photoSize, null, false, true);
            return J.exists() || (J2 != null && J2.exists());
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            w7.G(kvVar.a);
            File I = w7.I(document);
            w7.G(kvVar.a);
            File J3 = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J3 == null || !J3.exists())) {
            }
        }
    }

    public final CharSequence f() {
        String M0 = id.M0(this.y ? 2131753933 : 2131753948, null);
        return (!h() || this.T.b()) ? M0 : TextUtils.concat(M0, ", ", id.M0(2131745262, null));
    }

    public final boolean g(float f10, float f11) {
        if (f10 < this.F || f10 > r0 + this.H) {
            return false;
        }
        int i7 = this.G;
        return f11 >= ((float) i7) && f11 <= ((float) (i7 + this.I));
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.O;
    }

    public final boolean h() {
        TL_iv.PageBlock pageBlock = this.b;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
        }
        return false;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        }
        if (this.K != 1) {
            m(this.S, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            fv fvVar = this.T;
            if (!fvVar.b && fvVar.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f10 = imageReceiver.M0;
                float f11 = imageReceiver.N0;
                fvVar.c(view, (f10 / 2.0f) + imageReceiver.K0, (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                return true;
            }
        }
        kv kvVar = this.a;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (l1Var == null) {
            return false;
        }
        l1Var.b2(kvVar.E, this.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(View view, MotionEvent motionEvent) {
        boolean z9;
        org.telegram.ui.Cells.l1 l1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean g10 = g(x10, y10);
        int i7 = this.K;
        if (i7 != -1) {
            if (x10 >= this.L) {
                int i10 = this.N;
                if (x10 <= r9 + i10) {
                    if (y10 >= this.M && y10 <= r2 + i10) {
                        z9 = true;
                        if (actionMasked != 0) {
                            if (!g10 || (!z9 && i7 != 0 && i7 != 2)) {
                                if (g10) {
                                    this.Q = true;
                                    return true;
                                }
                            }
                            this.P = true;
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 3) {
                                return this.Q || this.P;
                            }
                            this.Q = false;
                            this.P = false;
                            return false;
                        }
                        boolean z10 = this.P;
                        TL_iv.PageBlock pageBlock = this.b;
                        kv kvVar = this.a;
                        ImageReceiver imageReceiver = this.c;
                        if (!z10) {
                            if (this.Q) {
                                this.Q = false;
                                if (g10) {
                                    if (view != null) {
                                        view.playSoundEffect(0);
                                    }
                                    if (h()) {
                                        fv fvVar = this.T;
                                        if (!fvVar.b && fvVar.f == null) {
                                            float f10 = imageReceiver.M0;
                                            float f11 = imageReceiver.N0;
                                            fvVar.c(view, imageReceiver.K0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.l1 l1Var2 = kvVar.F;
                                    if (l1Var2 != null) {
                                        l1Var2.b2(kvVar.E, pageBlock);
                                        return true;
                                    }
                                }
                            }
                        }
                        this.P = false;
                        if (view != null) {
                            view.playSoundEffect(0);
                            view.invalidate();
                        }
                        int i11 = this.K;
                        if (i11 == 0) {
                            this.R = true;
                            RadialProgress2 radialProgress2 = this.f;
                            if (radialProgress2 != null) {
                                radialProgress2.p(true, 0.0f);
                            }
                            b(true);
                            this.K = 1;
                            RadialProgress2 radialProgress22 = this.f;
                            if (radialProgress22 != null) {
                                radialProgress22.setIcon(3, true, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 1) {
                            this.R = false;
                            imageReceiver.c();
                            this.K = 0;
                            RadialProgress2 radialProgress23 = this.f;
                            if (radialProgress23 != null) {
                                radialProgress23.setIcon(2, false, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 2) {
                            this.R = true;
                            imageReceiver.t0 = true;
                            b(true);
                            imageReceiver.P0(false);
                            this.K = -1;
                            RadialProgress2 radialProgress24 = this.f;
                            if (radialProgress24 != null) {
                                radialProgress24.setIcon(4, false, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 3 && (l1Var = kvVar.F) != null) {
                            l1Var.b2(kvVar.E, pageBlock);
                            return true;
                        }
                    }
                }
            }
        }
        z9 = false;
        if (actionMasked != 0) {
        }
    }

    public final void l(int i7, int i10, int i11, int i12) {
        this.F = i7;
        this.G = i10;
        this.H = i11;
        this.I = i12;
        this.c.y0(i7, i10, i11, i12);
        int i13 = this.N;
        int D = jg.g.D(i11, i13, 2, i7);
        this.L = D;
        int D2 = jg.g.D(i12, i13, 2, i10);
        this.M = D2;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.r(D, D2, D + i13, i13 + D2);
        }
        boolean z9 = true;
        kv kvVar = this.a;
        TLRPC.Document document = this.s;
        boolean z10 = document == null ? (z5.q(kvVar.a).m() & 1) != 0 : !(this.y && !(a() && z5.q(kvVar.a).c(4, document.size)));
        this.J = z10;
        if (!z10 && !e()) {
            z9 = false;
        }
        b(z9);
    }

    public final void m(View view, boolean z9) {
        String r10;
        if (view == null) {
            view = this.S;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            r10 = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.s;
            r10 = document != null ? w7.r(null, document) : null;
        }
        if (TextUtils.isEmpty(r10)) {
            this.K = -1;
            RadialProgress2 radialProgress2 = this.f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.c;
        org.telegram.ui.Components.u5 m10 = imageReceiver.m();
        boolean z10 = m10 != null && (m10.s() || imageReceiver.M());
        boolean e10 = e();
        boolean z11 = this.D;
        boolean z12 = this.y;
        kv kvVar = this.a;
        if (e10 || (z12 && z10)) {
            z5.q(kvVar.a).v(this);
            if (z11 && !z10) {
                this.K = 3;
                RadialProgress2 radialProgress22 = this.f;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(0, false, z9);
                }
            } else if (!z12 || z10 || a() || this.R) {
                this.K = -1;
                RadialProgress2 radialProgress23 = this.f;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(4, false, z9);
                }
            } else {
                this.K = 2;
                RadialProgress2 radialProgress24 = this.f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(8, false, z9);
                }
            }
        } else {
            z5.q(kvVar.a).a(r10, null, this);
            if (this.J || this.R || w7.G(kvVar.a).S(r10)) {
                this.K = 1;
                Float w10 = gc.D().w(r10);
                r2 = w10 != null ? w10.floatValue() : 0.0f;
                RadialProgress2 radialProgress25 = this.f;
                if (radialProgress25 != null) {
                    radialProgress25.setIcon(3, true, z9);
                }
            } else if (z11) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, true, z9);
                }
            } else {
                this.K = 0;
                RadialProgress2 radialProgress27 = this.f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(2, true, z9);
                }
            }
            RadialProgress2 radialProgress28 = this.f;
            if (radialProgress28 != null) {
                radialProgress28.p(false, r2);
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public yt(kv kvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i7;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.a = kvVar;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.s = s5;
        boolean K4 = ij.K4(s5);
        this.D = K4;
        this.y = K4 || ij.s3(s5, false);
        if (s5 != null) {
            this.w = w7.w(s5.thumbs, qs.r5, false, null, true);
            this.x = w7.Q(s5.thumbs);
        } else {
            this.w = null;
            this.x = null;
        }
        if (s5 != null) {
            for (int i10 = 0; i10 < this.s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i7 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.w / i7;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.E = f10;
        this.O = z5.q(kvVar.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.z1 = true;
        this.d.z1 = true;
        imageReceiver.g1 = new xt(this);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
