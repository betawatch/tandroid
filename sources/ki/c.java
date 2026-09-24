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
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class c implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.e11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.e11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.n;
                if (hVar.R && handler != null && hVar.c.isAvailable()) {
                    handler.post(new b(hVar, 3));
                    break;
                }
                break;
            case 1:
                c60 c60Var = (c60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new n50(c60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final k11 k11Var = (k11) this.b;
                ArrayList arrayList = k11Var.c;
                i11 i11Var = k11Var.a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.e11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                k11Var.invalidate();
                                break;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                i11 i11Var2 = new i11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.e11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                k11Var.invalidate();
                                break;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                k11Var.a = i11Var2;
                i11Var2.a = EmuDetector.with(k11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        j11 j11Var = (j11) arrayList.get(i14);
                        Bitmap bitmap = j11Var.e;
                        if (bitmap != null) {
                            k11Var.a.c(j11Var.f, bitmap, j11Var.c, j11Var.d);
                        } else {
                            ArrayList arrayList2 = j11Var.b;
                            if (arrayList2 != null) {
                                k11Var.a.f(arrayList2, j11Var.d);
                            } else {
                                k11Var.a.e(j11Var.a, j11Var.g, j11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(k11Var.b);
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
                ((h) this.b).j.b("preview surface destroyed: active=" + ((h) this.b).R);
                if (!((h) this.b).R) {
                    return true;
                }
                ((h) this.b).s(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                c60 c60Var = (c60) this.b;
                Camera2Session[] camera2SessionArr = c60Var.v0;
                n50 n50Var = c60Var.m0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    c60Var.m0 = null;
                }
                if (!c60Var.s0) {
                    if (c60Var.t0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(c60Var.t0, null, null);
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
                ((og0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                k11 k11Var = (k11) this.b;
                i11 i11Var = k11Var.a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.a = null;
                }
                Runnable runnable = k11Var.d;
                if (runnable == null) {
                    return false;
                }
                k11Var.d = null;
                k11.b(runnable);
                return false;
            case 4:
                o91 o91Var = (o91) this.b;
                TextureView textureView = o91Var.d;
                if (!o91Var.S) {
                    return true;
                }
                if (o91Var.W) {
                    o91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                o91Var.S = false;
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
                h hVar = (h) this.b;
                hVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.F();
                return;
            case 1:
                n50 n50Var = ((c60) this.b).m0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                i11 i11Var = ((k11) this.b).a;
                if (i11Var == null || (handler = i11Var.getHandler()) == null || !i11Var.b.get()) {
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
                if (((h) this.b).W) {
                    ((h) this.b).W = false;
                    ((h) this.b).j.b("camera switch first preview frame");
                    r0 r0Var = (r0) ((h) this.b).k.b;
                    Handler handler = r0Var.h;
                    l.d dVar = r0Var.c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.h0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                h hVar = (h) this.b;
                if (hVar.i0 == 0) {
                    hVar.i0 = elapsedRealtimeNanos;
                    l lVar = hVar.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((h) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((h) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((h) this.b).q);
                    sb2.append(", attached=");
                    sb2.append(((h) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((h) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((h) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((h) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    sb2.append(((h) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((h) this.b).c.getDisplay().getRefreshRate()));
                    lVar.b(sb2.toString());
                }
                h hVar2 = (h) this.b;
                long j10 = hVar2.k0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    hVar2.m0++;
                    hVar2.n0 += j11;
                    j3 = 0;
                    double d = j11;
                    hVar2.o0 = (d * d) + hVar2.o0;
                    long j12 = hVar2.p0;
                    if (j12 == 0 || j11 < j12) {
                        hVar2.p0 = j11;
                    }
                    hVar2.q0 = Math.max(hVar2.q0, j11);
                    if (j11 > 50000000) {
                        hVar2.r0++;
                    }
                    if (j11 > 100000000) {
                        hVar2.s0++;
                    }
                } else {
                    j3 = 0;
                }
                h hVar3 = (h) this.b;
                hVar3.k0 = elapsedRealtimeNanos;
                long j13 = hVar3.l0;
                if (timestamp > j13) {
                    if (hVar3.u0 == j3) {
                        hVar3.u0 = timestamp;
                    }
                    hVar3.v0 = timestamp;
                    hVar3.t0++;
                } else if (j13 != j3) {
                    hVar3.w0++;
                }
                hVar3.l0 = timestamp;
                hVar3.j0++;
                long j14 = elapsedRealtimeNanos - hVar3.i0;
                if (j14 >= 5000000000L) {
                    TextureView textureView = hVar3.c;
                    long j15 = hVar3.v0 - hVar3.u0;
                    if (j15 > j3) {
                        if (hVar3.t0 > 1) {
                            f7 = ((r13 - 1) * 1.0E9f) / j15;
                            hVar3.j.b("preview frame delivery: callbackFps=" + ((hVar3.j0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.n0, hVar3.m0) + ", min=" + (hVar3.p0 / 1000000.0f) + ", max=" + (hVar3.q0 / 1000000.0f) + ", jitter=" + h.A(hVar3.o0, hVar3.n0, hVar3.m0) + "}, gaps={over50ms=" + hVar3.r0 + ", over100ms=" + hVar3.s0 + "}, nonMonotonicTimestamps=" + hVar3.w0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.u();
                            hVar3.i0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.j.b("preview frame delivery: callbackFps=" + ((hVar3.j0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.n0, hVar3.m0) + ", min=" + (hVar3.p0 / 1000000.0f) + ", max=" + (hVar3.q0 / 1000000.0f) + ", jitter=" + h.A(hVar3.o0, hVar3.n0, hVar3.m0) + "}, gaps={over50ms=" + hVar3.r0 + ", over100ms=" + hVar3.s0 + "}, nonMonotonicTimestamps=" + hVar3.w0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.u();
                    hVar3.i0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
                o91 o91Var = (o91) this.b;
                if (o91Var.r == 1) {
                    o91Var.n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    o91Var.n.invalidate();
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
