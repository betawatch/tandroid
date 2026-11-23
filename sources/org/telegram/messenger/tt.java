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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class tt implements y5 {
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
    public final av U;
    public final fv a;
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

    public tt(fv fvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i7;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new av();
        this.a = fvVar;
        this.b = pageblockphoto;
        TLRPC.Photo v = fvVar.v(pageblockphoto.photo_id);
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
        this.E = false;
        TLRPC.PhotoSize photoSize = this.n;
        this.F = (photoSize == null || (i7 = photoSize.h) <= 0) ? 1.0f : photoSize.w / i7;
        this.P = a6.q(fvVar.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        m(this.T, false);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
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
            int i7 = cz.a;
            return qc.e(1024);
        }
        int i10 = cz.a;
        return qc.e(2048);
    }

    public final void b(boolean z10) {
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        fv fvVar = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            gc i7 = tL_photoStrippedSize != null ? gc.i(tL_photoStrippedSize, photo) : null;
            imageReceiver.O = gc.i(photoSize, photo);
            if (z10) {
                imageReceiver.u0(null, null, gc.i(photoSize, photo), null, i7, "b1", null, photoSize.size, null, fvVar.b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, i7, "b1", null, photoSize.size, null, fvVar.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            gc c10 = tL_photoStrippedSize2 != null ? gc.c(tL_photoStrippedSize2, document) : null;
            TLRPC.PhotoSize photoSize2 = this.w;
            gc c11 = photoSize2 != null ? gc.c(photoSize2, document) : null;
            imageReceiver.O = gc.b(document);
            if (!z10 || !this.y || (!a() && !this.S)) {
                imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", fvVar.b, 1);
                return;
            }
            imageReceiver.u0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(gc.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", fvVar.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.c;
        xh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            av avVar = this.U;
            if (!avVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.e || imageReceiver2.n() == null)) {
                    this.e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
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
                avVar.a(canvas);
                if (imageReceiver2.n() != null) {
                    imageReceiver2.y0(f10, f11, f12, f13);
                    imageReceiver2.setAlpha(imageReceiver.i1);
                    imageReceiver2.h(canvas, null);
                }
                fv fvVar = this.a;
                View view = fvVar.Q;
                if (view != null) {
                    xh.e eVar2 = fvVar.R;
                    if (eVar2 != null && eVar2.i) {
                        fvVar.R = null;
                    }
                    if (fvVar.R == null) {
                        fvVar.R = xh.e.e(view);
                    }
                    eVar = fvVar.R;
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
        int i7 = this.O;
        if (radialProgress2 != null || view == null) {
            if (radialProgress2 == null || view == null) {
                return;
            }
            radialProgress2.n(view);
            RadialProgress2 radialProgress22 = this.f;
            int i10 = this.M;
            int i11 = this.N;
            radialProgress22.r(i10, i11, i10 + i7, i7 + i11);
            return;
        }
        RadialProgress2 radialProgress23 = new RadialProgress2(view, null);
        this.f = radialProgress23;
        radialProgress23.d = -1;
        radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
        RadialProgress2 radialProgress24 = this.f;
        int i12 = this.M;
        int i13 = this.N;
        radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        fv fvVar = this.a;
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            w7.G(fvVar.a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(fvVar.a);
            File J2 = w7.J(photoSize, null, false, true);
            return J.exists() || (J2 != null && J2.exists());
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            w7.G(fvVar.a);
            File I = w7.I(document);
            w7.G(fvVar.a);
            File J3 = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J3 == null || !J3.exists())) {
            }
        }
    }

    public final CharSequence f() {
        String N0 = hd.N0(this.y ? 2131753930 : 2131753945, null);
        return (!h() || this.U.b()) ? N0 : TextUtils.concat(N0, ", ", hd.N0(2131745019, null));
    }

    public final boolean g(float f10, float f11) {
        if (f10 < this.G || f10 > r0 + this.I) {
            return false;
        }
        int i7 = this.H;
        return f11 >= ((float) i7) && f11 <= ((float) (i7 + this.J));
    }

    @Override // org.telegram.messenger.y5
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

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        }
        if (this.L != 1) {
            m(this.T, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            av avVar = this.U;
            if (!avVar.b && avVar.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                avVar.c(view, (f10 / 2.0f) + imageReceiver.L0, (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        fv fvVar = this.a;
        org.telegram.ui.Cells.m1 m1Var = fvVar.F;
        if (m1Var == null) {
            return false;
        }
        m1Var.p2(fvVar.E, this.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(View view, MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.m1 m1Var;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean g10 = g(x10, y10);
        int i7 = this.L;
        if (i7 != -1) {
            if (x10 >= this.M) {
                int i10 = this.O;
                if (x10 <= r9 + i10) {
                    if (y10 >= this.N && y10 <= r2 + i10) {
                        z10 = true;
                        if (actionMasked != 0) {
                            if (!g10 || (!z10 && i7 != 0 && i7 != 2)) {
                                if (g10) {
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
                        fv fvVar = this.a;
                        ImageReceiver imageReceiver = this.c;
                        if (!z11) {
                            if (this.R) {
                                this.R = false;
                                if (g10) {
                                    if (view != null) {
                                        view.playSoundEffect(0);
                                    }
                                    if (h()) {
                                        av avVar = this.U;
                                        if (!avVar.b && avVar.f == null) {
                                            float f10 = imageReceiver.N0;
                                            float f11 = imageReceiver.O0;
                                            avVar.c(view, imageReceiver.L0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                                            return true;
                                        }
                                    }
                                    org.telegram.ui.Cells.m1 m1Var2 = fvVar.F;
                                    if (m1Var2 != null) {
                                        m1Var2.p2(fvVar.E, pageBlock);
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
                        } else if (i11 == 3 && (m1Var = fvVar.F) != null) {
                            m1Var.p2(fvVar.E, pageBlock);
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

    public final void l(int i7, int i10, int i11, int i12) {
        this.G = i7;
        this.H = i10;
        this.I = i11;
        this.J = i12;
        this.c.y0(i7, i10, i11, i12);
        int i13 = this.O;
        int e10 = i5.c.e(i11, i13, 2, i7);
        this.M = e10;
        int e11 = i5.c.e(i12, i13, 2, i10);
        this.N = e11;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.r(e10, e11, e10 + i13, i13 + e11);
        }
        boolean z10 = true;
        fv fvVar = this.a;
        TLRPC.Document document = this.s;
        boolean z11 = document == null ? (a6.q(fvVar.a).m() & 1) != 0 : !(this.y && !(a() && a6.q(fvVar.a).c(4, document.size)));
        this.K = z11;
        if (!z11 && !e()) {
            z10 = false;
        }
        b(z10);
    }

    public final void m(View view, boolean z10) {
        String r10;
        if (view == null) {
            view = this.T;
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
            this.L = -1;
            RadialProgress2 radialProgress2 = this.f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.c;
        org.telegram.ui.Components.c6 m10 = imageReceiver.m();
        boolean z11 = m10 != null && (m10.s() || imageReceiver.M());
        boolean e10 = e();
        boolean z12 = this.E;
        boolean z13 = this.y;
        fv fvVar = this.a;
        if (e10 || (z13 && z11)) {
            a6.q(fvVar.a).v(this);
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
            a6.q(fvVar.a).a(r10, null, this);
            if (this.K || this.S || w7.G(fvVar.a).S(r10)) {
                this.L = 1;
                Float w10 = fc.D().w(r10);
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

    public tt(fv fvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i7;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new av();
        this.a = fvVar;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s5 = fvVar.s(pageblockvideo.video_id);
        this.s = s5;
        boolean K4 = gj.K4(s5);
        this.E = K4;
        this.y = K4 || gj.s3(s5, false);
        if (s5 != null) {
            this.w = w7.w(s5.thumbs, ls.r5, false, null, true);
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
        this.F = f10;
        this.P = a6.q(fvVar.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.h1 = new st(this);
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
