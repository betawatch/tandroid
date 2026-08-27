package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements org.telegram.ui.Components.qk0, oc0 {
    public final /* synthetic */ u60 a;

    public /* synthetic */ q60(u60 u60Var) {
        this.a = u60Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        u60 u60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(u60Var)) {
                return;
            }
            tc0 tc0Var = new tc0(4);
            tc0Var.a0 = 0L;
            tc0Var.B0 = new q60(u60Var);
            u60Var.presentFragment(tc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.l8) || u60Var.L == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = u60Var.w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.g8 g8Var = new org.telegram.ui.Components.g8(u60Var.getParentActivity(), null, new g(u60Var, 22), true, 1, null);
            g8Var.b(u60Var.S);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(g8Var.a, -2, -2);
            u60Var.w = n1Var2;
            n1Var2.e = true;
            n1Var2.c = 220;
            n1Var2.setOutsideTouchable(true);
            u60Var.w.setClippingEnabled(true);
            u60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            u60Var.w.setFocusable(true);
            g8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            u60Var.w.setInputMethodMode(2);
            u60Var.w.getContentView().setFocusableInTouchMode(true);
            u60Var.w.showAtLocation(u60Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((g8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            u60Var.w.b();
        }
    }

    @Override // org.telegram.ui.oc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        u60 u60Var = this.a;
        Location location = u60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        u60Var.P = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
