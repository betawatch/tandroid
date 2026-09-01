package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dy implements org.telegram.ui.Components.x40 {
    public final /* synthetic */ py a;

    public dy(py pyVar) {
        this.a = pyVar;
    }

    @Override // org.telegram.ui.Components.x40
    public final void D(float f10) {
        org.telegram.ui.Components.ic icVar = this.a.b4;
        if (icVar != null) {
            ((org.telegram.ui.Components.zb) icVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.x40
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        py pyVar = this.a;
        org.telegram.ui.Components.ic icVar = pyVar.b4;
        if (icVar != null) {
            icVar.b();
            pyVar.b4 = null;
        }
        Activity parentActivity = pyVar.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity, g6Var);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(zbVar, parentActivity);
        zbVar.b = ybVar;
        ybVar.setWillNotDraw(false);
        zbVar.addView(ybVar, k7.c6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        zbVar.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ybVar.addView(p9Var, k7.c6.e(28, 28, 17));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, false, false, false);
        zbVar.d = k6Var;
        k6Var.setTypeface(Typeface.SANS_SERIF);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        zbVar.addView(k6Var, k7.c6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        zbVar.setTextColor(zbVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        zbVar.setBackground(zbVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        if (z4) {
            p9Var.setImageBitmap(pyVar.Y3.r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.t1().z4.getBitmap());
        }
        Activity parentActivity2 = pyVar.getParentActivity();
        g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity2, g6Var2, true);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        gcVar.a = new zi(this, 25);
        zbVar.setButton(gcVar);
        zbVar.getButton().setVisibility(8);
        k6Var.c(LocaleController.getString(z10 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.ic b10 = org.telegram.ui.Components.qc.a0(pyVar).b(zbVar, -1);
        pyVar.b4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.ic icVar2 = pyVar.b4;
        icVar2.s = true;
        icVar2.j();
    }

    @Override // org.telegram.ui.Components.x40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cy
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                dy dyVar = dy.this;
                py pyVar = dyVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pyVar.Z3 = photoSize2.location;
                    pyVar.a4 = photoSize.location;
                } else {
                    if (pyVar.Z3 == null) {
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
                    pyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new mh.k7(dyVar, str, z4, 3));
                }
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.x40
    public final lu0 getCloseIntoObject() {
        py pyVar = this.a;
        org.telegram.ui.Components.ic icVar = pyVar.b4;
        if (icVar == null) {
            return null;
        }
        org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) icVar.e;
        lu0 lu0Var = new lu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.p9 p9Var = zbVar.c;
        org.telegram.ui.Components.p9 p9Var2 = zbVar.c;
        p9Var.getLocationInWindow(iArr);
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = pyVar.fragmentView;
        ImageReceiver imageReceiver = p9Var2.getImageReceiver();
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        lu0Var.i = 0;
        lu0Var.h = lu0Var.a.getRoundRadius();
        lu0Var.k = p9Var2.getScaleX();
        return lu0Var;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final boolean u() {
        return true;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ void P() {
    }
}
