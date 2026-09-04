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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pt0 implements org.telegram.ui.Components.d71 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public pt0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.d71
    public final void onError(org.telegram.ui.Components.g71 g71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.F2 != g71Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.o0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.y, 0, photoViewer.v2);
        alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new vl0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.d71
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
                AndroidUtilities.runOnUIThread(new ot0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.g71 g71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.g7;
        org.telegram.ui.Components.g71 g71Var2 = photoViewer.F2;
        if (g71Var2 != null) {
            g71Var2.O(b5.d.u() || photoViewer.r);
        }
        if (this.a && (g71Var = photoViewer.F2) != null && g71Var.p() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K((long) (videoEditedInfo.start * r3.p()));
                        xs0 xs0Var = photoViewer.R7;
                        if (xs0Var != null) {
                            xs0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z10);
    }

    @Override // org.telegram.ui.Components.d71
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        qf.e p5 = org.telegram.ui.Components.eg0.p();
        PhotoViewer photoViewer = this.b;
        if (p5 != null && org.telegram.ui.Components.eg0.p().b.a != 0 && (textureView = photoViewer.w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.p0;
            (eg0Var != null ? eg0Var.l0 : null).setSurfaceTexture(surfaceTexture);
            (eg0Var != null ? eg0Var.l0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.w3.setSurfaceTexture(surfaceTexture);
                photoViewer.w3.setSurfaceTextureListener(photoViewer.j4);
                photoViewer.w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.b.x0(false);
        AndroidUtilities.runOnUIThread(new ot0(this, 0));
    }

    @Override // org.telegram.ui.Components.d71
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.y2 != null) {
            float f10 = i10 * f7;
            int i13 = (int) f10;
            photoViewer.U = i13;
            float f11 = i11;
            int i14 = (int) (f7 * f11);
            photoViewer.V = i14;
            qf.e eVar = photoViewer.G2;
            if (eVar != null) {
                eVar.d(i13, i14);
            }
            photoViewer.y2.a(i11 == 0 ? 1.0f : f10 / f11, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.u61) {
                ((org.telegram.ui.Components.u61) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) photoViewer.B2;
                u61Var.d = i13;
                u61Var.e = i11;
                org.telegram.ui.Components.vz vzVar = u61Var.b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.P8;
        if (pVar != null) {
            pVar.run();
            photoViewer.P8 = null;
        }
        long j3 = aVar.e;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
                AndroidUtilities.runOnUIThread(new ot0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public final /* synthetic */ void onSeekStarted(j2.a aVar) {
    }
}
