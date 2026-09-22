package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Choreographer;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.r01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.r01] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                w50 w50Var = (w50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w50Var.h0 == null && surfaceTexture != null && !w50Var.g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w50Var.h0 = new n50(w50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final x01 x01Var = (x01) this.b;
                ArrayList arrayList = x01Var.c;
                v01 v01Var = x01Var.a;
                if (v01Var != null) {
                    v01Var.i();
                    x01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.r01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                x01Var.invalidate();
                                break;
                            default:
                                x01 x01Var2 = x01Var;
                                Runnable runnable = x01Var2.d;
                                if (runnable != null) {
                                    x01Var2.e = true;
                                    x01Var2.d = null;
                                    x01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                v01 v01Var2 = new v01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.r01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                x01Var.invalidate();
                                break;
                            default:
                                x01 x01Var2 = x01Var;
                                Runnable runnable = x01Var2.d;
                                if (runnable != null) {
                                    x01Var2.e = true;
                                    x01Var2.d = null;
                                    x01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                x01Var.a = v01Var2;
                v01Var2.a = EmuDetector.with(x01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        w01 w01Var = (w01) arrayList.get(i14);
                        Bitmap bitmap = w01Var.e;
                        if (bitmap != null) {
                            x01Var.a.c(w01Var.f, bitmap, w01Var.c, w01Var.d);
                        } else {
                            ArrayList arrayList2 = w01Var.b;
                            if (arrayList2 != null) {
                                x01Var.a.f(arrayList2, w01Var.d);
                            } else {
                                x01Var.a.e(w01Var.a, w01Var.g, w01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(x01Var.b);
                    break;
                }
                break;
            case 3:
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
                w50 w50Var = (w50) this.b;
                Camera2Session[] camera2SessionArr = w50Var.q0;
                n50 n50Var = w50Var.h0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    w50Var.h0 = null;
                }
                if (!w50Var.n0) {
                    if (w50Var.o0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(w50Var.o0, null, null);
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
            case 1:
                ((eg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                x01 x01Var = (x01) this.b;
                v01 v01Var = x01Var.a;
                if (v01Var != null) {
                    v01Var.i();
                    x01Var.a = null;
                }
                Runnable runnable = x01Var.d;
                if (runnable == null) {
                    return false;
                }
                x01Var.d = null;
                x01.b(runnable);
                return false;
            case 3:
                c91 c91Var = (c91) this.b;
                TextureView textureView = c91Var.d;
                if (!c91Var.S) {
                    return true;
                }
                if (c91Var.W) {
                    c91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                c91Var.S = false;
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
                n50 n50Var = ((w50) this.b).h0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                v01 v01Var = ((x01) this.b).a;
                if (v01Var == null || (handler = v01Var.getHandler()) == null || !v01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
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
            case 3:
                c91 c91Var = (c91) this.b;
                if (c91Var.r == 1) {
                    c91Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    c91Var.n.invalidate();
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
