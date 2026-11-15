package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lw implements org.telegram.ui.Components.l30 {
    public final /* synthetic */ yw a;

    public lw(yw ywVar) {
        this.a = ywVar;
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        org.telegram.ui.Components.xb xbVar = this.a.f4;
        if (xbVar != null) {
            ((org.telegram.ui.Components.ob) xbVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        yw ywVar = this.a;
        org.telegram.ui.Components.xb xbVar = ywVar.f4;
        if (xbVar != null) {
            xbVar.b();
            ywVar.f4 = null;
        }
        Activity parentActivity = ywVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(parentActivity, e6Var);
        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(obVar, parentActivity);
        obVar.b = nbVar;
        nbVar.setWillNotDraw(false);
        obVar.addView(nbVar, c8.ja.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
        obVar.c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        nbVar.addView(i9Var, c8.ja.e(28, 28, 17));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, false, false, false);
        obVar.d = h6Var;
        h6Var.setTypeface(Typeface.SANS_SERIF);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        obVar.addView(h6Var, c8.ja.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        obVar.setTextColor(obVar.getThemedColor(org.telegram.ui.ActionBar.j6.yj));
        obVar.setBackground(obVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        if (z10) {
            i9Var.setImageBitmap(ywVar.c4.r);
        } else {
            i9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = ywVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity2, e6Var2, true);
        vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
        vbVar.b = new bh(this, 23);
        obVar.setButton(vbVar);
        obVar.getButton().setVisibility(8);
        h6Var.c(org.telegram.messenger.hd.M0(z11 ? 2131742792 : 2131742794, null), true, true);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(ywVar).b(obVar, -1);
        ywVar.f4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.xb xbVar2 = ywVar.f4;
        xbVar2.s = true;
        xbVar2.j();
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.kw
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                lw lwVar = lw.this;
                yw ywVar = lwVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ywVar.d4 = photoSize2.location;
                    ywVar.e4 = photoSize.location;
                } else {
                    if (ywVar.d4 == null) {
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
                    ywVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.l8(lwVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public final uq0 getCloseIntoObject() {
        yw ywVar = this.a;
        org.telegram.ui.Components.xb xbVar = ywVar.f4;
        if (xbVar == null) {
            return null;
        }
        org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) xbVar.e;
        uq0 uq0Var = new uq0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.i9 i9Var = obVar.c;
        org.telegram.ui.Components.i9 i9Var2 = obVar.c;
        i9Var.getLocationInWindow(iArr);
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = ywVar.fragmentView;
        ImageReceiver imageReceiver = i9Var2.getImageReceiver();
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        uq0Var.i = 0;
        uq0Var.h = uq0Var.a.X0;
        uq0Var.k = i9Var2.getScaleX();
        return uq0Var;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final boolean x() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }
}
