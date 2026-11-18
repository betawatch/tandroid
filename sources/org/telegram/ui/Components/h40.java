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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h40 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.hz0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.hz0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                z40 z40Var = (z40) this.b;
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (z40Var.m0 == null && surfaceTexture != null && !z40Var.l0) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    z40Var.m0 = new l40(z40Var, surfaceTexture, i7, i10);
                    break;
                }
                break;
            case 1:
                final mz0 mz0Var = (mz0) this.b;
                ArrayList arrayList = mz0Var.c;
                kz0 kz0Var = mz0Var.a;
                if (kz0Var != null) {
                    kz0Var.h();
                    mz0Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.hz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                mz0Var.invalidate();
                                break;
                            default:
                                mz0 mz0Var2 = mz0Var;
                                Runnable runnable = mz0Var2.d;
                                if (runnable != null) {
                                    mz0Var2.e = true;
                                    mz0Var2.d = null;
                                    mz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                kz0 kz0Var2 = new kz0(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.hz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                mz0Var.invalidate();
                                break;
                            default:
                                mz0 mz0Var2 = mz0Var;
                                Runnable runnable = mz0Var2.d;
                                if (runnable != null) {
                                    mz0Var2.e = true;
                                    mz0Var2.d = null;
                                    mz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i7, i10);
                mz0Var.a = kz0Var2;
                kz0Var2.a = org.telegram.messenger.n6.h(mz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        lz0 lz0Var = (lz0) arrayList.get(i13);
                        Bitmap bitmap = lz0Var.e;
                        if (bitmap != null) {
                            mz0Var.a.c(lz0Var.f, bitmap, lz0Var.c, lz0Var.d);
                        } else {
                            ArrayList arrayList2 = lz0Var.b;
                            if (arrayList2 != null) {
                                mz0Var.a.d(arrayList2, lz0Var.d);
                            } else {
                                mz0Var.a.b(lz0Var.g, lz0Var.a, lz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(mz0Var.b);
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
                z40 z40Var = (z40) this.b;
                Camera2Session[] camera2SessionArr = z40Var.v0;
                l40 l40Var = z40Var.m0;
                if (l40Var != null) {
                    l40Var.a(0, true, 0, 0, 0L);
                    z40Var.m0 = null;
                }
                if (z40Var.s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    break;
                } else if (z40Var.t0 != null) {
                    CameraController.getInstance().close(z40Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                mz0 mz0Var = (mz0) this.b;
                kz0 kz0Var = mz0Var.a;
                if (kz0Var != null) {
                    kz0Var.h();
                    mz0Var.a = null;
                }
                Runnable runnable = mz0Var.d;
                if (runnable != null) {
                    mz0Var.d = null;
                    mz0.b(runnable);
                    break;
                }
                break;
            case 2:
                w71 w71Var = (w71) this.b;
                TextureView textureView = w71Var.d;
                if (w71Var.T) {
                    if (w71Var.a0) {
                        w71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    w71Var.T = false;
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
                l40 l40Var = ((z40) this.b).m0;
                if (l40Var != null) {
                    l40Var.G = i7;
                    l40Var.H = i10;
                    l40Var.b();
                    return;
                }
                return;
            case 1:
                kz0 kz0Var = ((mz0) this.b).a;
                if (kz0Var == null || (handler = kz0Var.getHandler()) == null || !kz0Var.b.get()) {
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
                w71 w71Var = (w71) this.b;
                if (w71Var.r == 1) {
                    w71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 5));
                    w71Var.n.invalidate();
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
                    of ofVar = u0Var.d;
                    Objects.requireNonNull(ofVar);
                    handler.post(new v4.p(ofVar, 16));
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
