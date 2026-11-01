package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nx implements org.telegram.ui.Components.a40 {
    public final /* synthetic */ zx a;

    public nx(zx zxVar) {
        this.a = zxVar;
    }

    @Override // org.telegram.ui.Components.a40
    public final void I(float f7) {
        org.telegram.ui.Components.wb wbVar = this.a.d4;
        if (wbVar != null) {
            ((org.telegram.ui.Components.nb) wbVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zx zxVar = this.a;
        org.telegram.ui.Components.wb wbVar = zxVar.d4;
        if (wbVar != null) {
            wbVar.b();
            zxVar.d4 = null;
        }
        Activity parentActivity = zxVar.getParentActivity();
        p6Var = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(parentActivity, p6Var);
        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(nbVar, parentActivity);
        nbVar.b = mbVar;
        mbVar.setWillNotDraw(false);
        nbVar.addView(mbVar, w7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
        nbVar.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        mbVar.addView(g9Var, w7.b6.e(28, 28, 17));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(parentActivity, false, false, false);
        nbVar.d = f6Var;
        f6Var.setTypeface(Typeface.SANS_SERIF);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        nbVar.addView(f6Var, w7.b6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        if (z10) {
            g9Var.setImageBitmap(zxVar.a4.r);
        } else {
            g9Var.setImageBitmap(PhotoViewer.v1().C4.n());
        }
        Activity parentActivity2 = zxVar.getParentActivity();
        p6Var2 = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity2, p6Var2, true);
        ubVar.e(org.telegram.messenger.dd.L0(2131743589, null));
        ubVar.b = new rh(this, 24);
        nbVar.setButton(ubVar);
        nbVar.getButton().setVisibility(8);
        f6Var.c(org.telegram.messenger.dd.L0(z11 ? 2131742817 : 2131742819, null), true, true);
        org.telegram.ui.Components.wb b10 = org.telegram.ui.Components.cc.a0(zxVar).b(nbVar, -1);
        zxVar.d4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.wb wbVar2 = zxVar.d4;
        wbVar2.s = true;
        wbVar2.j();
    }

    @Override // org.telegram.ui.Components.a40
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.mx
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                nx nxVar = nx.this;
                zx zxVar = nxVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    zxVar.b4 = photoSize2.location;
                    zxVar.c4 = photoSize.location;
                } else {
                    if (zxVar.b4 == null) {
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
                    zxVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new wd(nxVar, str, z10, 2));
                }
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                lVar.p().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final fs0 getCloseIntoObject() {
        zx zxVar = this.a;
        org.telegram.ui.Components.wb wbVar = zxVar.d4;
        if (wbVar == null) {
            return null;
        }
        org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) wbVar.e;
        fs0 fs0Var = new fs0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.g9 g9Var = nbVar.c;
        org.telegram.ui.Components.g9 g9Var2 = nbVar.c;
        g9Var.getLocationInWindow(iArr);
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = zxVar.fragmentView;
        ImageReceiver imageReceiver = g9Var2.getImageReceiver();
        fs0Var.a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.i = 0;
        fs0Var.h = fs0Var.a.W0;
        fs0Var.k = g9Var2.getScaleX();
        return fs0Var;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final boolean y() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void U() {
    }
}
