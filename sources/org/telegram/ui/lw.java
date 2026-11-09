package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lw implements org.telegram.ui.Components.j30 {
    public final /* synthetic */ yw a;

    public lw(yw ywVar) {
        this.a = ywVar;
    }

    @Override // org.telegram.ui.Components.j30
    public final void H(float f10) {
        org.telegram.ui.Components.cc ccVar = this.a.e4;
        if (ccVar != null) {
            ((org.telegram.ui.Components.tb) ccVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.j30
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        yw ywVar = this.a;
        org.telegram.ui.Components.cc ccVar = ywVar.e4;
        if (ccVar != null) {
            ccVar.b();
            ywVar.e4 = null;
        }
        Activity parentActivity = ywVar.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
        org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(parentActivity, g6Var);
        org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(tbVar, parentActivity);
        tbVar.b = sbVar;
        sbVar.setWillNotDraw(false);
        tbVar.addView(sbVar, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
        tbVar.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        sbVar.addView(l9Var, c8.ha.e(28, 28, 17));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, false, false, false);
        tbVar.d = j6Var;
        j6Var.setTypeface(Typeface.SANS_SERIF);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        tbVar.addView(j6Var, c8.ha.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        tbVar.setTextColor(tbVar.getThemedColor(org.telegram.ui.ActionBar.l6.vj));
        tbVar.setBackground(tbVar.getThemedColor(org.telegram.ui.ActionBar.l6.tj));
        if (z9) {
            l9Var.setImageBitmap(ywVar.b4.r);
        } else {
            l9Var.setImageBitmap(PhotoViewer.p1().B4.n());
        }
        Activity parentActivity2 = ywVar.getParentActivity();
        g6Var2 = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(parentActivity2, g6Var2, true);
        acVar.e(org.telegram.messenger.id.M0(2131743563, null));
        acVar.b = new dh(this, 23);
        tbVar.setButton(acVar);
        tbVar.getButton().setVisibility(8);
        j6Var.c(org.telegram.messenger.id.M0(z10 ? 2131742792 : 2131742794, null), true, true);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(ywVar).b(tbVar, -1);
        ywVar.e4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.cc ccVar2 = ywVar.e4;
        ccVar2.s = true;
        ccVar2.j();
    }

    @Override // org.telegram.ui.Components.j30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
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
                    ywVar.c4 = photoSize2.location;
                    ywVar.d4 = photoSize.location;
                } else {
                    if (ywVar.c4 == null) {
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
                    ywVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.u9(lwVar, str, z9, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                kVar.r().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.j30
    public final yq0 getCloseIntoObject() {
        yw ywVar = this.a;
        org.telegram.ui.Components.cc ccVar = ywVar.e4;
        if (ccVar == null) {
            return null;
        }
        org.telegram.ui.Components.tb tbVar = (org.telegram.ui.Components.tb) ccVar.e;
        yq0 yq0Var = new yq0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.l9 l9Var = tbVar.c;
        org.telegram.ui.Components.l9 l9Var2 = tbVar.c;
        l9Var.getLocationInWindow(iArr);
        yq0Var.b = iArr[0];
        yq0Var.c = iArr[1];
        yq0Var.d = ywVar.fragmentView;
        ImageReceiver imageReceiver = l9Var2.getImageReceiver();
        yq0Var.a = imageReceiver;
        yq0Var.e = imageReceiver.p();
        yq0Var.i = 0;
        yq0Var.h = yq0Var.a.W0;
        yq0Var.k = l9Var2.getScaleX();
        return yq0Var;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.j30
    public final boolean x() {
        return true;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ void T() {
    }
}
