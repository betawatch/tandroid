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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k40 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.jz0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.jz0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                c50 c50Var = (c50) this.b;
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (c50Var.m0 == null && surfaceTexture != null && !c50Var.l0) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    c50Var.m0 = new o40(c50Var, surfaceTexture, i7, i10);
                    break;
                }
                break;
            case 1:
                final oz0 oz0Var = (oz0) this.b;
                ArrayList arrayList = oz0Var.c;
                mz0 mz0Var = oz0Var.a;
                if (mz0Var != null) {
                    mz0Var.h();
                    oz0Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.jz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                oz0Var.invalidate();
                                break;
                            default:
                                oz0 oz0Var2 = oz0Var;
                                Runnable runnable = oz0Var2.d;
                                if (runnable != null) {
                                    oz0Var2.e = true;
                                    oz0Var2.d = null;
                                    oz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                mz0 mz0Var2 = new mz0(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.jz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                oz0Var.invalidate();
                                break;
                            default:
                                oz0 oz0Var2 = oz0Var;
                                Runnable runnable = oz0Var2.d;
                                if (runnable != null) {
                                    oz0Var2.e = true;
                                    oz0Var2.d = null;
                                    oz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i7, i10);
                oz0Var.a = mz0Var2;
                mz0Var2.a = org.telegram.messenger.n6.h(oz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        nz0 nz0Var = (nz0) arrayList.get(i13);
                        Bitmap bitmap = nz0Var.e;
                        if (bitmap != null) {
                            oz0Var.a.c(nz0Var.f, bitmap, nz0Var.c, nz0Var.d);
                        } else {
                            ArrayList arrayList2 = nz0Var.b;
                            if (arrayList2 != null) {
                                oz0Var.a.d(arrayList2, nz0Var.d);
                            } else {
                                oz0Var.a.b(nz0Var.g, nz0Var.a, nz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(oz0Var.b);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                EglRenderer eglRenderer = t0Var.a;
                if (!t0Var.c && t0Var.b != surfaceTexture) {
                    t0Var.b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 4:
                xh.e eVar = (xh.e) this.b;
                if (eVar.f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f = dVar;
                    dVar.start();
                    break;
                }
                break;
            default:
                zi.k kVar = (zi.k) this.b;
                kVar.j.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.n;
                if (kVar.U && handler != null && kVar.c.isAvailable()) {
                    handler.post(new zi.a(kVar, 8));
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                c50 c50Var = (c50) this.b;
                Camera2Session[] camera2SessionArr = c50Var.v0;
                o40 o40Var = c50Var.m0;
                if (o40Var != null) {
                    o40Var.a(0, true, 0, 0, 0L);
                    c50Var.m0 = null;
                }
                if (c50Var.s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    break;
                } else if (c50Var.t0 != null) {
                    CameraController.getInstance().close(c50Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                oz0 oz0Var = (oz0) this.b;
                mz0 mz0Var = oz0Var.a;
                if (mz0Var != null) {
                    mz0Var.h();
                    oz0Var.a = null;
                }
                Runnable runnable = oz0Var.d;
                if (runnable != null) {
                    oz0Var.d = null;
                    oz0.b(runnable);
                    break;
                }
                break;
            case 2:
                z71 z71Var = (z71) this.b;
                TextureView textureView = z71Var.d;
                if (z71Var.T) {
                    if (z71Var.a0) {
                        z71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    z71Var.T = false;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    dVar.a = false;
                    ((xh.e) this.b).f = null;
                    break;
                }
                break;
            default:
                ((zi.k) this.b).j.b("preview surface destroyed: active=" + ((zi.k) this.b).U);
                if (((zi.k) this.b).U) {
                    ((zi.k) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
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
                o40 o40Var = ((c50) this.b).m0;
                if (o40Var != null) {
                    o40Var.G = i7;
                    o40Var.H = i10;
                    o40Var.b();
                    return;
                }
                return;
            case 1:
                mz0 mz0Var = ((oz0) this.b).a;
                if (mz0Var == null || (handler = mz0Var.getHandler()) == null || !mz0Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i7, i10));
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                if (i7 <= 0 || i10 <= 0) {
                    return;
                }
                t0Var.a.setLayoutAspectRatio(i7 / i10);
                return;
            case 4:
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
            default:
                zi.k kVar = (zi.k) this.b;
                kVar.j.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.a0();
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f10;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                z71 z71Var = (z71) this.b;
                if (z71Var.r == 1) {
                    z71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    z71Var.n.invalidate();
                    break;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                if (((zi.k) this.b).X) {
                    ((zi.k) this.b).X = false;
                    zi.o oVar = ((zi.k) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    sb2.append(((zi.k) this.b).k0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(zi.k.z(((zi.k) this.b).F0));
                    oVar.b(sb2.toString());
                    zi.u0 u0Var = (zi.u0) ((zi.k) this.b).k.a;
                    Handler handler = u0Var.i;
                    qf qfVar = u0Var.d;
                    Objects.requireNonNull(qfVar);
                    handler.post(new v4.p(qfVar, 16));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                zi.k kVar = (zi.k) this.b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    zi.o oVar2 = kVar.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((zi.k) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((zi.k) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((zi.k) this.b).c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((zi.k) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((zi.k) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((zi.k) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((zi.k) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((zi.k) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((zi.k) this.b).c.getDisplay().getRefreshRate()));
                    oVar2.b(sb3.toString());
                }
                zi.k kVar2 = (zi.k) this.b;
                long j10 = kVar2.I0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar2.K0++;
                    kVar2.L0 += j11;
                    j3 = 0;
                    double d = j11;
                    kVar2.M0 = (d * d) + kVar2.M0;
                    long j12 = kVar2.N0;
                    if (j12 == 0 || j11 < j12) {
                        kVar2.N0 = j11;
                    }
                    kVar2.O0 = Math.max(kVar2.O0, j11);
                    if (j11 > 50000000) {
                        kVar2.P0++;
                    }
                    if (j11 > 100000000) {
                        kVar2.Q0++;
                    }
                } else {
                    j3 = 0;
                }
                zi.k kVar3 = (zi.k) this.b;
                kVar3.I0 = elapsedRealtimeNanos;
                long j13 = kVar3.J0;
                if (timestamp > j13) {
                    if (kVar3.S0 == j3) {
                        kVar3.S0 = timestamp;
                    }
                    kVar3.T0 = timestamp;
                    kVar3.R0++;
                } else if (j13 != j3) {
                    kVar3.U0++;
                }
                kVar3.J0 = timestamp;
                kVar3.H0++;
                long j14 = elapsedRealtimeNanos - kVar3.G0;
                if (j14 >= 5000000000L) {
                    TextureView textureView2 = kVar3.c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        if (kVar3.R0 > 1) {
                            f10 = ((r14 - 1) * 1.0E9f) / j15;
                            kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (kVar3.N0 / 1000000.0f) + ", max=" + (kVar3.O0 / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (kVar3.N0 / 1000000.0f) + ", max=" + (kVar3.O0 / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    kVar3.O();
                    kVar3.G0 = elapsedRealtimeNanos;
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
