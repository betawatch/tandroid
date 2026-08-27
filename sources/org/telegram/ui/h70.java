package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ h70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                l70 l70Var = (l70) this.b;
                if (l70Var.E == null && surfaceTexture != null) {
                    l70Var.E = new k70(l70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    l70Var.E.postRunnable(new r00(this, 11));
                    k70 k70Var = l70Var.E;
                    k70Var.postRunnable(k70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                l70 l70Var = (l70) this.b;
                k70 k70Var = l70Var.E;
                if (k70Var == null) {
                    return true;
                }
                k70Var.postRunnable(new r00(k70Var, 13));
                l70Var.E = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.x2 != null) {
                    org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.l0;
                    if (sf0Var.L && org.telegram.ui.Components.sf0.p() != null && org.telegram.ui.Components.sf0.p().b.a != 0) {
                        (sf0Var != null ? sf0Var.h0 : null).setSurfaceTexture(surfaceTexture);
                        (sf0Var != null ? sf0Var.h0 : null).setVisibility(0);
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
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((l70) this.b).E != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
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
                    photoViewer.x0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
