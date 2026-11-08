package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w30 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.yy0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.yy0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                o40 o40Var = (o40) this.b;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (o40Var.l0 == null && surfaceTexture != null && !o40Var.k0) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    o40Var.l0 = new a40(o40Var, surfaceTexture, i7, i10);
                    break;
                }
                break;
            case 1:
                final dz0 dz0Var = (dz0) this.b;
                ArrayList arrayList = dz0Var.c;
                bz0 bz0Var = dz0Var.a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.yy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                dz0Var.invalidate();
                                break;
                            default:
                                dz0 dz0Var2 = dz0Var;
                                Runnable runnable = dz0Var2.d;
                                if (runnable != null) {
                                    dz0Var2.e = true;
                                    dz0Var2.d = null;
                                    dz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                bz0 bz0Var2 = new bz0(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.yy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                dz0Var.invalidate();
                                break;
                            default:
                                dz0 dz0Var2 = dz0Var;
                                Runnable runnable = dz0Var2.d;
                                if (runnable != null) {
                                    dz0Var2.e = true;
                                    dz0Var2.d = null;
                                    dz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i7, i10);
                dz0Var.a = bz0Var2;
                bz0Var2.a = org.telegram.messenger.n6.h(dz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        cz0 cz0Var = (cz0) arrayList.get(i13);
                        Bitmap bitmap = cz0Var.e;
                        if (bitmap != null) {
                            dz0Var.a.c(cz0Var.f, bitmap, cz0Var.c, cz0Var.d);
                        } else {
                            ArrayList arrayList2 = cz0Var.b;
                            if (arrayList2 != null) {
                                dz0Var.a.d(arrayList2, cz0Var.d);
                            } else {
                                dz0Var.a.b(cz0Var.g, cz0Var.a, cz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(dz0Var.b);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                EglRenderer eglRenderer = q0Var.a;
                if (!q0Var.c && q0Var.b != surfaceTexture) {
                    q0Var.b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 4:
                wi.k kVar = (wi.k) this.b;
                kVar.j.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.n;
                if (kVar.V && handler != null && kVar.c.isAvailable()) {
                    handler.post(new wi.a(kVar, 8));
                    break;
                }
                break;
            default:
                xh.e eVar = (xh.e) this.b;
                if (eVar.f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f = dVar;
                    dVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                o40 o40Var = (o40) this.b;
                Camera2Session[] camera2SessionArr = o40Var.u0;
                a40 a40Var = o40Var.l0;
                if (a40Var != null) {
                    a40Var.a(0, true, 0, 0, 0L);
                    o40Var.l0 = null;
                }
                if (o40Var.r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    break;
                } else if (o40Var.s0 != null) {
                    CameraController.getInstance().close(o40Var.s0, null, null);
                    break;
                }
                break;
            case 1:
                dz0 dz0Var = (dz0) this.b;
                bz0 bz0Var = dz0Var.a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.a = null;
                }
                Runnable runnable = dz0Var.d;
                if (runnable != null) {
                    dz0Var.d = null;
                    dz0.b(runnable);
                    break;
                }
                break;
            case 2:
                l71 l71Var = (l71) this.b;
                TextureView textureView = l71Var.d;
                if (l71Var.S) {
                    if (l71Var.W) {
                        l71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    l71Var.S = false;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ((wi.k) this.b).j.b("preview surface destroyed: active=" + ((wi.k) this.b).V);
                if (((wi.k) this.b).V) {
                    ((wi.k) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            default:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    dVar.a = false;
                    ((xh.e) this.b).f = null;
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.a) {
            case 0:
                a40 a40Var = ((o40) this.b).l0;
                if (a40Var != null) {
                    a40Var.F = i7;
                    a40Var.G = i10;
                    a40Var.b();
                    return;
                }
                return;
            case 1:
                bz0 bz0Var = ((dz0) this.b).a;
                if (bz0Var == null || (handler = bz0Var.getHandler()) == null || !bz0Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i7, i10));
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                if (i7 <= 0 || i10 <= 0) {
                    return;
                }
                q0Var.a.setLayoutAspectRatio(i7 / i10);
                return;
            case 4:
                wi.k kVar = (wi.k) this.b;
                kVar.j.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.b0();
                return;
            default:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    synchronized (dVar.e) {
                        dVar.f = true;
                        dVar.h = i7;
                        dVar.n = i10;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f10;
        switch (this.a) {
            case 2:
                l71 l71Var = (l71) this.b;
                if (l71Var.r == 1) {
                    l71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    l71Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((wi.k) this.b).Y) {
                    ((wi.k) this.b).Y = false;
                    wi.o oVar = ((wi.k) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    sb2.append(((wi.k) this.b).l0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.k.A(((wi.k) this.b).G0));
                    oVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.k) this.b).k.b;
                    Handler handler = t0Var.i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.p(rtVar, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.k kVar = (wi.k) this.b;
                if (kVar.H0 == 0) {
                    kVar.H0 = elapsedRealtimeNanos;
                    wi.o oVar2 = kVar.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.k) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.k) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((wi.k) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((wi.k) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.k) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.k) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.k) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((wi.k) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((wi.k) this.b).c.getDisplay().getRefreshRate()));
                    oVar2.b(sb3.toString());
                }
                wi.k kVar2 = (wi.k) this.b;
                long j10 = kVar2.J0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar2.L0++;
                    kVar2.M0 += j11;
                    j3 = 0;
                    double d = j11;
                    kVar2.N0 = (d * d) + kVar2.N0;
                    long j12 = kVar2.O0;
                    if (j12 == 0 || j11 < j12) {
                        kVar2.O0 = j11;
                    }
                    kVar2.P0 = Math.max(kVar2.P0, j11);
                    if (j11 > 50000000) {
                        kVar2.Q0++;
                    }
                    if (j11 > 100000000) {
                        kVar2.R0++;
                    }
                } else {
                    j3 = 0;
                }
                wi.k kVar3 = (wi.k) this.b;
                kVar3.J0 = elapsedRealtimeNanos;
                long j13 = kVar3.K0;
                if (timestamp > j13) {
                    if (kVar3.T0 == j3) {
                        kVar3.T0 = timestamp;
                    }
                    kVar3.U0 = timestamp;
                    kVar3.S0++;
                } else if (j13 != j3) {
                    kVar3.V0++;
                }
                kVar3.K0 = timestamp;
                kVar3.I0++;
                long j14 = elapsedRealtimeNanos - kVar3.H0;
                if (j14 >= 5000000000L) {
                    TextureView textureView = kVar3.c;
                    long j15 = kVar3.U0 - kVar3.T0;
                    if (j15 > j3) {
                        if (kVar3.S0 > 1) {
                            f10 = ((r14 - 1) * 1.0E9f) / j15;
                            kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.I0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.M0, kVar3.L0) + ", min=" + (kVar3.O0 / 1000000.0f) + ", max=" + (kVar3.P0 / 1000000.0f) + ", jitter=" + wi.k.V(kVar3.N0, kVar3.M0, kVar3.L0) + "}, gaps={over50ms=" + kVar3.Q0 + ", over100ms=" + kVar3.R0 + "}, nonMonotonicTimestamps=" + kVar3.V0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            kVar3.P();
                            kVar3.H0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.I0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.M0, kVar3.L0) + ", min=" + (kVar3.O0 / 1000000.0f) + ", max=" + (kVar3.P0 / 1000000.0f) + ", jitter=" + wi.k.V(kVar3.N0, kVar3.M0, kVar3.L0) + "}, gaps={over50ms=" + kVar3.Q0 + ", over100ms=" + kVar3.R0 + "}, nonMonotonicTimestamps=" + kVar3.V0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    kVar3.P();
                    kVar3.H0 = elapsedRealtimeNanos;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void d(SurfaceTexture surfaceTexture) {
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i7, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i7, int i10) {
    }
}
