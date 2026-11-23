package org.telegram.ui;

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
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fo0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.y51, org.telegram.ui.Components.k61, org.telegram.ui.Components.pd0, wi.l {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ fo0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // wi.l
    public boolean A1(boolean z10, float f10, org.telegram.ui.Components.en0 en0Var) {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            photoViewer.c4.startRewind(photoViewer.g0, z10, f10, photoViewer.u1, en0Var);
            return true;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return false;
        }
        photoViewer.c4.startRewind(h61Var, z10, f10, photoViewer.u1, en0Var);
        return true;
    }

    @Override // wi.l
    public boolean C2() {
        return !g() || this.a.g0.y;
    }

    @Override // wi.l
    public void E0(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.a;
        photoViewer.Y8 = false;
        try {
            vq0 vq0Var = photoViewer.h0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
            if (h61Var != null) {
                h61Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView == null || photoViewer.z2 == null) {
            return;
        }
        textureView.setSurfaceTexture(surfaceTexture);
        org.telegram.messenger.g0.E2(photoViewer.C2);
        photoViewer.z2.addView(photoViewer.C2, 0, c8.na.e(-1, -1, 17));
    }

    @Override // wi.l
    public void I(wi.o oVar) {
        PhotoViewer photoViewer = this.a;
        photoViewer.Y8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
            if (h61Var != null) {
                h61Var.z0(null);
                photoViewer.G2.A0(null);
                photoViewer.G2.A0(oVar);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.W8 = oVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.W8 = null;
            }
        }
        try {
            vq0 vq0Var = photoViewer.h0;
            if (vq0Var == null || vq0Var.getParent() == null) {
                return;
            }
            ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.h0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // wi.l
    public View K0() {
        if (g()) {
            return this.a.g0.getWebView();
        }
        return null;
    }

    @Override // wi.l
    public boolean O0() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.l9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer != photoViewer2 || !photoViewer2.e || photoViewer2.J3 || photoViewer2.Y8 || (vq0Var = photoViewer2.h0) == null || vq0Var.getParent() == null) {
            return false;
        }
        PhotoViewer photoViewer3 = this.a;
        return !photoViewer3.B3 && photoViewer3.n4 == 0;
    }

    @Override // wi.l
    public void P1() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J3) {
            if (PhotoViewer.l9 != null) {
                PhotoViewer.l9.z0(false, true);
            }
            dq0 dq0Var = photoViewer.g0;
            if (dq0Var != null && dq0Var.f != null) {
                if (org.telegram.messenger.t0.x) {
                    try {
                        dq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                dq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) dq0Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dq0Var.f);
                }
                dq0Var.addView(dq0Var.f, 0, c8.na.e(-1, -1, 51));
                wi.n nVar = dq0Var.b.V8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.l9 = PhotoViewer.m9;
            PhotoViewer.m9 = null;
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
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.z2.addView(view);
            }
            if (org.telegram.messenger.t0.x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.g0 != null) {
                photoViewer.m6 = 0.0f;
            } else if (view != null) {
                photoViewer.B3 = true;
                org.telegram.ui.Components.aj0 s12 = photoViewer.s1(false);
                float f10 = s12.c / photoViewer.x3.getLayoutParams().width;
                photoViewer.x3.setScaleX(f10);
                photoViewer.x3.setScaleY(f10);
                photoViewer.x3.setTranslationX(s12.a);
                photoViewer.x3.setTranslationY(s12.b);
                view.setScaleX(f10);
                view.setScaleY(f10);
                view.setTranslationX(s12.a - photoViewer.z2.getX());
                view.setTranslationY(s12.b - photoViewer.z2.getY());
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.setScaleX(f10);
                    photoViewer.F2.setScaleY(f10);
                    photoViewer.F2.setTranslationX(view.getTranslationX());
                    photoViewer.F2.setTranslationY(view.getTranslationY());
                }
                photoViewer.X = 0.0f;
                fp0 fp0Var = new fp0(photoViewer, f10, 1);
                view.setOutlineProvider(fp0Var);
                view.setClipToOutline(true);
                photoViewer.x3.setOutlineProvider(fp0Var);
                photoViewer.x3.setClipToOutline(true);
                pq0 pq0Var2 = photoViewer.F2;
                if (pq0Var2 != null) {
                    pq0Var2.setOutlineProvider(fp0Var);
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
                wq0 wq0Var = photoViewer.d5;
                if (wq0Var != null && !wq0Var.s) {
                    wq0Var.a.P0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (!photoViewer.E2) {
                photoViewer.v3 = 4;
                return;
            }
            l2.g0 g0Var = photoViewer.G2.d;
            if (g0Var != null) {
                g0Var.z1(null);
            }
            photoViewer.G2.z0(photoViewer.D2);
            photoViewer.D2.setVisibility(4);
            photoViewer.G3 = 2;
            photoViewer.F3 = false;
            photoViewer.f0.invalidate();
            photoViewer.v3 = 4;
        }
    }

    @Override // wi.l
    public void T0() {
        this.a.c4.cancelRewind();
    }

    @Override // wi.l
    public int V1() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.getEmbedHeight();
        }
        org.telegram.ui.Components.te0 te0Var = photoViewer.z2;
        if (te0Var == null || te0Var.getAspectRatio() <= 0.0f) {
            return photoViewer.W;
        }
        return 1000;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override // wi.l
    public void b() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            photoViewer.g0.f();
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.g0();
        }
    }

    @Override // wi.l
    public int b1() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.getEmbedWidth();
        }
        org.telegram.ui.Components.te0 te0Var = photoViewer.z2;
        return (te0Var == null || te0Var.getAspectRatio() <= 0.0f) ? photoViewer.V : Math.round(photoViewer.z2.getAspectRatio() * 1000.0f);
    }

    @Override // wi.l
    public void c(long j3) {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            photoViewer.g0.i(j3);
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.p0(j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void d() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.y2);
        }
    }

    @Override // wi.l
    public void d1(float f10) {
        this.a.c4.setX(f10);
    }

    @Override // wi.l
    public float d2() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.getBufferedPosition();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        return (h61Var == null || h61Var.U() <= 0) ? photoViewer.X8 : Math.max(photoViewer.X8, photoViewer.G2.K() / photoViewer.G2.U());
    }

    @Override // org.telegram.ui.Components.k61
    public void e(float f10) {
        dq0 dq0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G2 != null || ((dq0Var = photoViewer.g0) != null && dq0Var.y)) {
            if (!photoViewer.H8 && photoViewer.X7.getVisibility() == 0) {
                f10 = ((photoViewer.Y7.getRightProgress() - photoViewer.Y7.getLeftProgress()) * f10) + photoViewer.Y7.getLeftProgress();
            }
            if (photoViewer.x1() == -9223372036854775807L) {
                photoViewer.a3 = f10;
            } else {
                photoViewer.s2((int) (f10 * r1));
            }
            photoViewer.a3(false);
            photoViewer.u3 = false;
        }
    }

    @Override // wi.l
    public void f() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            photoViewer.g0.g();
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.h0();
        }
    }

    @Override // wi.l
    public boolean f0() {
        if (!g()) {
            return true;
        }
        dq0 dq0Var = this.a.g0;
        return (dq0Var.y && "inapp".equals(org.telegram.messenger.mp.u1(dq0Var.a).D3)) ? false : true;
    }

    public boolean g() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.t4 && photoViewer.g0 != null;
    }

    @Override // wi.l
    public long getDuration() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.getVideoDuration();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            return h61Var.U();
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.k61
    public void h(float f10) {
        jp0 jp0Var;
        jp0 jp0Var2;
        PhotoViewer photoViewer = this.a;
        dq0 dq0Var = photoViewer.g0;
        if (dq0Var != null && dq0Var.y && (jp0Var2 = photoViewer.s3) != null) {
            int i7 = photoViewer.q3.h - org.telegram.ui.Components.l61.S;
            jp0Var2.O = dq0Var;
            if (jp0Var2.a0 != 0) {
                jp0Var2.a0 = 0L;
                jp0Var2.g0 = null;
                jp0Var2.f0 = null;
                jp0Var2.e0 = null;
                jp0Var2.b(-1);
            }
            if (i7 != 0) {
                jp0Var2.r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (jp0Var2.n != i10) {
                    jp0Var2.n = i10;
                }
            }
            jp0Var2.E = org.telegram.messenger.g0.g0((int) (((long) (dq0Var.getVideoDuration() * f10)) / 1000), false, false);
            jp0Var2.F = (int) Math.ceil(jp0Var2.G.measureText(r0));
            jp0Var2.invalidate();
            if (jp0Var2.f != null) {
                Utilities.e.a(jp0Var2.f);
            }
            double videoDuration = (f10 * dq0Var.getVideoDuration()) / 1000.0d;
            jp0Var2.P = videoDuration;
            String c10 = dq0Var.c((int) videoDuration);
            if (c10 != null) {
                jp0Var2.R.p0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (jp0Var = photoViewer.s3) != null) {
            jp0Var.e(photoViewer.T4, f10, photoViewer.q3.h - org.telegram.ui.Components.l61.S);
        }
        this.a.a3(true);
        PhotoViewer.Q(this.a);
    }

    @Override // wi.l
    public boolean h1() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.s2 && j() && !photoViewer.t4;
    }

    public void i() {
        hi.r7 r7Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.p7 == null) {
            return;
        }
        org.telegram.ui.Components.j61 j61Var = photoViewer.l7;
        boolean z10 = false;
        boolean z11 = (j61Var == null || (r7Var = j61Var.b) == null || r7Var.f == null) ? false : true;
        if (z11 && j61Var.d) {
            z10 = true;
        }
        photoViewer.p0.R(org.telegram.messenger.ks.K1, z11);
        photoViewer.q7.a(z10, true);
        photoViewer.p7.setSubtext(org.telegram.messenger.gd.N0(z10 ? 2131743339 : 2131743340, null));
    }

    @Override // wi.l
    public /* synthetic */ boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.y51
    public void invalidate() {
        this.a.f0.invalidate();
    }

    @Override // wi.l
    public boolean j() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.H;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        return h61Var != null && h61Var.d0();
    }

    public void k(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.kr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.qp0(11, photoViewer, z11));
        }
    }

    @Override // wi.l
    public boolean l0() {
        return this.a.c4.rewinding;
    }

    public void m() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return;
        }
        h61Var.p0((long) (h61Var.U() * photoViewer.C8));
        photoViewer.G2.g0();
        photoViewer.Y7.setProgress(photoViewer.C8);
        photoViewer.n0();
        gf0 gf0Var = new gf0(this, 22);
        photoViewer.I2 = gf0Var;
        org.telegram.messenger.g0.h3(gf0Var, 860L);
    }

    @Override // wi.l
    public long n() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.a;
        if (g10) {
            return photoViewer.g0.getCurrentPosition();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override // wi.l
    public e2.c1 n1() {
        org.telegram.ui.Components.h61 h61Var;
        if (g() || (h61Var = this.a.G2) == null) {
            return null;
        }
        return h61Var.d;
    }

    @Override // wi.l
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // wi.l
    public void t2(Canvas canvas, int i7, int i10) {
        this.a.b4.draw(canvas, i7, i10);
    }

    @Override // wi.l
    public void v1() {
        this.a.V8 = null;
        PhotoViewer photoViewer = PhotoViewer.m9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.l9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.Y8) {
                photoViewer4.Y8 = false;
                try {
                    vq0 vq0Var = photoViewer4.h0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        WindowManager windowManager = (WindowManager) this.a.E.getSystemService("window");
                        PhotoViewer photoViewer5 = this.a;
                        windowManager.addView(photoViewer5.h0, photoViewer5.e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.a.z0(false, false);
        }
    }

    @Override // wi.l
    public void w0(Rect rect) {
        qq0 qq0Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.Z8;
        if (!photoViewer.a9 || (qq0Var = photoViewer.f0) == null || !qq0Var.isAttachedToWindow()) {
            rect.setEmpty();
            return;
        }
        photoViewer.f0.getLocationOnScreen(new int[2]);
        rect.set(Math.round(rectF.left + r2[0]), Math.round(rectF.top + r2[1]), Math.round(rectF.right + r2[0]), Math.round(rectF.bottom + r2[1]));
    }

    @Override // wi.l
    public /* synthetic */ int y() {
        return 0;
    }

    @Override // wi.l
    public /* synthetic */ View y0(LaunchActivity launchActivity) {
        return null;
    }

    @Override // wi.l
    public /* synthetic */ void B0(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void D1(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void D2(int i7) {
    }

    @Override // wi.l
    public /* synthetic */ void l(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void z0(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void n2(int i7, ArrayList arrayList) {
    }
}
