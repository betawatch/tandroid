package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ey implements org.telegram.ui.Components.w40 {
    public final /* synthetic */ qy a;

    public ey(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        org.telegram.ui.Components.ic icVar = this.a.b4;
        if (icVar != null) {
            ((org.telegram.ui.Components.zb) icVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        qy qyVar = this.a;
        org.telegram.ui.Components.ic icVar = qyVar.b4;
        if (icVar != null) {
            icVar.b();
            qyVar.b4 = null;
        }
        Activity parentActivity = qyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity, f6Var);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(zbVar, parentActivity);
        zbVar.b = ybVar;
        ybVar.setWillNotDraw(false);
        zbVar.addView(ybVar, k7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        zbVar.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ybVar.addView(p9Var, k7.b6.e(28, 28, 17));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, false, false, false);
        zbVar.d = k6Var;
        k6Var.setTypeface(Typeface.SANS_SERIF);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        zbVar.addView(k6Var, k7.b6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        zbVar.setTextColor(zbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        zbVar.setBackground(zbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z4) {
            p9Var.setImageBitmap(qyVar.Y3.r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.t1().z4.getBitmap());
        }
        Activity parentActivity2 = qyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity2, f6Var2, true);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        gcVar.a = new bj(this, 25);
        zbVar.setButton(gcVar);
        zbVar.getButton().setVisibility(8);
        k6Var.c(LocaleController.getString(z10 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.ic b10 = org.telegram.ui.Components.qc.a0(qyVar).b(zbVar, -1);
        qyVar.b4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.ic icVar2 = qyVar.b4;
        icVar2.s = true;
        icVar2.j();
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dy
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ey eyVar = ey.this;
                qy qyVar = eyVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    qyVar.Z3 = photoSize2.location;
                    qyVar.a4 = photoSize.location;
                } else {
                    if (qyVar.Z3 == null) {
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
                    qyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new lh.k7(eyVar, str, z4, 3));
                }
                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w40
    public final qu0 getCloseIntoObject() {
        qy qyVar = this.a;
        org.telegram.ui.Components.ic icVar = qyVar.b4;
        if (icVar == null) {
            return null;
        }
        org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) icVar.e;
        qu0 qu0Var = new qu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.p9 p9Var = zbVar.c;
        org.telegram.ui.Components.p9 p9Var2 = zbVar.c;
        p9Var.getLocationInWindow(iArr);
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = qyVar.fragmentView;
        ImageReceiver imageReceiver = p9Var2.getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.i = 0;
        qu0Var.h = qu0Var.a.getRoundRadius();
        qu0Var.k = p9Var2.getScaleX();
        return qu0Var;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final boolean u() {
        return true;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ void P() {
    }
}
