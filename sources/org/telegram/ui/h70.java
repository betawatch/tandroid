package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements org.telegram.ui.Components.al0, dd0 {
    public final /* synthetic */ l70 a;

    public /* synthetic */ h70(l70 l70Var) {
        this.a = l70Var;
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        l70 l70Var = this.a;
        Location location = l70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        l70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        l70 l70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(l70Var)) {
                return;
            }
            id0 id0Var = new id0(4);
            id0Var.e0 = 0L;
            id0Var.F0 = new h70(l70Var);
            l70Var.presentFragment(id0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || l70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = l70Var.w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(l70Var.getParentActivity(), null, new g(l70Var, 22), true, 1, null);
            q8Var.b(l70Var.W);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(q8Var.a, -2, -2);
            l70Var.w = n1Var2;
            n1Var2.e = true;
            n1Var2.c = 220;
            n1Var2.setOutsideTouchable(true);
            l70Var.w.setClippingEnabled(true);
            l70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            l70Var.w.setFocusable(true);
            q8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            l70Var.w.setInputMethodMode(2);
            l70Var.w.getContentView().setFocusableInTouchMode(true);
            l70Var.w.showAtLocation(l70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((q8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            l70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
