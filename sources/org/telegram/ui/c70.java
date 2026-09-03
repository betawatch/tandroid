package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c70 implements org.telegram.ui.Components.il0, xc0 {
    public final /* synthetic */ g70 a;

    public /* synthetic */ c70(g70 g70Var) {
        this.a = g70Var;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        g70 g70Var = this.a;
        Location location = g70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g70Var.Q = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.z9;
        g70 g70Var = this.a;
        if (z4) {
            if (!AndroidUtilities.isMapsInstalled(g70Var)) {
                return;
            }
            cd0 cd0Var = new cd0(4);
            cd0Var.b0 = 0L;
            cd0Var.C0 = new c70(g70Var);
            g70Var.presentFragment(cd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.n8) || g70Var.M == 5) {
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = g70Var.w;
        if (p1Var == null || !p1Var.isShowing()) {
            org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(g70Var.getParentActivity(), null, new h(g70Var, 22), true, 1, null);
            h8Var.b(g70Var.T);
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.a, -2, -2);
            g70Var.w = p1Var2;
            p1Var2.e = true;
            p1Var2.c = 220;
            p1Var2.setOutsideTouchable(true);
            g70Var.w.setClippingEnabled(true);
            g70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            g70Var.w.setFocusable(true);
            h8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            g70Var.w.setInputMethodMode(2);
            g70Var.w.getContentView().setFocusableInTouchMode(true);
            g70Var.w.showAtLocation(g70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            g70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
