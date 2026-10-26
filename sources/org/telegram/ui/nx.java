package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nx implements org.telegram.ui.Components.f50 {
    public final /* synthetic */ cy a;

    public nx(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        org.telegram.ui.Components.qc qcVar = this.a.e4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        cy cyVar = this.a;
        org.telegram.ui.Components.qc qcVar = cyVar.e4;
        if (qcVar != null) {
            qcVar.b();
            cyVar.e4 = null;
        }
        Activity parentActivity = cyVar.getParentActivity();
        u6Var = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
        org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(parentActivity, u6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(hcVar, parentActivity);
        hcVar.b = gcVar;
        gcVar.setWillNotDraw(false);
        hcVar.addView(gcVar, org.telegram.ui.Components.gb1.m(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
        hcVar.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(y9Var, org.telegram.ui.Components.gb1.i(28, 28, 17));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, false, false, false);
        hcVar.d = s6Var;
        s6Var.setTypeface(Typeface.SANS_SERIF);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        hcVar.addView(s6Var, org.telegram.ui.Components.gb1.m(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        hcVar.setTextColor(hcVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        hcVar.setBackground(hcVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        if (z10) {
            y9Var.setImageBitmap(cyVar.b4.r);
        } else {
            y9Var.setImageBitmap(PhotoViewer.u1().C4.getBitmap());
        }
        Activity parentActivity2 = cyVar.getParentActivity();
        u6Var2 = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, u6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.b = new ui(this, 23);
        hcVar.setButton(ocVar);
        hcVar.getButton().setVisibility(8);
        s6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(cyVar).b(hcVar, -1);
        cyVar.e4 = b10;
        b10.s = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = cyVar.e4;
        qcVar2.t = true;
        qcVar2.j();
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mx
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                nx nxVar = nx.this;
                cy cyVar = nxVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    cyVar.c4 = photoSize2.location;
                    cyVar.d4 = photoSize.location;
                } else {
                    if (cyVar.c4 == null) {
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
                    cyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.r9(nxVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                kVar.l().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final qu0 getCloseIntoObject() {
        cy cyVar = this.a;
        org.telegram.ui.Components.qc qcVar = cyVar.e4;
        if (qcVar == null) {
            return null;
        }
        org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
        qu0 qu0Var = new qu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.y9 y9Var = hcVar.c;
        org.telegram.ui.Components.y9 y9Var2 = hcVar.c;
        y9Var.getLocationInWindow(iArr);
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = cyVar.fragmentView;
        ImageReceiver imageReceiver = y9Var2.getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.i = 0;
        qu0Var.h = qu0Var.a.getRoundRadius();
        qu0Var.k = y9Var2.getScaleX();
        return qu0Var;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final boolean u() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }
}
