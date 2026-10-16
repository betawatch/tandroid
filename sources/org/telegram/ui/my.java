package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class my implements org.telegram.ui.Components.h50 {
    public final /* synthetic */ yy a;

    public my(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.Components.h50
    public final void E(float f7) {
        org.telegram.ui.Components.sc scVar = this.a.e4;
        if (scVar != null) {
            ((org.telegram.ui.Components.jc) scVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        yy yyVar = this.a;
        org.telegram.ui.Components.sc scVar = yyVar.e4;
        if (scVar != null) {
            scVar.b();
            yyVar.e4 = null;
        }
        Activity parentActivity = yyVar.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(parentActivity, c6Var);
        org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(jcVar, parentActivity);
        jcVar.b = icVar;
        icVar.setWillNotDraw(false);
        jcVar.addView(icVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(parentActivity);
        jcVar.c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        icVar.addView(z9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, false, false, false);
        jcVar.d = s6Var;
        s6Var.setTypeface(Typeface.SANS_SERIF);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        jcVar.addView(s6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        jcVar.setTextColor(jcVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        jcVar.setBackground(jcVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        if (z10) {
            z9Var.setImageBitmap(yyVar.b4.r);
        } else {
            z9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = yyVar.getParentActivity();
        c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(parentActivity2, c6Var2, true);
        qcVar.e(LocaleController.getString(R.string.ViewAction));
        qcVar.a = new gj(this, 26);
        jcVar.setButton(qcVar);
        jcVar.getButton().setVisibility(8);
        s6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.sc b10 = org.telegram.ui.Components.zc.a0(yyVar).b(jcVar, -1);
        yyVar.e4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.sc scVar2 = yyVar.e4;
        scVar2.s = true;
        scVar2.j();
    }

    @Override // org.telegram.ui.Components.h50
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ly
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                my myVar = my.this;
                yy yyVar = myVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    yyVar.c4 = photoSize2.location;
                    yyVar.d4 = photoSize.location;
                } else {
                    if (yyVar.c4 == null) {
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
                    yyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.u1(myVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.h50
    public final jv0 getCloseIntoObject() {
        yy yyVar = this.a;
        org.telegram.ui.Components.sc scVar = yyVar.e4;
        if (scVar == null) {
            return null;
        }
        org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) scVar.e;
        jv0 jv0Var = new jv0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.z9 z9Var = jcVar.c;
        org.telegram.ui.Components.z9 z9Var2 = jcVar.c;
        z9Var.getLocationInWindow(iArr);
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = yyVar.fragmentView;
        ImageReceiver imageReceiver = z9Var2.getImageReceiver();
        jv0Var.a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.i = 0;
        jv0Var.h = jv0Var.a.getRoundRadius();
        jv0Var.k = z9Var2.getScaleX();
        return jv0Var;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.h50
    public final boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ void P() {
    }
}
