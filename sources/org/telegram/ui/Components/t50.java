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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.e11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.e11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                f60 f60Var = (f60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.h0 == null && surfaceTexture != null && !f60Var.g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f60Var.h0 = new x50(f60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
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
            case 3:
                break;
            default:
                uh.g gVar = (uh.g) this.b;
                if (gVar.f == null) {
                    uh.f fVar = new uh.f(gVar, surfaceTexture, i10, i11, new uh.d(gVar, 1));
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
                f60 f60Var = (f60) this.b;
                Camera2Session[] camera2SessionArr = f60Var.q0;
                x50 x50Var = f60Var.h0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    f60Var.h0 = null;
                }
                if (!f60Var.n0) {
                    if (f60Var.o0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(f60Var.o0, null, null);
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
                ((og0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
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
            case 3:
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
                uh.f fVar = ((uh.g) this.b).f;
                if (fVar == null) {
                    return true;
                }
                fVar.a = false;
                ((uh.g) this.b).f = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                x50 x50Var = ((f60) this.b).h0;
                if (x50Var != null) {
                    x50Var.F = i10;
                    x50Var.G = i11;
                    x50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                i11 i11Var = ((k11) this.b).a;
                if (i11Var == null || (handler = i11Var.getHandler()) == null || !i11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            default:
                uh.f fVar = ((uh.g) this.b).f;
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
                o91 o91Var = (o91) this.b;
                if (o91Var.r == 1) {
                    o91Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
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
