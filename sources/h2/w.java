package h2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import fi.h9;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j4;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class w implements q51 {
    public static w f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w(bi.a aVar, com.google.android.gms.common.api.internal.o oVar, n6.c[] cVarArr, boolean z9, int i7) {
        this.e = aVar;
        this.c = oVar;
        this.d = cVarArr;
        this.a = z9;
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
                    vVar2.b.execute(new h9(vVar2, 10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(t51 t51Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        int i10 = this.b;
        MediaController mediaController = (MediaController) this.e;
        if (i10 != mediaController.m0) {
            return;
        }
        MediaController.f(mediaController, (ij) this.c, (int[]) this.d, this.a, z9, i7);
    }

    @Override // org.telegram.ui.Components.q51
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.e;
        if (mediaController.E0 != null) {
            int i7 = mediaController.I0;
            if (i7 == 2) {
                j4 j4Var = mediaController.L0;
                if (j4Var != null) {
                    if (mediaController.M0) {
                        j4Var.setDrawingReady(true);
                    }
                    if (mediaController.L0.getParent() == null) {
                        mediaController.N0.addView(mediaController.L0);
                    }
                    if (mediaController.G0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.G0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.E0.A0(mediaController.G0);
                }
                mediaController.I0 = 0;
                return true;
            }
            if (i7 == 1) {
                if (mediaController.J0 != null) {
                    if (mediaController.H0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.H0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.J0, new org.telegram.messenger.a(this, 17));
                        } catch (Exception unused) {
                            mediaController.H0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.E0.A0(mediaController.H0.c);
                    }
                }
                mediaController.I0 = 0;
                return true;
            }
            if (PhotoViewer.A1() && PhotoViewer.p1().R2 != null) {
                PhotoViewer.p1().S2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        MediaController mediaController = (MediaController) this.e;
        float f11 = i10 == 0 ? 1.0f : (i7 * f10) / i10;
        mediaController.O0 = f11;
        j4 j4Var = mediaController.L0;
        if (j4Var != null) {
            j4Var.a(f11, 0);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.e;
        j4 j4Var = mediaController.L0;
        if (j4Var != null && !j4Var.d) {
            mediaController.M0 = true;
            j4Var.setDrawingReady(true);
            mediaController.N0.setTag(1);
        }
        if (mediaController.E0 == null || !d1.f.u()) {
            return;
        }
        mediaController.E0.t0(true);
    }

    public w(Context context) {
        Executor e10 = a.e();
        this.c = e10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        e10.execute(new f2.h(25, context, (Object) this));
    }

    public w(MediaController mediaController, int i7, ij ijVar, int[] iArr, boolean z9) {
        this.e = mediaController;
        this.b = i7;
        this.c = ijVar;
        this.d = iArr;
        this.a = z9;
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
