package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements org.telegram.ui.Components.ll0, xc0 {
    public final /* synthetic */ g70 a;

    public /* synthetic */ b70(g70 g70Var) {
        this.a = g70Var;
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        g70 g70Var = this.a;
        Location location = g70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        g70 g70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(g70Var)) {
                return;
            }
            cd0 cd0Var = new cd0(4);
            cd0Var.e0 = 0L;
            cd0Var.F0 = new b70(g70Var);
            g70Var.presentFragment(cd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || g70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = g70Var.w;
        if (m1Var == null || !m1Var.isShowing()) {
            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(g70Var.getParentActivity(), null, new g(g70Var, 22), true, 1, null);
            o8Var.b(g70Var.W);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(o8Var.a, -2, -2);
            g70Var.w = m1Var2;
            m1Var2.e = true;
            m1Var2.c = 220;
            m1Var2.setOutsideTouchable(true);
            g70Var.w.setClippingEnabled(true);
            g70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            g70Var.w.setFocusable(true);
            o8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            g70Var.w.setInputMethodMode(2);
            g70Var.w.getContentView().setFocusableInTouchMode(true);
            g70Var.w.showAtLocation(g70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            g70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
