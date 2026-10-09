package ki;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.w11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.w11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                jVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.n;
                if (jVar.S && handler != null && jVar.c.isAvailable()) {
                    handler.post(new a(jVar, 5));
                    break;
                }
                break;
            case 1:
                t60 t60Var = (t60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (t60Var.m0 == null && surfaceTexture != null && !t60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    t60Var.m0 = new e60(t60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final c21 c21Var = (c21) this.b;
                ArrayList arrayList = c21Var.c;
                a21 a21Var = c21Var.a;
                if (a21Var != null) {
                    a21Var.i();
                    c21Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.w11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c21Var.invalidate();
                                break;
                            default:
                                c21 c21Var2 = c21Var;
                                Runnable runnable = c21Var2.d;
                                if (runnable != null) {
                                    c21Var2.e = true;
                                    c21Var2.d = null;
                                    c21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                a21 a21Var2 = new a21(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.w11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                c21Var.invalidate();
                                break;
                            default:
                                c21 c21Var2 = c21Var;
                                Runnable runnable = c21Var2.d;
                                if (runnable != null) {
                                    c21Var2.e = true;
                                    c21Var2.d = null;
                                    c21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                c21Var.a = a21Var2;
                a21Var2.a = EmuDetector.with(c21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        b21 b21Var = (b21) arrayList.get(i14);
                        Bitmap bitmap = b21Var.e;
                        if (bitmap != null) {
                            c21Var.a.c(b21Var.f, bitmap, b21Var.c, b21Var.d);
                        } else {
                            ArrayList arrayList2 = b21Var.b;
                            if (arrayList2 != null) {
                                c21Var.a.f(arrayList2, b21Var.d);
                            } else {
                                c21Var.a.e(b21Var.a, b21Var.g, b21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(c21Var.b);
                    break;
                }
                break;
            case 4:
                break;
            default:
                vh.f fVar = (vh.f) this.b;
                if (fVar.f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f = eVar;
                    eVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((j) this.b).j.b("preview surface destroyed: active=" + ((j) this.b).S);
                if (!((j) this.b).S) {
                    return true;
                }
                ((j) this.b).C(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                t60 t60Var = (t60) this.b;
                Camera2Session[] camera2SessionArr = t60Var.v0;
                e60 e60Var = t60Var.m0;
                if (e60Var != null) {
                    e60Var.b(0L, 0, true, 0, 0);
                    t60Var.m0 = null;
                }
                if (!t60Var.s0) {
                    if (t60Var.t0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(t60Var.t0, null, null);
                    return true;
                }
                for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                    Camera2Session camera2Session = camera2SessionArr[i10];
                    if (camera2Session != null) {
                        camera2Session.destroy(false);
                        camera2SessionArr[i10] = null;
                    }
                }
                return true;
            case 2:
                ((gh0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                c21 c21Var = (c21) this.b;
                a21 a21Var = c21Var.a;
                if (a21Var != null) {
                    a21Var.i();
                    c21Var.a = null;
                }
                Runnable runnable = c21Var.d;
                if (runnable == null) {
                    return false;
                }
                c21Var.d = null;
                c21.b(runnable);
                return false;
            case 4:
                ha1 ha1Var = (ha1) this.b;
                TextureView textureView = ha1Var.d;
                if (!ha1Var.S) {
                    return true;
                }
                if (ha1Var.W) {
                    ha1Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                ha1Var.S = false;
                return false;
            default:
                vh.e eVar = ((vh.f) this.b).f;
                if (eVar == null) {
                    return true;
                }
                eVar.a = false;
                ((vh.f) this.b).f = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                jVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.Q();
                return;
            case 1:
                e60 e60Var = ((t60) this.b).m0;
                if (e60Var != null) {
                    e60Var.F = i10;
                    e60Var.G = i11;
                    e60Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                a21 a21Var = ((c21) this.b).a;
                if (a21Var == null || (handler = a21Var.getHandler()) == null || !a21Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.b).f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f = true;
                        eVar.h = i10;
                        eVar.n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f7;
        switch (this.a) {
            case 0:
                if (((j) this.b).X) {
                    ((j) this.b).X = false;
                    n nVar = ((j) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    sb2.append(((j) this.b).r0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(j.s(((j) this.b).v0));
                    nVar.b(sb2.toString());
                    t0 t0Var = (t0) ((j) this.b).k.b;
                    Handler handler = t0Var.i;
                    m2.t tVar = t0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                j jVar = (j) this.b;
                if (jVar.w0 == 0) {
                    jVar.w0 = elapsedRealtimeNanos;
                    n nVar2 = jVar.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((j) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((j) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((j) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((j) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((j) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((j) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((j) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((j) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((j) this.b).c.getDisplay().getRefreshRate()));
                    nVar2.b(sb3.toString());
                }
                j jVar2 = (j) this.b;
                long j10 = jVar2.y0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    jVar2.A0++;
                    jVar2.B0 += j11;
                    j3 = 0;
                    double d = j11;
                    jVar2.C0 = (d * d) + jVar2.C0;
                    long j12 = jVar2.D0;
                    if (j12 == 0 || j11 < j12) {
                        jVar2.D0 = j11;
                    }
                    jVar2.E0 = Math.max(jVar2.E0, j11);
                    if (j11 > 50000000) {
                        jVar2.F0++;
                    }
                    if (j11 > 100000000) {
                        jVar2.G0++;
                    }
                } else {
                    j3 = 0;
                }
                j jVar3 = (j) this.b;
                jVar3.y0 = elapsedRealtimeNanos;
                long j13 = jVar3.z0;
                if (timestamp > j13) {
                    if (jVar3.I0 == j3) {
                        jVar3.I0 = timestamp;
                    }
                    jVar3.J0 = timestamp;
                    jVar3.H0++;
                } else if (j13 != j3) {
                    jVar3.K0++;
                }
                jVar3.z0 = timestamp;
                jVar3.x0++;
                long j14 = elapsedRealtimeNanos - jVar3.w0;
                if (j14 >= 5000000000L) {
                    TextureView textureView = jVar3.c;
                    long j15 = jVar3.J0 - jVar3.I0;
                    if (j15 > j3) {
                        if (jVar3.H0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j15;
                            jVar3.j.b("preview frame delivery: callbackFps=" + ((jVar3.x0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.f(jVar3.B0, jVar3.A0) + ", min=" + (jVar3.D0 / 1000000.0f) + ", max=" + (jVar3.E0 / 1000000.0f) + ", jitter=" + j.K(jVar3.C0, jVar3.B0, jVar3.A0) + "}, gaps={over50ms=" + jVar3.F0 + ", over100ms=" + jVar3.G0 + "}, nonMonotonicTimestamps=" + jVar3.K0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar3.E();
                            jVar3.w0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    jVar3.j.b("preview frame delivery: callbackFps=" + ((jVar3.x0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + j.f(jVar3.B0, jVar3.A0) + ", min=" + (jVar3.D0 / 1000000.0f) + ", max=" + (jVar3.E0 / 1000000.0f) + ", jitter=" + j.K(jVar3.C0, jVar3.B0, jVar3.A0) + "}, gaps={over50ms=" + jVar3.F0 + ", over100ms=" + jVar3.G0 + "}, nonMonotonicTimestamps=" + jVar3.K0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar3.E();
                    jVar3.w0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
                ha1 ha1Var = (ha1) this.b;
                if (ha1Var.r == 1) {
                    ha1Var.n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ha1Var.n.invalidate();
                    break;
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

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
