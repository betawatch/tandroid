package ih;

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
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.v01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.v01] */
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
                x50 x50Var = (x50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (x50Var.e0 == null && surfaceTexture != null && !x50Var.d0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    x50Var.e0 = new p50(x50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 3:
                final a11 a11Var = (a11) this.b;
                ArrayList arrayList = a11Var.c;
                y01 y01Var = a11Var.a;
                if (y01Var != null) {
                    y01Var.i();
                    a11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.v01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                a11Var.invalidate();
                                break;
                            default:
                                a11 a11Var2 = a11Var;
                                Runnable runnable = a11Var2.d;
                                if (runnable != null) {
                                    a11Var2.e = true;
                                    a11Var2.d = null;
                                    a11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                y01 y01Var2 = new y01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.v01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                a11Var.invalidate();
                                break;
                            default:
                                a11 a11Var2 = a11Var;
                                Runnable runnable = a11Var2.d;
                                if (runnable != null) {
                                    a11Var2.e = true;
                                    a11Var2.d = null;
                                    a11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                a11Var.a = y01Var2;
                y01Var2.a = EmuDetector.with(a11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        z01 z01Var = (z01) arrayList.get(i14);
                        Bitmap bitmap = z01Var.e;
                        if (bitmap != null) {
                            a11Var.a.c(z01Var.f, bitmap, z01Var.c, z01Var.d);
                        } else {
                            ArrayList arrayList2 = z01Var.b;
                            if (arrayList2 != null) {
                                a11Var.a.f(arrayList2, z01Var.d);
                            } else {
                                a11Var.a.e(z01Var.a, z01Var.g, z01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(a11Var.b);
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
                x50 x50Var = (x50) this.b;
                Camera2Session[] camera2SessionArr = x50Var.n0;
                p50 p50Var = x50Var.e0;
                if (p50Var != null) {
                    p50Var.b(0L, 0, true, 0, 0);
                    x50Var.e0 = null;
                }
                if (x50Var.k0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (x50Var.l0 != null) {
                    CameraController.getInstance().close(x50Var.l0, null, null);
                    break;
                }
                break;
            case 2:
                ((lg0) this.b).S.t3.setSurfaceTexture(surfaceTexture);
                break;
            case 3:
                a11 a11Var = (a11) this.b;
                y01 y01Var = a11Var.a;
                if (y01Var != null) {
                    y01Var.i();
                    a11Var.a = null;
                }
                Runnable runnable = a11Var.d;
                if (runnable != null) {
                    a11Var.d = null;
                    a11.b(runnable);
                    break;
                }
                break;
            default:
                e91 e91Var = (e91) this.b;
                TextureView textureView = e91Var.d;
                if (e91Var.P) {
                    if (e91Var.T) {
                        e91Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    e91Var.P = false;
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
                p50 p50Var = ((x50) this.b).e0;
                if (p50Var != null) {
                    p50Var.C = i10;
                    p50Var.D = i11;
                    p50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                y01 y01Var = ((a11) this.b).a;
                if (y01Var == null || (handler = y01Var.getHandler()) == null || !y01Var.b.get()) {
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
                e91 e91Var = (e91) this.b;
                if (e91Var.r == 1) {
                    e91Var.n.getViewTreeObserver().addOnPreDrawListener(new ba(this, 4));
                    e91Var.n.invalidate();
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
