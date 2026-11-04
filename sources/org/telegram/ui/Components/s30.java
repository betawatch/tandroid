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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s30 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s30(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.xy0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.xy0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.a) {
            case 0:
                k40 k40Var = (k40) this.b;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (k40Var.m0 == null && surfaceTexture != null && !k40Var.l0) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    k40Var.m0 = new w30(k40Var, surfaceTexture, i3, i10);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final cz0 cz0Var = (cz0) this.b;
                ArrayList arrayList = cz0Var.c;
                az0 az0Var = cz0Var.a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.a = null;
                }
                final int i11 = 0;
                ?? r5 = new Runnable() { // from class: org.telegram.ui.Components.xy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cz0Var.invalidate();
                                break;
                            default:
                                cz0 cz0Var2 = cz0Var;
                                Runnable runnable = cz0Var2.d;
                                if (runnable != null) {
                                    cz0Var2.e = true;
                                    cz0Var2.d = null;
                                    cz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                az0 az0Var2 = new az0(surfaceTexture, r5, new Runnable() { // from class: org.telegram.ui.Components.xy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                cz0Var.invalidate();
                                break;
                            default:
                                cz0 cz0Var2 = cz0Var;
                                Runnable runnable = cz0Var2.d;
                                if (runnable != null) {
                                    cz0Var2.e = true;
                                    cz0Var2.d = null;
                                    cz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i3, i10);
                cz0Var.a = az0Var2;
                az0Var2.a = org.telegram.messenger.n6.h(cz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        bz0 bz0Var = (bz0) arrayList.get(i13);
                        Bitmap bitmap = bz0Var.e;
                        if (bitmap != null) {
                            cz0Var.a.c(bz0Var.f, bitmap, bz0Var.c, bz0Var.d);
                        } else {
                            ArrayList arrayList2 = bz0Var.b;
                            if (arrayList2 != null) {
                                cz0Var.a.e(arrayList2, bz0Var.d);
                            } else {
                                cz0Var.a.b(bz0Var.g, bz0Var.a, bz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(cz0Var.b);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                wi.j jVar = (wi.j) this.b;
                jVar.j.b("preview surface available: view=" + i3 + "x" + i10);
                Handler handler = jVar.n;
                if (jVar.V && handler != null && jVar.c.isAvailable()) {
                    handler.post(new wi.a(jVar, 7));
                    break;
                }
                break;
            default:
                yh.e eVar = (yh.e) this.b;
                if (eVar.f == null) {
                    yh.d dVar = new yh.d(eVar, surfaceTexture, i3, i10, new yh.c(eVar, 1));
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
                k40 k40Var = (k40) this.b;
                Camera2Session[] camera2SessionArr = k40Var.v0;
                w30 w30Var = k40Var.m0;
                if (w30Var != null) {
                    w30Var.a(0, true, 0, 0, 0L);
                    k40Var.m0 = null;
                }
                if (k40Var.s0) {
                    for (int i3 = 0; i3 < camera2SessionArr.length; i3++) {
                        Camera2Session camera2Session = camera2SessionArr[i3];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i3] = null;
                        }
                    }
                    break;
                } else if (k40Var.t0 != null) {
                    CameraController.getInstance().close(k40Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                ((ie0) this.b).W.x3.setSurfaceTexture(surfaceTexture);
                break;
            case 2:
                cz0 cz0Var = (cz0) this.b;
                az0 az0Var = cz0Var.a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.a = null;
                }
                Runnable runnable = cz0Var.d;
                if (runnable != null) {
                    cz0Var.d = null;
                    cz0.b(runnable);
                    break;
                }
                break;
            case 3:
                d71 d71Var = (d71) this.b;
                TextureView textureView = d71Var.d;
                if (d71Var.T) {
                    if (d71Var.a0) {
                        d71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    d71Var.T = false;
                    break;
                }
                break;
            case 4:
                ((wi.j) this.b).j.b("preview surface destroyed: active=" + ((wi.j) this.b).V);
                if (((wi.j) this.b).V) {
                    ((wi.j) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            default:
                yh.d dVar = ((yh.e) this.b).f;
                if (dVar != null) {
                    dVar.a = false;
                    ((yh.e) this.b).f = null;
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        Handler handler;
        switch (this.a) {
            case 0:
                w30 w30Var = ((k40) this.b).m0;
                if (w30Var != null) {
                    w30Var.G = i3;
                    w30Var.H = i10;
                    w30Var.b();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                az0 az0Var = ((cz0) this.b).a;
                if (az0Var == null || (handler = az0Var.getHandler()) == null || !az0Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i3, i10));
                return;
            case 3:
                return;
            case 4:
                wi.j jVar = (wi.j) this.b;
                jVar.j.b("preview surface size changed: view=" + i3 + "x" + i10);
                jVar.d0();
                return;
            default:
                yh.d dVar = ((yh.e) this.b).f;
                if (dVar != null) {
                    synchronized (dVar.e) {
                        dVar.f = true;
                        dVar.h = i3;
                        dVar.n = i10;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j10;
        float f10;
        switch (this.a) {
            case 3:
                d71 d71Var = (d71) this.b;
                if (d71Var.r == 1) {
                    d71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 5));
                    d71Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((wi.j) this.b).a0) {
                    ((wi.j) this.b).a0 = false;
                    wi.n nVar = ((wi.j) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    wi.j jVar = (wi.j) this.b;
                    sb2.append(jVar.n0 ? "DUAL_ACTIVE" : jVar.E0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.j.z(((wi.j) this.b).I0));
                    nVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.j) this.b).k.b;
                    Handler handler = t0Var.i;
                    y00 y00Var = t0Var.d;
                    Objects.requireNonNull(y00Var);
                    handler.post(new r4.u(y00Var, 29));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.j jVar2 = (wi.j) this.b;
                if (jVar2.J0 == 0) {
                    jVar2.J0 = elapsedRealtimeNanos;
                    wi.n nVar2 = jVar2.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.j) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.j) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((wi.j) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((wi.j) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.j) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.j) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.j) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((wi.j) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((wi.j) this.b).c.getDisplay().getRefreshRate()));
                    nVar2.b(sb3.toString());
                }
                wi.j jVar3 = (wi.j) this.b;
                long j11 = jVar3.L0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar3.N0++;
                    jVar3.O0 += j12;
                    j10 = 0;
                    double d = j12;
                    jVar3.P0 = (d * d) + jVar3.P0;
                    long j13 = jVar3.Q0;
                    if (j13 == 0 || j12 < j13) {
                        jVar3.Q0 = j12;
                    }
                    jVar3.R0 = Math.max(jVar3.R0, j12);
                    if (j12 > 50000000) {
                        jVar3.S0++;
                    }
                    if (j12 > 100000000) {
                        jVar3.T0++;
                    }
                } else {
                    j10 = 0;
                }
                wi.j jVar4 = (wi.j) this.b;
                jVar4.L0 = elapsedRealtimeNanos;
                long j14 = jVar4.M0;
                if (timestamp > j14) {
                    if (jVar4.V0 == j10) {
                        jVar4.V0 = timestamp;
                    }
                    jVar4.W0 = timestamp;
                    jVar4.U0++;
                } else if (j14 != j10) {
                    jVar4.X0++;
                }
                jVar4.M0 = timestamp;
                jVar4.K0++;
                long j15 = elapsedRealtimeNanos - jVar4.J0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = jVar4.c;
                    long j16 = jVar4.W0 - jVar4.V0;
                    if (j16 > j10) {
                        if (jVar4.U0 > 1) {
                            f10 = ((r14 - 1) * 1.0E9f) / j16;
                            jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (jVar4.Q0 / 1000000.0f) + ", max=" + (jVar4.R0 / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.J0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f10 = 0.0f;
                    jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (jVar4.Q0 / 1000000.0f) + ", max=" + (jVar4.R0 / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.J0 = elapsedRealtimeNanos;
                }
                break;
        }
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void g(SurfaceTexture surfaceTexture) {
    }

    private final void h(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i3, int i10) {
    }
}
