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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ns0 implements org.telegram.ui.Components.h61 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public ns0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.h61
    public final void onError(org.telegram.ui.Components.k61 k61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.B2 != k61Var) {
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
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new dl0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.h61
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
            if (k61Var == null || !k61Var.R) {
                AndroidUtilities.runOnUIThread(new ms0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final void onStateChanged(boolean z10, int i9) {
        org.telegram.ui.Components.k61 k61Var;
        int i10;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.c7;
        org.telegram.ui.Components.k61 k61Var2 = photoViewer.B2;
        if (k61Var2 != null) {
            k61Var2.P(d1.f.t() || photoViewer.r);
        }
        if (this.a && (k61Var = photoViewer.B2) != null && k61Var.q() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.M4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.B2.L((long) (videoEditedInfo.start * r3.q()));
                        vr0 vr0Var = photoViewer.N7;
                        if (vr0Var != null) {
                            vr0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i9, z10);
    }

    @Override // org.telegram.ui.Components.h61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        xe.d p6 = org.telegram.ui.Components.pf0.p();
        PhotoViewer photoViewer = this.b;
        if (p6 != null && org.telegram.ui.Components.pf0.p().b.a != 0 && (textureView = photoViewer.s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.l0;
            (pf0Var != null ? pf0Var.h0 : null).setSurfaceTexture(surfaceTexture);
            (pf0Var != null ? pf0Var.h0 : null).setVisibility(0);
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

    @Override // org.telegram.ui.Components.h61
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.b.w0(false);
        AndroidUtilities.runOnUIThread(new ms0(this, 0));
    }

    @Override // org.telegram.ui.Components.h61
    public final void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.u2 != null) {
            if (i11 == 90 || i11 == 270) {
                i10 = i9;
                i9 = i10;
            }
            float f11 = i9 * f10;
            int i12 = (int) f11;
            photoViewer.Q = i12;
            float f12 = i10;
            int i13 = (int) (f10 * f12);
            photoViewer.R = i13;
            xe.d dVar = photoViewer.C2;
            if (dVar != null) {
                dVar.d(i12, i13);
            }
            photoViewer.u2.a(i10 == 0 ? 1.0f : f11 / f12, i11);
            if (photoViewer.x2 instanceof org.telegram.ui.Components.y51) {
                ((org.telegram.ui.Components.y51) photoViewer.x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) photoViewer.x2;
                y51Var.d = i12;
                y51Var.e = i10;
                org.telegram.ui.Components.hz hzVar = y51Var.b;
                if (hzVar != null) {
                    hzVar.postRunnable(new org.telegram.ui.Components.dz(hzVar, i12, i10, 0));
                }
                if (photoViewer.Y1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.E3 = true;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final void onRenderedFirstFrame(i3.a aVar) {
        PhotoViewer photoViewer = this.b;
        af.f fVar = photoViewer.L8;
        if (fVar != null) {
            fVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.U(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
            if (k61Var == null || !k61Var.R) {
                AndroidUtilities.runOnUIThread(new ms0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public final /* synthetic */ void onSeekStarted(i3.a aVar) {
    }
}
