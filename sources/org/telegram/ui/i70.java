package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i70 implements org.telegram.ui.Components.bl0, fd0 {
    public final /* synthetic */ n70 a;

    public /* synthetic */ i70(n70 n70Var) {
        this.a = n70Var;
    }

    @Override // org.telegram.ui.fd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        n70 n70Var = this.a;
        Location location = n70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        n70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        n70 n70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(n70Var)) {
                return;
            }
            kd0 kd0Var = new kd0(4);
            kd0Var.e0 = 0L;
            kd0Var.F0 = new i70(n70Var);
            n70Var.presentFragment(kd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || n70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = n70Var.w;
        if (o1Var == null || !o1Var.isShowing()) {
            org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(n70Var.getParentActivity(), null, new g(n70Var, 22), true, 1, null);
            m8Var.b(n70Var.W);
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(m8Var.a, -2, -2);
            n70Var.w = o1Var2;
            o1Var2.e = true;
            o1Var2.c = 220;
            o1Var2.setOutsideTouchable(true);
            n70Var.w.setClippingEnabled(true);
            n70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            n70Var.w.setFocusable(true);
            m8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            n70Var.w.setInputMethodMode(2);
            n70Var.w.getContentView().setFocusableInTouchMode(true);
            n70Var.w.showAtLocation(n70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((m8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            n70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
