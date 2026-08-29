package gh;

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
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.s81;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.k01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.k01] */
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
                s50 s50Var = (s50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (s50Var.d0 == null && surfaceTexture != null && !s50Var.c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    s50Var.d0 = new k50(s50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 3:
                final p01 p01Var = (p01) this.b;
                ArrayList arrayList = p01Var.c;
                n01 n01Var = p01Var.a;
                if (n01Var != null) {
                    n01Var.i();
                    p01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.k01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                p01Var.invalidate();
                                break;
                            default:
                                p01 p01Var2 = p01Var;
                                Runnable runnable = p01Var2.d;
                                if (runnable != null) {
                                    p01Var2.e = true;
                                    p01Var2.d = null;
                                    p01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                n01 n01Var2 = new n01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.k01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                p01Var.invalidate();
                                break;
                            default:
                                p01 p01Var2 = p01Var;
                                Runnable runnable = p01Var2.d;
                                if (runnable != null) {
                                    p01Var2.e = true;
                                    p01Var2.d = null;
                                    p01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                p01Var.a = n01Var2;
                n01Var2.a = EmuDetector.with(p01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        o01 o01Var = (o01) arrayList.get(i14);
                        Bitmap bitmap = o01Var.e;
                        if (bitmap != null) {
                            p01Var.a.c(o01Var.f, bitmap, o01Var.c, o01Var.d);
                        } else {
                            ArrayList arrayList2 = o01Var.b;
                            if (arrayList2 != null) {
                                p01Var.a.f(arrayList2, o01Var.d);
                            } else {
                                p01Var.a.e(o01Var.a, o01Var.g, o01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(p01Var.b);
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
                s50 s50Var = (s50) this.b;
                Camera2Session[] camera2SessionArr = s50Var.m0;
                k50 k50Var = s50Var.d0;
                if (k50Var != null) {
                    k50Var.b(0L, 0, true, 0, 0);
                    s50Var.d0 = null;
                }
                if (s50Var.j0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (s50Var.k0 != null) {
                    CameraController.getInstance().close(s50Var.k0, null, null);
                    break;
                }
                break;
            case 2:
                ((bg0) this.b).R.s3.setSurfaceTexture(surfaceTexture);
                break;
            case 3:
                p01 p01Var = (p01) this.b;
                n01 n01Var = p01Var.a;
                if (n01Var != null) {
                    n01Var.i();
                    p01Var.a = null;
                }
                Runnable runnable = p01Var.d;
                if (runnable != null) {
                    p01Var.d = null;
                    p01.b(runnable);
                    break;
                }
                break;
            default:
                s81 s81Var = (s81) this.b;
                TextureView textureView = s81Var.d;
                if (s81Var.O) {
                    if (s81Var.S) {
                        s81Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    s81Var.O = false;
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
                k50 k50Var = ((s50) this.b).d0;
                if (k50Var != null) {
                    k50Var.B = i10;
                    k50Var.C = i11;
                    k50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                n01 n01Var = ((p01) this.b).a;
                if (n01Var == null || (handler = n01Var.getHandler()) == null || !n01Var.b.get()) {
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
                s81 s81Var = (s81) this.b;
                if (s81Var.r == 1) {
                    s81Var.n.getViewTreeObserver().addOnPreDrawListener(new z9(this, 4));
                    s81Var.n.invalidate();
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
