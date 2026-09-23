package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fy implements org.telegram.ui.Components.u40 {
    public final /* synthetic */ ry a;

    public fy(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        org.telegram.ui.Components.qc qcVar = this.a.d4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        ry ryVar = this.a;
        org.telegram.ui.Components.qc qcVar = ryVar.d4;
        if (qcVar != null) {
            qcVar.b();
            ryVar.d4 = null;
        }
        Activity parentActivity = ryVar.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
        org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(parentActivity, d6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(hcVar, parentActivity);
        hcVar.b = gcVar;
        gcVar.setWillNotDraw(false);
        hcVar.addView(gcVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        hcVar.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(w9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(parentActivity, false, false, false);
        hcVar.d = p6Var;
        p6Var.setTypeface(Typeface.SANS_SERIF);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        hcVar.addView(p6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        hcVar.setTextColor(hcVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        hcVar.setBackground(hcVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        if (z10) {
            w9Var.setImageBitmap(ryVar.a4.r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = ryVar.getParentActivity();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, d6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.a = new aj(this, 25);
        hcVar.setButton(ocVar);
        hcVar.getButton().setVisibility(8);
        p6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(ryVar).b(hcVar, -1);
        ryVar.d4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = ryVar.d4;
        qcVar2.s = true;
        qcVar2.j();
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ey
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                fy fyVar = fy.this;
                ry ryVar = fyVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ryVar.b4 = photoSize2.location;
                    ryVar.c4 = photoSize.location;
                } else {
                    if (ryVar.b4 == null) {
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
                    ryVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(fyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.u40
    public final wu0 getCloseIntoObject() {
        ry ryVar = this.a;
        org.telegram.ui.Components.qc qcVar = ryVar.d4;
        if (qcVar == null) {
            return null;
        }
        org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
        wu0 wu0Var = new wu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.w9 w9Var = hcVar.c;
        org.telegram.ui.Components.w9 w9Var2 = hcVar.c;
        w9Var.getLocationInWindow(iArr);
        wu0Var.b = iArr[0];
        wu0Var.c = iArr[1];
        wu0Var.d = ryVar.fragmentView;
        ImageReceiver imageReceiver = w9Var2.getImageReceiver();
        wu0Var.a = imageReceiver;
        wu0Var.e = imageReceiver.getBitmapSafe();
        wu0Var.i = 0;
        wu0Var.h = wu0Var.a.getRoundRadius();
        wu0Var.k = w9Var2.getScaleX();
        return wu0Var;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }
}
