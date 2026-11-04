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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class qt implements x5 {
    public static ColorMatrixColorFilter V;
    public final boolean E;
    public final float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public final int O;
    public final int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public View T;
    public final xu U;
    public final cv a;
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

    public qt(cv cvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i3;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new xu();
        this.a = cvVar;
        this.b = pageblockphoto;
        TLRPC.Photo v = cvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.r = w7.R(v.sizes);
        } else {
            this.n = null;
            this.r = null;
        }
        this.s = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        TLRPC.PhotoSize photoSize = this.n;
        this.F = (photoSize == null || (i3 = photoSize.h) <= 0) ? 1.0f : photoSize.w / i3;
        this.P = z5.q(cvVar.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        m(this.T, false);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.y && (a() || this.S)) {
            b(true);
        }
        m(this.T, true);
    }

    public final boolean a() {
        if (this.E) {
            int i3 = az.a;
            return lc.e(1024);
        }
        int i10 = az.a;
        return lc.e(2048);
    }

    public final void b(boolean z10) {
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        cv cvVar = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            ac i3 = tL_photoStrippedSize != null ? ac.i(tL_photoStrippedSize, photo) : null;
            if (z10) {
                imageReceiver.u0(null, null, ac.i(photoSize, photo), null, i3, "b1", null, photoSize.size, null, cvVar.b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, i3, "b1", null, photoSize.size, null, cvVar.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            ac c2 = tL_photoStrippedSize2 != null ? ac.c(tL_photoStrippedSize2, document) : null;
            TLRPC.PhotoSize photoSize2 = this.w;
            ac c10 = photoSize2 != null ? ac.c(photoSize2, document) : null;
            if (!z10 || !this.y || (!a() && !this.S)) {
                imageReceiver.u0(null, null, c10, null, c2, "b1", null, document.size, "mp4", cvVar.b, 1);
                return;
            }
            imageReceiver.u0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(ac.b(document), "g", c10, null, c2, "b1", null, document.size, "mp4", cvVar.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n4;
        ImageReceiver imageReceiver = this.c;
        yh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            xu xuVar = this.U;
            if (!xuVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n4 = imageReceiver.n()) != null && !n4.isRecycled() && (n4 != this.e || imageReceiver2.n() == null)) {
                    this.e = n4;
                    imageReceiver2.v0(Utilities.D(n4, false));
                    if (V == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        V = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.p1 = V;
                }
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                float f13 = imageReceiver.O0;
                if (f12 <= 0.0f || f13 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.clipRect(f10, f11, f10 + f12, f11 + f13);
                xuVar.a(canvas);
                if (imageReceiver2.n() != null) {
                    imageReceiver2.y0(f10, f11, f12, f13);
                    imageReceiver2.setAlpha(imageReceiver.i1);
                    imageReceiver2.h(canvas, null);
                }
                cv cvVar = this.a;
                View view = cvVar.Q;
                if (view != null) {
                    yh.e eVar2 = cvVar.R;
                    if (eVar2 != null && eVar2.i) {
                        cvVar.R = null;
                    }
                    if (cvVar.R == null) {
                        cvVar.R = yh.e.e(view);
                    }
                    eVar = cvVar.R;
                }
                if (eVar != null) {
                    canvas.translate(f10, f11);
                    eVar.c(canvas, this.T, Math.round(f12), Math.round(f13), imageReceiver.i1, false);
                }
                canvas.restore();
                View view2 = this.T;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 == null || this.L == -1) {
            return;
        }
        radialProgress2.draw(canvas);
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f;
        int i3 = this.O;
        if (radialProgress2 != null || view == null) {
            if (radialProgress2 == null || view == null) {
                return;
            }
            radialProgress2.n(view);
            RadialProgress2 radialProgress22 = this.f;
            int i10 = this.M;
            int i11 = this.N;
            radialProgress22.r(i10, i11, i10 + i3, i3 + i11);
            return;
        }
        RadialProgress2 radialProgress23 = new RadialProgress2(view, null);
        this.f = radialProgress23;
        radialProgress23.d = -1;
        radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
        RadialProgress2 radialProgress24 = this.f;
        int i12 = this.M;
        int i13 = this.N;
        radialProgress24.r(i12, i13, i12 + i3, i3 + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        cv cvVar = this.a;
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            w7.G(cvVar.a);
            File K = w7.K(photoSize, null, true, true);
            w7.G(cvVar.a);
            File K2 = w7.K(photoSize, null, false, true);
            return K.exists() || (K2 != null && K2.exists());
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            w7.G(cvVar.a);
            File I = w7.I(document);
            w7.G(cvVar.a);
            File K3 = w7.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K3 == null || !K3.exists())) {
            }
        }
    }

    public final CharSequence f() {
        String M0 = bd.M0(this.y ? 2131753933 : 2131753948, null);
        return (!h() || this.U.b()) ? M0 : TextUtils.concat(M0, ", ", bd.M0(2131745272, null));
    }

    public final boolean g(float f10, float f11) {
        if (f10 < this.G || f10 > r0 + this.I) {
            return false;
        }
        int i3 = this.H;
        return f11 >= ((float) i3) && f11 <= ((float) (i3 + this.J));
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.P;
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
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        }
        if (this.L != 1) {
            m(this.T, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            xu xuVar = this.U;
            if (!xuVar.b && xuVar.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                xuVar.c(view, (f10 / 2.0f) + imageReceiver.L0, (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        cv cvVar = this.a;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (l1Var == null) {
            return false;
        }
        l1Var.e2(cvVar.E, this.b);
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
        float y9 = motionEvent.getY();
        boolean g7 = g(x10, y9);
        int i3 = this.L;
        if (i3 != -1) {
            if (x10 >= this.M) {
                int i10 = this.O;
                if (x10 <= r9 + i10) {
                    if (y9 >= this.N && y9 <= r2 + i10) {
                        z10 = true;
                        if (actionMasked != 0) {
                            if (!g7 || (!z10 && i3 != 0 && i3 != 2)) {
                                if (g7) {
                                    this.R = true;
                                    return true;
                                }
                            }
                            this.Q = true;
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 3) {
                                return this.R || this.Q;
                            }
                            this.R = false;
                            this.Q = false;
                            return false;
                        }
                        boolean z11 = this.Q;
                        TL_iv.PageBlock pageBlock = this.b;
                        cv cvVar = this.a;
                        ImageReceiver imageReceiver = this.c;
                        if (!z11) {
                            if (this.R) {
                                this.R = false;
                                if (g7) {
                                    if (view != null) {
                                        view.playSoundEffect(0);
                                    }
                                    if (h()) {
                                        xu xuVar = this.U;
                                        if (!xuVar.b && xuVar.f == null) {
                                            float f10 = imageReceiver.N0;
                                            float f11 = imageReceiver.O0;
                                            xuVar.c(view, imageReceiver.L0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.l1 l1Var2 = cvVar.F;
                                    if (l1Var2 != null) {
                                        l1Var2.e2(cvVar.E, pageBlock);
                                        return true;
                                    }
                                }
                            }
                        }
                        this.Q = false;
                        if (view != null) {
                            view.playSoundEffect(0);
                            view.invalidate();
                        }
                        int i11 = this.L;
                        if (i11 == 0) {
                            this.S = true;
                            RadialProgress2 radialProgress2 = this.f;
                            if (radialProgress2 != null) {
                                radialProgress2.p(true, 0.0f);
                            }
                            b(true);
                            this.L = 1;
                            RadialProgress2 radialProgress22 = this.f;
                            if (radialProgress22 != null) {
                                radialProgress22.setIcon(3, true, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 1) {
                            this.S = false;
                            imageReceiver.c();
                            this.L = 0;
                            RadialProgress2 radialProgress23 = this.f;
                            if (radialProgress23 != null) {
                                radialProgress23.setIcon(2, false, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 2) {
                            this.S = true;
                            imageReceiver.u0 = true;
                            b(true);
                            imageReceiver.P0(false);
                            this.L = -1;
                            RadialProgress2 radialProgress24 = this.f;
                            if (radialProgress24 != null) {
                                radialProgress24.setIcon(4, false, true);
                            }
                            if (view != null) {
                                view.invalidate();
                                return true;
                            }
                        } else if (i11 == 3 && (l1Var = cvVar.F) != null) {
                            l1Var.e2(cvVar.E, pageBlock);
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

    public final void l(int i3, int i10, int i11, int i12) {
        this.G = i3;
        this.H = i10;
        this.I = i11;
        this.J = i12;
        this.c.y0(i3, i10, i11, i12);
        int i13 = this.O;
        int e10 = k2.p1.e(i11, i13, 2, i3);
        this.M = e10;
        int e11 = k2.p1.e(i12, i13, 2, i10);
        this.N = e11;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.r(e10, e11, e10 + i13, i13 + e11);
        }
        boolean z10 = true;
        cv cvVar = this.a;
        TLRPC.Document document = this.s;
        boolean z11 = document == null ? (z5.q(cvVar.a).m() & 1) != 0 : !(this.y && !(a() && z5.q(cvVar.a).c(4, document.size)));
        this.K = z11;
        if (!z11 && !e()) {
            z10 = false;
        }
        b(z10);
    }

    public final void m(View view, boolean z10) {
        String r5;
        if (view == null) {
            view = this.T;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            r5 = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.s;
            r5 = document != null ? w7.r(null, document) : null;
        }
        if (TextUtils.isEmpty(r5)) {
            this.L = -1;
            RadialProgress2 radialProgress2 = this.f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.c;
        org.telegram.ui.Components.t5 m10 = imageReceiver.m();
        boolean z11 = m10 != null && (m10.s() || imageReceiver.M());
        boolean e10 = e();
        boolean z12 = this.E;
        boolean z13 = this.y;
        cv cvVar = this.a;
        if (e10 || (z13 && z11)) {
            z5.q(cvVar.a).v(this);
            if (z12 && !z11) {
                this.L = 3;
                RadialProgress2 radialProgress22 = this.f;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(0, false, z10);
                }
            } else if (!z13 || z11 || a() || this.S) {
                this.L = -1;
                RadialProgress2 radialProgress23 = this.f;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(4, false, z10);
                }
            } else {
                this.L = 2;
                RadialProgress2 radialProgress24 = this.f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(8, false, z10);
                }
            }
        } else {
            z5.q(cvVar.a).a(r5, null, this);
            if (this.K || this.S || w7.G(cvVar.a).T(r5)) {
                this.L = 1;
                Float w10 = zb.D().w(r5);
                r2 = w10 != null ? w10.floatValue() : 0.0f;
                RadialProgress2 radialProgress25 = this.f;
                if (radialProgress25 != null) {
                    radialProgress25.setIcon(3, true, z10);
                }
            } else if (z12) {
                this.L = 3;
                RadialProgress2 radialProgress26 = this.f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, true, z10);
                }
            } else {
                this.L = 0;
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

    public qt(cv cvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i3;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new xu();
        this.a = cvVar;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s6 = cvVar.s(pageblockvideo.video_id);
        this.s = s6;
        boolean L4 = zi.L4(s6);
        this.E = L4;
        this.y = L4 || zi.t3(s6, false);
        if (s6 != null) {
            this.w = w7.w(s6.thumbs, hs.r5, false, null, true);
            this.x = w7.R(s6.thumbs);
        } else {
            this.w = null;
            this.x = null;
        }
        if (s6 != null) {
            for (int i10 = 0; i10 < this.s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i3 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.w / i3;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.F = f10;
        this.P = z5.q(cvVar.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.h1 = new pt(this);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
