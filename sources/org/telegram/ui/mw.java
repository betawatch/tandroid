package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mw implements org.telegram.ui.Components.i30 {
    public final /* synthetic */ zw a;

    public mw(zw zwVar) {
        this.a = zwVar;
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        org.telegram.ui.Components.bc bcVar = this.a.e4;
        if (bcVar != null) {
            ((org.telegram.ui.Components.sb) bcVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        zw zwVar = this.a;
        org.telegram.ui.Components.bc bcVar = zwVar.e4;
        if (bcVar != null) {
            bcVar.b();
            zwVar.e4 = null;
        }
        Activity parentActivity = zwVar.getParentActivity();
        h6Var = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
        org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(parentActivity, h6Var);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(sbVar, parentActivity);
        sbVar.b = rbVar;
        rbVar.setWillNotDraw(false);
        sbVar.addView(rbVar, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
        sbVar.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        rbVar.addView(k9Var, c8.ha.e(28, 28, 17));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(parentActivity, false, false, false);
        sbVar.d = i6Var;
        i6Var.setTypeface(Typeface.SANS_SERIF);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        sbVar.addView(i6Var, c8.ha.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        sbVar.setTextColor(sbVar.getThemedColor(org.telegram.ui.ActionBar.m6.vj));
        sbVar.setBackground(sbVar.getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        if (z9) {
            k9Var.setImageBitmap(zwVar.b4.r);
        } else {
            k9Var.setImageBitmap(PhotoViewer.p1().B4.n());
        }
        Activity parentActivity2 = zwVar.getParentActivity();
        h6Var2 = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity2, h6Var2, true);
        zbVar.e(org.telegram.messenger.id.M0(2131743563, null));
        zbVar.b = new dh(this, 23);
        sbVar.setButton(zbVar);
        sbVar.getButton().setVisibility(8);
        i6Var.c(org.telegram.messenger.id.M0(z10 ? 2131742792 : 2131742794, null), true, true);
        org.telegram.ui.Components.bc b10 = org.telegram.ui.Components.gc.a0(zwVar).b(sbVar, -1);
        zwVar.e4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.bc bcVar2 = zwVar.e4;
        bcVar2.s = true;
        bcVar2.j();
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.lw
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                mw mwVar = mw.this;
                zw zwVar = mwVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    zwVar.c4 = photoSize2.location;
                    zwVar.d4 = photoSize.location;
                } else {
                    if (zwVar.c4 == null) {
                        return;
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i7 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i7 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    zwVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.u9(mwVar, str, z9, 5));
                }
                lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                lVar.s().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final zq0 getCloseIntoObject() {
        zw zwVar = this.a;
        org.telegram.ui.Components.bc bcVar = zwVar.e4;
        if (bcVar == null) {
            return null;
        }
        org.telegram.ui.Components.sb sbVar = (org.telegram.ui.Components.sb) bcVar.e;
        zq0 zq0Var = new zq0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.k9 k9Var = sbVar.c;
        org.telegram.ui.Components.k9 k9Var2 = sbVar.c;
        k9Var.getLocationInWindow(iArr);
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = zwVar.fragmentView;
        ImageReceiver imageReceiver = k9Var2.getImageReceiver();
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        zq0Var.i = 0;
        zq0Var.h = zq0Var.a.W0;
        zq0Var.k = k9Var2.getScaleX();
        return zq0Var;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final boolean x() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }
}
