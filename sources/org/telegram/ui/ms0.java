package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ms0 implements org.telegram.ui.Components.u61 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public ms0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.u61
    public final void onError(org.telegram.ui.Components.x61 x61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.B2 != x61Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.k0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.y, 0, photoViewer.r2);
        alertDialog$Builder.a.N = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new zk0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.u61
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
            if (x61Var == null || !x61Var.R) {
                AndroidUtilities.runOnUIThread(new ls0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.x61 x61Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.c7;
        org.telegram.ui.Components.x61 x61Var2 = photoViewer.B2;
        if (x61Var2 != null) {
            x61Var2.P(d1.f.u() || photoViewer.r);
        }
        if (this.a && (x61Var = photoViewer.B2) != null && x61Var.q() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.M4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.B2.L((long) (videoEditedInfo.start * r3.q()));
                        ur0 ur0Var = photoViewer.N7;
                        if (ur0Var != null) {
                            ur0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z10);
    }

    @Override // org.telegram.ui.Components.u61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        af.g p10 = org.telegram.ui.Components.bg0.p();
        PhotoViewer photoViewer = this.b;
        if (p10 != null && org.telegram.ui.Components.bg0.p().b.a != 0 && (textureView = photoViewer.s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.l0;
            (bg0Var != null ? bg0Var.h0 : null).setSurfaceTexture(surfaceTexture);
            (bg0Var != null ? bg0Var.h0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.B3) {
            photoViewer.B3 = false;
            if (photoViewer.F3) {
                photoViewer.C3 = 1;
                photoViewer.s3.setSurfaceTexture(surfaceTexture);
                photoViewer.s3.setSurfaceTextureListener(photoViewer.f4);
                photoViewer.s3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.u61
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.b.x0(false);
        AndroidUtilities.runOnUIThread(new ls0(this, 0));
    }

    @Override // org.telegram.ui.Components.u61
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.u2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f10 = i10 * f9;
            int i13 = (int) f10;
            photoViewer.Q = i13;
            float f11 = i11;
            int i14 = (int) (f9 * f11);
            photoViewer.R = i14;
            af.g gVar = photoViewer.C2;
            if (gVar != null) {
                gVar.d(i13, i14);
            }
            photoViewer.u2.a(i11 == 0 ? 1.0f : f10 / f11, i12);
            if (photoViewer.x2 instanceof org.telegram.ui.Components.l61) {
                ((org.telegram.ui.Components.l61) photoViewer.x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) photoViewer.x2;
                l61Var.d = i13;
                l61Var.e = i11;
                org.telegram.ui.Components.qz qzVar = l61Var.b;
                if (qzVar != null) {
                    qzVar.postRunnable(new org.telegram.ui.Components.mz(qzVar, i13, i11, 0));
                }
                if (photoViewer.Y1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.E3 = true;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final void onRenderedFirstFrame(k3.a aVar) {
        PhotoViewer photoViewer = this.b;
        c2.p pVar = photoViewer.L8;
        if (pVar != null) {
            pVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
            if (x61Var == null || !x61Var.R) {
                AndroidUtilities.runOnUIThread(new ls0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public final /* synthetic */ void onSeekStarted(k3.a aVar) {
    }
}
