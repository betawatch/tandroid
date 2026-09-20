package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class iy implements org.telegram.ui.Components.t40 {
    public final /* synthetic */ uy a;

    public iy(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.t40
    public final void B(float f7) {
        org.telegram.ui.Components.pc pcVar = this.a.d4;
        if (pcVar != null) {
            ((org.telegram.ui.Components.gc) pcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        uy uyVar = this.a;
        org.telegram.ui.Components.pc pcVar = uyVar.d4;
        if (pcVar != null) {
            pcVar.b();
            uyVar.d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity, f6Var);
        org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(gcVar, parentActivity);
        gcVar.b = fcVar;
        fcVar.setWillNotDraw(false);
        gcVar.addView(fcVar, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(parentActivity);
        gcVar.c = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        fcVar.addView(v9Var, w7.y5.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        gcVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        gcVar.addView(o6Var, w7.y5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        gcVar.setTextColor(gcVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        gcVar.setBackground(gcVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            v9Var.setImageBitmap(uyVar.a4.r);
        } else {
            v9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(parentActivity2, f6Var2, true);
        ncVar.e(LocaleController.getString(R.string.ViewAction));
        ncVar.a = new cj(this, 25);
        gcVar.setButton(ncVar);
        gcVar.getButton().setVisibility(8);
        o6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.pc b10 = org.telegram.ui.Components.xc.a0(uyVar).b(gcVar, -1);
        uyVar.d4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.pc pcVar2 = uyVar.d4;
        pcVar2.s = true;
        pcVar2.j();
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hy
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                iy iyVar = iy.this;
                uy uyVar = iyVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.b4 = photoSize2.location;
                    uyVar.c4 = photoSize.location;
                } else {
                    if (uyVar.b4 == null) {
                        return;
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    uyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(iyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final dv0 getCloseIntoObject() {
        uy uyVar = this.a;
        org.telegram.ui.Components.pc pcVar = uyVar.d4;
        if (pcVar == null) {
            return null;
        }
        org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) pcVar.e;
        dv0 dv0Var = new dv0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.v9 v9Var = gcVar.c;
        org.telegram.ui.Components.v9 v9Var2 = gcVar.c;
        v9Var.getLocationInWindow(iArr);
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = uyVar.fragmentView;
        ImageReceiver imageReceiver = v9Var2.getImageReceiver();
        dv0Var.a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.i = 0;
        dv0Var.h = dv0Var.a.getRoundRadius();
        dv0Var.k = v9Var2.getScaleX();
        return dv0Var;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }
}
