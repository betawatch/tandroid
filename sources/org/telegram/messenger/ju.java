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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ju implements z5 {
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
    public final qv T;
    public final vv a;
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

    public ju(vv vvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i10;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new qv();
        this.a = vvVar;
        this.b = pageblockphoto;
        TLRPC.Photo v = vvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.n = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.r = b8.R(v.sizes);
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
        this.E = (photoSize == null || (i10 = photoSize.h) <= 0) ? 1.0f : photoSize.w / i10;
        this.O = b6.q(vvVar.a).k();
        imageReceiver.z1 = true;
        imageReceiver2.z1 = true;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        m(this.S, false);
    }

    @Override // org.telegram.messenger.z5
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
            int i10 = tz.a;
            return sc.e(1024);
        }
        int i11 = tz.a;
        return sc.e(2048);
    }

    public final void b(boolean z10) {
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        vv vvVar = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            ic i10 = tL_photoStrippedSize != null ? ic.i(tL_photoStrippedSize, photo) : null;
            if (z10) {
                imageReceiver.u0(null, null, ic.i(photoSize, photo), null, i10, "b1", null, photoSize.size, null, vvVar.b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, i10, "b1", null, photoSize.size, null, vvVar.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            ic c10 = tL_photoStrippedSize2 != null ? ic.c(tL_photoStrippedSize2, document) : null;
            TLRPC.PhotoSize photoSize2 = this.w;
            ic c11 = photoSize2 != null ? ic.c(photoSize2, document) : null;
            if (!z10 || !this.y || (!a() && !this.R)) {
                imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", vvVar.b, 1);
                return;
            }
            imageReceiver.t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(ic.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", vvVar.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.c;
        nh.h hVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            qv qvVar = this.T;
            if (!qvVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.e || imageReceiver2.n() == null)) {
                    this.e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (U == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        i0.n2(colorMatrix, 0.9f);
                        i0.i(colorMatrix, 0.6f);
                        U = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.o1 = U;
                }
                float f7 = imageReceiver.K0;
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                if (f11 <= 0.0f || f12 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.clipRect(f7, f10, f7 + f11, f10 + f12);
                qvVar.a(canvas);
                if (imageReceiver2.n() != null) {
                    imageReceiver2.y0(f7, f10, f11, f12);
                    imageReceiver2.setAlpha(imageReceiver.h1);
                    imageReceiver2.h(canvas, null);
                }
                vv vvVar = this.a;
                View view = vvVar.Q;
                if (view != null) {
                    nh.h hVar2 = vvVar.R;
                    if (hVar2 != null && hVar2.i) {
                        vvVar.R = null;
                    }
                    if (vvVar.R == null) {
                        vvVar.R = nh.h.e(view);
                    }
                    hVar = vvVar.R;
                }
                if (hVar != null) {
                    canvas.translate(f7, f10);
                    hVar.c(canvas, this.S, Math.round(f11), Math.round(f12), imageReceiver.h1, false);
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
        int i10 = this.N;
        if (radialProgress2 != null || view == null) {
            if (radialProgress2 == null || view == null) {
                return;
            }
            radialProgress2.n(view);
            RadialProgress2 radialProgress22 = this.f;
            int i11 = this.L;
            int i12 = this.M;
            radialProgress22.r(i11, i12, i11 + i10, i10 + i12);
            return;
        }
        RadialProgress2 radialProgress23 = new RadialProgress2(view, null);
        this.f = radialProgress23;
        radialProgress23.d = -1;
        radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
        RadialProgress2 radialProgress24 = this.f;
        int i13 = this.L;
        int i14 = this.M;
        radialProgress24.r(i13, i14, i13 + i10, i10 + i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        vv vvVar = this.a;
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            b8.G(vvVar.a);
            File K = b8.K(photoSize, null, true, true);
            b8.G(vvVar.a);
            File K2 = b8.K(photoSize, null, false, true);
            return K.exists() || (K2 != null && K2.exists());
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            b8.G(vvVar.a);
            File I = b8.I(document);
            b8.G(vvVar.a);
            File K3 = b8.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K3 == null || !K3.exists())) {
            }
        }
    }

    public final CharSequence f() {
        String L0 = cd.L0(this.y ? 2131753933 : 2131753948, null);
        return (!h() || this.T.b()) ? L0 : TextUtils.concat(L0, ", ", cd.L0(2131745280, null));
    }

    public final boolean g(float f7, float f10) {
        if (f7 < this.F || f7 > r0 + this.H) {
            return false;
        }
        int i10 = this.G;
        return f10 >= ((float) i10) && f10 <= ((float) (i10 + this.I));
    }

    @Override // org.telegram.messenger.z5
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

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        }
        if (this.K != 1) {
            m(this.S, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            qv qvVar = this.T;
            if (!qvVar.b && qvVar.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f7 = imageReceiver.M0;
                float f10 = imageReceiver.N0;
                qvVar.c(view, (f7 / 2.0f) + imageReceiver.K0, (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                return true;
            }
        }
        vv vvVar = this.a;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        if (l1Var == null) {
            return false;
        }
        l1Var.W1(vvVar.E, this.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(View view, MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.l1 l1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean g10 = g(x10, y3);
        int i10 = this.K;
        if (i10 != -1) {
            if (x10 >= this.L) {
                int i11 = this.N;
                if (x10 <= r9 + i11) {
                    if (y3 >= this.M && y3 <= r2 + i11) {
                        z10 = true;
                        if (actionMasked != 0) {
                            if (!g10 || (!z10 && i10 != 0 && i10 != 2)) {
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
                        boolean z11 = this.P;
                        TL_iv.PageBlock pageBlock = this.b;
                        vv vvVar = this.a;
                        ImageReceiver imageReceiver = this.c;
                        if (!z11) {
                            if (this.Q) {
                                this.Q = false;
                                if (g10) {
                                    if (view != null) {
                                        view.playSoundEffect(0);
                                    }
                                    if (h()) {
                                        qv qvVar = this.T;
                                        if (!qvVar.b && qvVar.f == null) {
                                            float f7 = imageReceiver.M0;
                                            float f10 = imageReceiver.N0;
                                            qvVar.c(view, imageReceiver.K0 + (f7 / 2.0f), (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.l1 l1Var2 = vvVar.F;
                                    if (l1Var2 != null) {
                                        l1Var2.W1(vvVar.E, pageBlock);
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
                        int i12 = this.K;
                        if (i12 == 0) {
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
                        } else if (i12 == 1) {
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
                        } else if (i12 == 2) {
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
                        } else if (i12 == 3 && (l1Var = vvVar.F) != null) {
                            l1Var.W1(vvVar.E, pageBlock);
                            return true;
                        }
                    }
                }
            }
        }
        z10 = false;
        if (actionMasked != 0) {
        }
    }

    public final void l(int i10, int i11, int i12, int i13) {
        this.F = i10;
        this.G = i11;
        this.H = i12;
        this.I = i13;
        this.c.y0(i10, i11, i12, i13);
        int i14 = this.N;
        int u10 = i0.a.u(i12, i14, 2, i10);
        this.L = u10;
        int u11 = i0.a.u(i13, i14, 2, i11);
        this.M = u11;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.r(u10, u11, u10 + i14, i14 + u11);
        }
        boolean z10 = true;
        vv vvVar = this.a;
        TLRPC.Document document = this.s;
        boolean z11 = document == null ? (b6.q(vvVar.a).m() & 1) != 0 : !(this.y && !(a() && b6.q(vvVar.a).c(4, document.size)));
        this.J = z11;
        if (!z11 && !e()) {
            z10 = false;
        }
        b(z10);
    }

    public final void m(View view, boolean z10) {
        String r10;
        if (view == null) {
            view = this.S;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            r10 = b8.r(null, photoSize);
        } else {
            TLRPC.Document document = this.s;
            r10 = document != null ? b8.r(null, document) : null;
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
        org.telegram.ui.Components.s5 m10 = imageReceiver.m();
        boolean z11 = m10 != null && (m10.s() || imageReceiver.M());
        boolean e = e();
        boolean z12 = this.D;
        boolean z13 = this.y;
        vv vvVar = this.a;
        if (e || (z13 && z11)) {
            b6.q(vvVar.a).v(this);
            if (z12 && !z11) {
                this.K = 3;
                RadialProgress2 radialProgress22 = this.f;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(0, false, z10);
                }
            } else if (!z13 || z11 || a() || this.R) {
                this.K = -1;
                RadialProgress2 radialProgress23 = this.f;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(4, false, z10);
                }
            } else {
                this.K = 2;
                RadialProgress2 radialProgress24 = this.f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(8, false, z10);
                }
            }
        } else {
            b6.q(vvVar.a).a(r10, null, this);
            if (this.J || this.R || b8.G(vvVar.a).T(r10)) {
                this.K = 1;
                Float w9 = hc.D().w(r10);
                r2 = w9 != null ? w9.floatValue() : 0.0f;
                RadialProgress2 radialProgress25 = this.f;
                if (radialProgress25 != null) {
                    radialProgress25.setIcon(3, true, z10);
                }
            } else if (z12) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, true, z10);
                }
            } else {
                this.K = 0;
                RadialProgress2 radialProgress27 = this.f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(2, true, z10);
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

    public ju(vv vvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f7;
        int i10;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new qv();
        this.a = vvVar;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s10 = vvVar.s(pageblockvideo.video_id);
        this.s = s10;
        boolean K4 = jj.K4(s10);
        this.D = K4;
        this.y = K4 || jj.s3(s10, false);
        if (s10 != null) {
            this.w = b8.w(s10.thumbs, zs.r5, false, null, true);
            this.x = b8.R(s10.thumbs);
        } else {
            this.w = null;
            this.x = null;
        }
        if (s10 != null) {
            for (int i11 = 0; i11 < this.s.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = this.s.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i10 = documentAttribute.h) > 0) {
                    f7 = documentAttribute.w / i10;
                    break;
                }
            }
        }
        f7 = 1.0f;
        this.E = f7;
        this.O = b6.q(vvVar.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.z1 = true;
        this.d.z1 = true;
        imageReceiver.g1 = new iu(this);
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
