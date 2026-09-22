package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class iy implements org.telegram.ui.Components.t40 {
    public final /* synthetic */ uy a;

    public iy(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.t40
    public final void B(float f7) {
        org.telegram.ui.Components.oc ocVar = this.a.d4;
        if (ocVar != null) {
            ((org.telegram.ui.Components.fc) ocVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        uy uyVar = this.a;
        org.telegram.ui.Components.oc ocVar = uyVar.d4;
        if (ocVar != null) {
            ocVar.b();
            uyVar.d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(parentActivity, e6Var);
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(fcVar, parentActivity);
        fcVar.b = ecVar;
        ecVar.setWillNotDraw(false);
        fcVar.addView(ecVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity);
        fcVar.c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ecVar.addView(u9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, false, false, false);
        fcVar.d = n6Var;
        n6Var.setTypeface(Typeface.SANS_SERIF);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        fcVar.addView(n6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        fcVar.setTextColor(fcVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        fcVar.setBackground(fcVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        if (z10) {
            u9Var.setImageBitmap(uyVar.a4.r);
        } else {
            u9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(parentActivity2, e6Var2, true);
        mcVar.e(LocaleController.getString(R.string.ViewAction));
        mcVar.a = new dj(this, 25);
        fcVar.setButton(mcVar);
        fcVar.getButton().setVisibility(8);
        n6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(uyVar).b(fcVar, -1);
        uyVar.d4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.oc ocVar2 = uyVar.d4;
        ocVar2.s = true;
        ocVar2.j();
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
        org.telegram.ui.Components.oc ocVar = uyVar.d4;
        if (ocVar == null) {
            return null;
        }
        org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) ocVar.e;
        dv0 dv0Var = new dv0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.u9 u9Var = fcVar.c;
        org.telegram.ui.Components.u9 u9Var2 = fcVar.c;
        u9Var.getLocationInWindow(iArr);
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = uyVar.fragmentView;
        ImageReceiver imageReceiver = u9Var2.getImageReceiver();
        dv0Var.a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.i = 0;
        dv0Var.h = dv0Var.a.getRoundRadius();
        dv0Var.k = u9Var2.getScaleX();
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
