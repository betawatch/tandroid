// default package

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hb8 implements p7, je8 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ hb8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // p7
    public final void A() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.A1();
        }
    }

    @Override // je8
    public final boolean A0() {
        return true;
    }

    @Override // je8
    public final boolean E() {
        return (a() && this.a.g0.c()) ? false : true;
    }

    @Override // je8
    public final boolean E0() {
        return !a() || this.a.g0.y;
    }

    @Override // je8
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.c4.startRewind(photoViewer.g0, z, f, photoViewer.u1, cz9Var);
            return true;
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return false;
        }
        photoViewer.c4.startRewind(kfcVar, z, f, photoViewer.u1, cz9Var);
        return true;
    }

    @Override // je8
    public final boolean H() {
        return this.a.c4.rewinding;
    }

    @Override // je8
    public final void J(Rect rect) {
        ad8 ad8Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.Y8;
        if (!photoViewer.Z8 || (ad8Var = photoViewer.f0) == null || !ad8Var.isAttachedToWindow()) {
            rect.setEmpty();
            return;
        }
        photoViewer.f0.getLocationOnScreen(new int[2]);
        rect.set(Math.round(rectF.left + r1[0]), Math.round(rectF.top + r1[1]), Math.round(rectF.right + r1[0]), Math.round(rectF.bottom + r1[1]));
    }

    @Override // je8
    public final View K(LaunchActivity launchActivity) {
        return null;
    }

    @Override // je8
    public final View P() {
        if (a()) {
            return this.a.g0.getWebView();
        }
        return null;
    }

    @Override // je8
    public final boolean Q() {
        z zVar;
        PhotoViewer photoViewer = PhotoViewer.j9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer != photoViewer2 || !photoViewer2.e || photoViewer2.J3 || photoViewer2.W8 || (zVar = photoViewer2.h0) == null || zVar.getParent() == null) {
            return false;
        }
        PhotoViewer photoViewer3 = this.a;
        return !photoViewer3.B3 && photoViewer3.m4 == 0;
    }

    @Override // je8
    public final void R(ne8 ne8Var) {
        PhotoViewer photoViewer = this.a;
        photoViewer.W8 = true;
        if (photoViewer.E2) {
            kfc kfcVar = photoViewer.G2;
            if (kfcVar != null) {
                kfcVar.y0(null);
                photoViewer.G2.z0(null);
                photoViewer.G2.z0(ne8Var);
            }
        } else if (photoViewer.C2 != null) {
            kfc kfcVar2 = photoViewer.G2;
            if (kfcVar2 != null) {
                kfcVar2.z0(null);
            }
            hl.B2(photoViewer.C2);
            kfc kfcVar3 = photoViewer.G2;
            if (kfcVar3 != null) {
                kfcVar3.z0(ne8Var);
            }
        }
        try {
            z zVar = photoViewer.h0;
            if (zVar == null || zVar.getParent() == null) {
                return;
            }
            ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.h0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // je8
    public final int S() {
        return 0;
    }

    @Override // je8
    public final void T() {
        this.a.c4.cancelRewind();
    }

    @Override // je8
    public final int U() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedWidth();
        }
        dc8 dc8Var = photoViewer.z2;
        return (dc8Var == null || dc8Var.getAspectRatio() <= 0.0f) ? photoViewer.V : Math.round(photoViewer.z2.getAspectRatio() * 1000.0f);
    }

    @Override // je8
    public final void V(float f) {
        this.a.c4.setX(f);
    }

    @Override // p7
    public final void W() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            hl.r(photoViewer.y2);
        }
    }

    @Override // je8
    public final boolean X() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.s2 && i() && !photoViewer.s4;
    }

    @Override // je8
    public final boolean Y() {
        return false;
    }

    public final boolean a() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.s4 && photoViewer.g0 != null;
    }

    @Override // je8
    public final dg8 a0() {
        kfc kfcVar;
        if (a() || (kfcVar = this.a.G2) == null) {
            return null;
        }
        return kfcVar.d;
    }

    @Override // je8
    public final void b() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.e();
            return;
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            kfcVar.f0();
        }
    }

    @Override // je8
    public final boolean d0() {
        return false;
    }

    @Override // je8
    public final void g(long j) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.i(j);
            return;
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            kfcVar.o0(j);
        }
    }

    @Override // je8
    public final void g0() {
        this.a.U8 = null;
        PhotoViewer photoViewer = PhotoViewer.k9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.L();
            MediaController.z().J0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.j9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.W8) {
                photoViewer4.W8 = false;
                try {
                    z zVar = photoViewer4.h0;
                    if (zVar != null && zVar.getParent() == null) {
                        WindowManager windowManager = (WindowManager) this.a.E.getSystemService("window");
                        PhotoViewer photoViewer5 = this.a;
                        windowManager.addView(photoViewer5.h0, photoViewer5.e0);
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            this.a.A(false, false);
        }
    }

    @Override // je8
    public final long getDuration() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getVideoDuration();
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            return kfcVar.U();
        }
        return 0L;
    }

    @Override // je8
    public final boolean i() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.H;
        }
        kfc kfcVar = photoViewer.G2;
        return kfcVar != null && kfcVar.c0();
    }

    @Override // je8
    public final void j() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.f();
            return;
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            kfcVar.g0();
        }
    }

    @Override // je8
    public final long k() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getCurrentPosition();
        }
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        return 0L;
    }

    @Override // je8
    public final void p0() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J3) {
            if (PhotoViewer.j9 != null) {
                PhotoViewer.j9.A(false, true);
            }
            nc8 nc8Var = photoViewer.g0;
            if (nc8Var != null && nc8Var.f != null) {
                if (a.x) {
                    try {
                        nc8Var.getContext().startService(new Intent(a.b, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
                nc8Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) nc8Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(nc8Var.f);
                }
                nc8Var.addView(nc8Var.f, 0, tre.e(-1, -1, 51));
                me8 me8Var = nc8Var.b.U8;
                if (me8Var != null) {
                    me8Var.a(new bm0((byte) 20));
                }
            }
            PhotoViewer.j9 = PhotoViewer.k9;
            PhotoViewer.k9 = null;
            if (photoViewer.g0 == null) {
                photoViewer.L3 = true;
                Bitmap bitmap = photoViewer.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.C3 = null;
                }
                photoViewer.F3 = true;
            }
            photoViewer.J3 = false;
            View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
            if (photoViewer.g0 == null && view != null) {
                hl.B2(view);
                view.setVisibility(4);
                photoViewer.z2.addView(view);
            }
            if (a.x) {
                try {
                    photoViewer.E.startService(new Intent(a.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th2) {
                    cc4.g(th2, true);
                }
            }
            if (photoViewer.g0 != null) {
                photoViewer.l6 = 0.0f;
            } else if (view != null) {
                photoViewer.B3 = true;
                a69 t0 = photoViewer.t0(false);
                float f = t0.c / photoViewer.x3.getLayoutParams().width;
                photoViewer.x3.setScaleX(f);
                photoViewer.x3.setScaleY(f);
                photoViewer.x3.setTranslationX(t0.a);
                photoViewer.x3.setTranslationY(t0.b);
                view.setScaleX(f);
                view.setScaleY(f);
                view.setTranslationX(t0.a - photoViewer.z2.getX());
                view.setTranslationY(t0.b - photoViewer.z2.getY());
                zc8 zc8Var = photoViewer.F2;
                if (zc8Var != null) {
                    zc8Var.setScaleX(f);
                    photoViewer.F2.setScaleY(f);
                    photoViewer.F2.setTranslationX(view.getTranslationX());
                    photoViewer.F2.setTranslationY(view.getTranslationY());
                }
                photoViewer.X = 0.0f;
                ub8 ub8Var = new ub8(photoViewer, f, (byte) 1);
                view.setOutlineProvider(ub8Var);
                view.setClipToOutline(true);
                photoViewer.x3.setOutlineProvider(ub8Var);
                photoViewer.x3.setClipToOutline(true);
                zc8 zc8Var2 = photoViewer.F2;
                if (zc8Var2 != null) {
                    zc8Var2.setOutlineProvider(ub8Var);
                    photoViewer.F2.setClipToOutline(true);
                }
            }
            try {
                photoViewer.e = true;
                photoViewer.f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                fd8 fd8Var = photoViewer.c5;
                if (fd8Var != null && !fd8Var.s) {
                    fd8Var.a.v0(false, false);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (photoViewer.E2) {
                s64 s64Var = photoViewer.G2.d;
                if (s64Var != null) {
                    s64Var.s1(null);
                }
                photoViewer.G2.y0(photoViewer.D2);
                photoViewer.D2.setVisibility(4);
                photoViewer.G3 = (byte) 2;
                photoViewer.F3 = false;
                photoViewer.f0.invalidate();
            }
            photoViewer.v3 = 4;
        }
    }

    @Override // je8
    public final int q() {
        return 0;
    }

    @Override // je8
    public final int q0() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedHeight();
        }
        dc8 dc8Var = photoViewer.z2;
        if (dc8Var == null || dc8Var.getAspectRatio() <= 0.0f) {
            return photoViewer.W;
        }
        return 1000;
    }

    @Override // je8
    public final float r0() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getBufferedPosition();
        }
        kfc kfcVar = photoViewer.G2;
        return (kfcVar == null || kfcVar.U() <= 0) ? photoViewer.V8 : Math.max(photoViewer.V8, photoViewer.G2.N() / photoViewer.G2.U());
    }

    @Override // je8
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        PhotoViewer photoViewer = this.a;
        photoViewer.W8 = false;
        try {
            z zVar = photoViewer.h0;
            if (zVar != null && zVar.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        boolean z = photoViewer.E2;
        kfc kfcVar = photoViewer.G2;
        if (z) {
            if (kfcVar != null) {
                kfcVar.z0(null);
                photoViewer.G2.y0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        if (kfcVar != null) {
            kfcVar.z0(null);
        }
        surfaceTexture.release();
        TextureView textureView = photoViewer.C2;
        if (textureView == null || photoViewer.z2 == null) {
            return;
        }
        hl.B2(textureView);
        photoViewer.z2.addView(photoViewer.C2, 0, tre.e(-1, -1, 17));
        kfc kfcVar2 = photoViewer.G2;
        if (kfcVar2 != null) {
            kfcVar2.z0(photoViewer.C2);
            if (bitmap == null || photoViewer.G2.c0() || photoViewer.x3 == null || photoViewer.z2 == null) {
                return;
            }
            Bitmap bitmap2 = photoViewer.C3;
            if (bitmap2 != null && bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            photoViewer.C3 = bitmap;
            photoViewer.X8 = true;
            photoViewer.x3.setScaleX(1.0f);
            photoViewer.x3.setScaleY(1.0f);
            photoViewer.x3.setTranslationX(photoViewer.z2.getX());
            photoViewer.x3.setTranslationY(photoViewer.z2.getY());
            photoViewer.x3.setImageBitmap(bitmap);
            photoViewer.x3.setVisibility(0);
        }
    }

    @Override // je8
    public final boolean v() {
        return false;
    }

    @Override // je8
    public final void v0(Canvas canvas, int i, int i2) {
        this.a.b4.draw(canvas, i, i2);
    }

    @Override // je8
    public final void G0(int i) {
    }

    @Override // je8
    public final void L(View view) {
    }

    @Override // je8
    public final void N(View view) {
    }

    @Override // je8
    public final void l(View view) {
    }

    @Override // je8
    public final void o0(View view) {
    }

    @Override // je8
    public final void u0(int i, ArrayList arrayList) {
    }
}
