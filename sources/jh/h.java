package jh;

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
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.z01;
import org.telegram.ui.Components.z50;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.w01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.w01] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                if (jVar.f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f = iVar;
                    iVar.start();
                    break;
                }
                break;
            case 1:
                z50 z50Var = (z50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (z50Var.e0 == null && surfaceTexture != null && !z50Var.d0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    z50Var.e0 = new r50(z50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 3:
                final b11 b11Var = (b11) this.b;
                ArrayList arrayList = b11Var.c;
                z01 z01Var = b11Var.a;
                if (z01Var != null) {
                    z01Var.i();
                    b11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.w01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                b11Var.invalidate();
                                break;
                            default:
                                b11 b11Var2 = b11Var;
                                Runnable runnable = b11Var2.d;
                                if (runnable != null) {
                                    b11Var2.e = true;
                                    b11Var2.d = null;
                                    b11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                z01 z01Var2 = new z01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.w01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                b11Var.invalidate();
                                break;
                            default:
                                b11 b11Var2 = b11Var;
                                Runnable runnable = b11Var2.d;
                                if (runnable != null) {
                                    b11Var2.e = true;
                                    b11Var2.d = null;
                                    b11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                b11Var.a = z01Var2;
                z01Var2.a = EmuDetector.with(b11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        a11 a11Var = (a11) arrayList.get(i14);
                        Bitmap bitmap = a11Var.e;
                        if (bitmap != null) {
                            b11Var.a.c(a11Var.f, bitmap, a11Var.c, a11Var.d);
                        } else {
                            ArrayList arrayList2 = a11Var.b;
                            if (arrayList2 != null) {
                                b11Var.a.f(arrayList2, a11Var.d);
                            } else {
                                b11Var.a.e(a11Var.a, a11Var.g, a11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(b11Var.b);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                i iVar = ((j) this.b).f;
                if (iVar != null) {
                    iVar.a = false;
                    ((j) this.b).f = null;
                    break;
                }
                break;
            case 1:
                z50 z50Var = (z50) this.b;
                Camera2Session[] camera2SessionArr = z50Var.n0;
                r50 r50Var = z50Var.e0;
                if (r50Var != null) {
                    r50Var.b(0L, 0, true, 0, 0);
                    z50Var.e0 = null;
                }
                if (z50Var.k0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (z50Var.l0 != null) {
                    CameraController.getInstance().close(z50Var.l0, null, null);
                    break;
                }
                break;
            case 2:
                ((ng0) this.b).S.t3.setSurfaceTexture(surfaceTexture);
                break;
            case 3:
                b11 b11Var = (b11) this.b;
                z01 z01Var = b11Var.a;
                if (z01Var != null) {
                    z01Var.i();
                    b11Var.a = null;
                }
                Runnable runnable = b11Var.d;
                if (runnable != null) {
                    b11Var.d = null;
                    b11.b(runnable);
                    break;
                }
                break;
            default:
                f91 f91Var = (f91) this.b;
                TextureView textureView = f91Var.d;
                if (f91Var.P) {
                    if (f91Var.T) {
                        f91Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    f91Var.P = false;
                    break;
                }
                break;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                i iVar = ((j) this.b).f;
                if (iVar != null) {
                    synchronized (iVar.e) {
                        iVar.f = true;
                        iVar.h = i10;
                        iVar.n = i11;
                    }
                    return;
                }
                return;
            case 1:
                r50 r50Var = ((z50) this.b).e0;
                if (r50Var != null) {
                    r50Var.C = i10;
                    r50Var.D = i11;
                    r50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                z01 z01Var = ((b11) this.b).a;
                if (z01Var == null || (handler = z01Var.getHandler()) == null || !z01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            default:
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                f91 f91Var = (f91) this.b;
                if (f91Var.r == 1) {
                    f91Var.n.getViewTreeObserver().addOnPreDrawListener(new ba(this, 4));
                    f91Var.n.invalidate();
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
