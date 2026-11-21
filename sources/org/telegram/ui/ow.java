package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ow implements org.telegram.ui.Components.w30 {
    public final /* synthetic */ cx a;

    public ow(cx cxVar) {
        this.a = cxVar;
    }

    @Override // org.telegram.ui.Components.w30
    public final void I(float f10) {
        org.telegram.ui.Components.gc gcVar = this.a.i4;
        if (gcVar != null) {
            ((org.telegram.ui.Components.xb) gcVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.w30
    public final void Q(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        cx cxVar = this.a;
        org.telegram.ui.Components.gc gcVar = cxVar.i4;
        if (gcVar != null) {
            gcVar.b();
            cxVar.i4 = null;
        }
        Activity parentActivity = cxVar.getParentActivity();
        h6Var = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, h6Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(xbVar, parentActivity);
        xbVar.b = wbVar;
        wbVar.setWillNotDraw(false);
        xbVar.addView(wbVar, c8.ma.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
        xbVar.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        wbVar.addView(q9Var, c8.ma.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        xbVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        xbVar.addView(o6Var, c8.ma.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        xbVar.setTextColor(xbVar.getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        xbVar.setBackground(xbVar.getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        if (z10) {
            q9Var.setImageBitmap(cxVar.f4.r);
        } else {
            q9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = cxVar.getParentActivity();
        h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(parentActivity2, h6Var2, true);
        ecVar.e(org.telegram.messenger.gd.N0(2131743320, null));
        ecVar.b = new bh(this, 23);
        xbVar.setButton(ecVar);
        xbVar.getButton().setVisibility(8);
        o6Var.c(org.telegram.messenger.gd.N0(z11 ? 2131742528 : 2131742530, null), true, true);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(cxVar).b(xbVar, -1);
        cxVar.i4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.gc gcVar2 = cxVar.i4;
        gcVar2.s = true;
        gcVar2.j();
    }

    @Override // org.telegram.ui.Components.w30
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.nw
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ow owVar = ow.this;
                cx cxVar = owVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    cxVar.g4 = photoSize2.location;
                    cxVar.h4 = photoSize.location;
                } else {
                    if (cxVar.g4 == null) {
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
                    cxVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.o8(owVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w30
    public final wq0 getCloseIntoObject() {
        cx cxVar = this.a;
        org.telegram.ui.Components.gc gcVar = cxVar.i4;
        if (gcVar == null) {
            return null;
        }
        org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) gcVar.e;
        wq0 wq0Var = new wq0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.q9 q9Var = xbVar.c;
        org.telegram.ui.Components.q9 q9Var2 = xbVar.c;
        q9Var.getLocationInWindow(iArr);
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = cxVar.fragmentView;
        ImageReceiver imageReceiver = q9Var2.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.i = 0;
        wq0Var.h = wq0Var.a.X0;
        wq0Var.k = q9Var2.getScaleX();
        return wq0Var;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public final boolean x() {
        return true;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ void U() {
    }
}
