package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements org.telegram.ui.Components.rj0, ma0 {
    public final /* synthetic */ e50 a;

    public /* synthetic */ a50(e50 e50Var) {
        this.a = e50Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        e50 e50Var = this.a;
        Location location = e50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        e50Var.U = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w9;
        e50 e50Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.g0.J1(e50Var)) {
                return;
            }
            pa0 pa0Var = new pa0(4);
            pa0Var.m0 = 0L;
            pa0Var.M0 = new a50(e50Var);
            e50Var.presentFragment(pa0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.m8) || e50Var.Q == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = e50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.pe peVar = new org.telegram.messenger.pe(e50Var.getParentActivity(), null, new f(e50Var, 19), true, 1, null);
            peVar.u(e50Var.X);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b, -2, -2);
            e50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.ks.x3;
            g1Var2.setOutsideTouchable(true);
            e50Var.x.setClippingEnabled(true);
            e50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            e50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            e50Var.x.setInputMethodMode(2);
            e50Var.x.getContentView().setFocusableInTouchMode(true);
            e50Var.x.showAtLocation(e50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            e50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
