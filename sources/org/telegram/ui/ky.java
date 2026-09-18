package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ky implements org.telegram.ui.Components.t40 {
    public final /* synthetic */ wy a;

    public ky(wy wyVar) {
        this.a = wyVar;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        wy wyVar = this.a;
        org.telegram.ui.Components.oc ocVar = wyVar.d4;
        if (ocVar != null) {
            ocVar.b();
            wyVar.d4 = null;
        }
        Activity parentActivity = wyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.o2) wyVar).resourceProvider;
        org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(parentActivity, f6Var);
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
        fcVar.setTextColor(fcVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        fcVar.setBackground(fcVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            u9Var.setImageBitmap(wyVar.a4.r);
        } else {
            u9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = wyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.o2) wyVar).resourceProvider;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(parentActivity2, f6Var2, true);
        mcVar.e(LocaleController.getString(R.string.ViewAction));
        mcVar.a = new ej(this, 25);
        fcVar.setButton(mcVar);
        fcVar.getButton().setVisibility(8);
        n6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(wyVar).b(fcVar, -1);
        wyVar.d4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.oc ocVar2 = wyVar.d4;
        ocVar2.s = true;
        ocVar2.j();
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jy
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ky kyVar = ky.this;
                wy wyVar = kyVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    wyVar.b4 = photoSize2.location;
                    wyVar.c4 = photoSize.location;
                } else {
                    if (wyVar.b4 == null) {
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
                    wyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(kyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final fv0 getCloseIntoObject() {
        wy wyVar = this.a;
        org.telegram.ui.Components.oc ocVar = wyVar.d4;
        if (ocVar == null) {
            return null;
        }
        org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) ocVar.e;
        fv0 fv0Var = new fv0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.u9 u9Var = fcVar.c;
        org.telegram.ui.Components.u9 u9Var2 = fcVar.c;
        u9Var.getLocationInWindow(iArr);
        fv0Var.b = iArr[0];
        fv0Var.c = iArr[1];
        fv0Var.d = wyVar.fragmentView;
        ImageReceiver imageReceiver = u9Var2.getImageReceiver();
        fv0Var.a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        fv0Var.i = 0;
        fv0Var.h = fv0Var.a.getRoundRadius();
        fv0Var.k = u9Var2.getScaleX();
        return fv0Var;
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
