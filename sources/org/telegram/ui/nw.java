package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nw implements org.telegram.ui.Components.t30 {
    public final /* synthetic */ bx a;

    public nw(bx bxVar) {
        this.a = bxVar;
    }

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        org.telegram.ui.Components.fc fcVar = this.a.i4;
        if (fcVar != null) {
            ((org.telegram.ui.Components.wb) fcVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        bx bxVar = this.a;
        org.telegram.ui.Components.fc fcVar = bxVar.i4;
        if (fcVar != null) {
            fcVar.b();
            bxVar.i4 = null;
        }
        Activity parentActivity = bxVar.getParentActivity();
        i6Var = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(parentActivity, i6Var);
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(wbVar, parentActivity);
        wbVar.b = vbVar;
        vbVar.setWillNotDraw(false);
        wbVar.addView(vbVar, c8.na.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        wbVar.c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        vbVar.addView(p9Var, c8.na.e(28, 28, 17));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, false, false, false);
        wbVar.d = n6Var;
        n6Var.setTypeface(Typeface.SANS_SERIF);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        wbVar.addView(n6Var, c8.na.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        wbVar.setTextColor(wbVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        wbVar.setBackground(wbVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        if (z10) {
            p9Var.setImageBitmap(bxVar.f4.r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = bxVar.getParentActivity();
        i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(parentActivity2, i6Var2, true);
        dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
        dcVar.b = new ch(this, 23);
        wbVar.setButton(dcVar);
        wbVar.getButton().setVisibility(8);
        n6Var.c(org.telegram.messenger.gd.N0(z11 ? 2131742521 : 2131742523, null), true, true);
        org.telegram.ui.Components.fc b10 = org.telegram.ui.Components.kc.b0(bxVar).b(wbVar, -1);
        bxVar.i4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.fc fcVar2 = bxVar.i4;
        fcVar2.s = true;
        fcVar2.j();
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.mw
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                nw nwVar = nw.this;
                bx bxVar = nwVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    bxVar.g4 = photoSize2.location;
                    bxVar.h4 = photoSize.location;
                } else {
                    if (bxVar.g4 == null) {
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
                    bxVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.o8(nwVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final wq0 getCloseIntoObject() {
        bx bxVar = this.a;
        org.telegram.ui.Components.fc fcVar = bxVar.i4;
        if (fcVar == null) {
            return null;
        }
        org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) fcVar.e;
        wq0 wq0Var = new wq0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.p9 p9Var = wbVar.c;
        org.telegram.ui.Components.p9 p9Var2 = wbVar.c;
        p9Var.getLocationInWindow(iArr);
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = bxVar.fragmentView;
        ImageReceiver imageReceiver = p9Var2.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.i = 0;
        wq0Var.h = wq0Var.a.X0;
        wq0Var.k = p9Var2.getScaleX();
        return wq0Var;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final boolean x() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }
}
