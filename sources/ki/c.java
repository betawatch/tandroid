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
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p91;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class c implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.f11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.f11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.n;
                if (hVar.M && handler != null && hVar.c.isAvailable()) {
                    handler.post(new b(hVar, 4));
                    break;
                }
                break;
            case 1:
                a60 a60Var = (a60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (a60Var.k0 == null && surfaceTexture != null && !a60Var.j0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    a60Var.k0 = new m50(a60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final l11 l11Var = (l11) this.b;
                ArrayList arrayList = l11Var.c;
                j11 j11Var = l11Var.a;
                if (j11Var != null) {
                    j11Var.i();
                    l11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.f11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                l11Var.invalidate();
                                break;
                            default:
                                l11 l11Var2 = l11Var;
                                Runnable runnable = l11Var2.d;
                                if (runnable != null) {
                                    l11Var2.e = true;
                                    l11Var2.d = null;
                                    l11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                j11 j11Var2 = new j11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.f11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                l11Var.invalidate();
                                break;
                            default:
                                l11 l11Var2 = l11Var;
                                Runnable runnable = l11Var2.d;
                                if (runnable != null) {
                                    l11Var2.e = true;
                                    l11Var2.d = null;
                                    l11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                l11Var.a = j11Var2;
                j11Var2.a = EmuDetector.with(l11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        k11 k11Var = (k11) arrayList.get(i14);
                        Bitmap bitmap = k11Var.e;
                        if (bitmap != null) {
                            l11Var.a.c(k11Var.f, bitmap, k11Var.c, k11Var.d);
                        } else {
                            ArrayList arrayList2 = k11Var.b;
                            if (arrayList2 != null) {
                                l11Var.a.f(arrayList2, k11Var.d);
                            } else {
                                l11Var.a.e(k11Var.a, k11Var.g, k11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(l11Var.b);
                    break;
                }
                break;
            case 4:
                break;
            default:
                vh.g gVar = (vh.g) this.b;
                if (gVar.f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f = fVar;
                    fVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface destroyed: active=" + hVar.M);
                if (!hVar.M) {
                    return true;
                }
                hVar.s(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                a60 a60Var = (a60) this.b;
                Camera2Session[] camera2SessionArr = a60Var.t0;
                m50 m50Var = a60Var.k0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    a60Var.k0 = null;
                }
                if (!a60Var.q0) {
                    if (a60Var.r0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(a60Var.r0, null, null);
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
                l11 l11Var = (l11) this.b;
                j11 j11Var = l11Var.a;
                if (j11Var != null) {
                    j11Var.i();
                    l11Var.a = null;
                }
                Runnable runnable = l11Var.d;
                if (runnable == null) {
                    return false;
                }
                l11Var.d = null;
                l11.b(runnable);
                return false;
            case 4:
                p91 p91Var = (p91) this.b;
                TextureView textureView = p91Var.d;
                if (!p91Var.S) {
                    return true;
                }
                if (p91Var.W) {
                    p91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                p91Var.S = false;
                return false;
            default:
                vh.f fVar = ((vh.g) this.b).f;
                if (fVar == null) {
                    return true;
                }
                fVar.a = false;
                ((vh.g) this.b).f = null;
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
                hVar.C();
                return;
            case 1:
                m50 m50Var = ((a60) this.b).k0;
                if (m50Var != null) {
                    m50Var.F = i10;
                    m50Var.G = i11;
                    m50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                j11 j11Var = ((l11) this.b).a;
                if (j11Var == null || (handler = j11Var.getHandler()) == null || !j11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 4:
                return;
            default:
                vh.f fVar = ((vh.g) this.b).f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f = true;
                        fVar.h = i10;
                        fVar.n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                if (((h) this.b).Q) {
                    ((h) this.b).Q = false;
                    ((h) this.b).j.b("camera switch first preview frame");
                    o0 o0Var = (o0) ((h) this.b).k.b;
                    Handler handler = o0Var.h;
                    l.d dVar = o0Var.c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.g0(dVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                h hVar = (h) this.b;
                if (hVar.b0 == 0) {
                    hVar.b0 = elapsedRealtimeNanos;
                }
                hVar.c0++;
                long j3 = elapsedRealtimeNanos - hVar.b0;
                if (j3 >= 5000000000L) {
                    hVar.j.b("preview frames: fps=" + ((((h) this.b).c0 * 1.0E9f) / j3));
                    h hVar2 = (h) this.b;
                    hVar2.b0 = elapsedRealtimeNanos;
                    hVar2.c0 = 0L;
                    break;
                }
                break;
            case 4:
                p91 p91Var = (p91) this.b;
                if (p91Var.r == 1) {
                    p91Var.n.getViewTreeObserver().addOnPreDrawListener(new ga(this, 4));
                    p91Var.n.invalidate();
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
