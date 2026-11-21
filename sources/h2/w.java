package h2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import fi.l4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j4;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class w implements g61 {
    public static w f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w(com.google.android.gms.common.api.internal.p pVar, com.google.android.gms.common.api.internal.o oVar, n6.c[] cVarArr, boolean z10, int i7) {
        this.e = pVar;
        this.c = oVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i7;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f == null) {
                    f = new w(context);
                }
                wVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i7;
        synchronized (this.e) {
            i7 = this.b;
        }
        return i7;
    }

    public void c(int i7) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.a && this.b == i7) {
                    return;
                }
                this.a = true;
                this.b = i7;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.b.execute(new f2.a(vVar2, 28));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(i61 i61Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        int i10 = this.b;
        MediaController mediaController = (MediaController) this.e;
        if (i10 != mediaController.n0) {
            return;
        }
        MediaController.f(mediaController, (fj) this.c, (int[]) this.d, this.a, z10, i7);
    }

    @Override // org.telegram.ui.Components.g61
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.e;
        if (mediaController.F0 != null) {
            int i7 = mediaController.J0;
            if (i7 == 2) {
                j4 j4Var = mediaController.M0;
                if (j4Var != null) {
                    if (mediaController.N0) {
                        j4Var.setDrawingReady(true);
                    }
                    if (mediaController.M0.getParent() == null) {
                        mediaController.O0.addView(mediaController.M0);
                    }
                    if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.H0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.F0.A0(mediaController.H0);
                }
                mediaController.J0 = 0;
                return true;
            }
            if (i7 == 1) {
                if (mediaController.K0 != null) {
                    if (mediaController.I0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.I0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.K0, new org.telegram.messenger.a(this, 17));
                        } catch (Exception unused) {
                            mediaController.I0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.I0.c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.A0(mediaController.I0.c);
                    }
                }
                mediaController.J0 = 0;
                return true;
            }
            if (PhotoViewer.A1() && PhotoViewer.p1().S2 != null) {
                PhotoViewer.p1().T2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        MediaController mediaController = (MediaController) this.e;
        float f11 = i10 == 0 ? 1.0f : (i7 * f10) / i10;
        mediaController.P0 = f11;
        j4 j4Var = mediaController.M0;
        if (j4Var != null) {
            j4Var.a(f11, 0);
        }
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.e;
        j4 j4Var = mediaController.M0;
        if (j4Var != null && !j4Var.d) {
            mediaController.N0 = true;
            j4Var.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 == null || !d1.f.u()) {
            return;
        }
        mediaController.F0.t0(true);
    }

    public w(Context context) {
        Executor e10 = a.e();
        this.c = e10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        e10.execute(new l4(24, this, context));
    }

    public w(MediaController mediaController, int i7, fj fjVar, int[] iArr, boolean z10) {
        this.e = mediaController;
        this.b = i7;
        this.c = fjVar;
        this.d = iArr;
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
