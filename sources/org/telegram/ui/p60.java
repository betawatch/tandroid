package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements org.telegram.ui.Components.xl0, kc0 {
    public final /* synthetic */ u60 a;

    public /* synthetic */ p60(u60 u60Var) {
        this.a = u60Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.kc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        u60 u60Var = this.a;
        Location location = u60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        u60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        u60 u60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(u60Var)) {
                return;
            }
            pc0 pc0Var = new pc0(4);
            pc0Var.e0 = 0L;
            pc0Var.F0 = new p60(u60Var);
            u60Var.presentFragment(pc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.q8) || u60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = u60Var.w;
        if (m1Var == null || !m1Var.isShowing()) {
            org.telegram.ui.Components.p8 p8Var = new org.telegram.ui.Components.p8(u60Var.getParentActivity(), null, new g(u60Var, 22), true, 1, null);
            p8Var.b(u60Var.W);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(p8Var.a, -2, -2);
            u60Var.w = m1Var2;
            m1Var2.e = true;
            m1Var2.c = 220;
            m1Var2.setOutsideTouchable(true);
            u60Var.w.setClippingEnabled(true);
            u60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            u60Var.w.setFocusable(true);
            p8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            u60Var.w.setInputMethodMode(2);
            u60Var.w.getContentView().setFocusableInTouchMode(true);
            u60Var.w.showAtLocation(u60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((p8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            u60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
