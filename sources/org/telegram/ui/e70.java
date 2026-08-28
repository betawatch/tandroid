package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ e70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.a) {
            case 0:
                i70 i70Var = (i70) this.b;
                if (i70Var.E == null && surfaceTexture != null) {
                    i70Var.E = new g70(i70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i9, i10, Math.min(i9 / 150.0f, i10 / 150.0f), 0);
                    i70Var.E.postRunnable(new o00(this, 11));
                    g70 g70Var = i70Var.E;
                    g70Var.postRunnable(g70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                i70 i70Var = (i70) this.b;
                g70 g70Var = i70Var.E;
                if (g70Var == null) {
                    return true;
                }
                g70Var.postRunnable(new o00(g70Var, 13));
                i70Var.E = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.x2 != null) {
                    org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.l0;
                    if (pf0Var.L && org.telegram.ui.Components.pf0.p() != null && org.telegram.ui.Components.pf0.p().b.a != 0) {
                        (pf0Var != null ? pf0Var.h0 : null).setSurfaceTexture(surfaceTexture);
                        (pf0Var != null ? pf0Var.h0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.B3) {
                        if (photoViewer.H3) {
                            photoViewer.C3 = 2;
                        }
                        photoViewer.x2.setSurfaceTexture(surfaceTexture);
                        photoViewer.x2.setVisibility(0);
                        photoViewer.B3 = false;
                        photoViewer.a0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.a) {
            case 0:
                if (((i70) this.b).E != null) {
                    Intro.onSurfaceChanged(i9, i10, Math.min(i9 / 150.0f, i10 / 150.0f), 0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.C3 == 1) {
                    photoViewer.w0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i9, int i10) {
    }
}
