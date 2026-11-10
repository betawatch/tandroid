package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements org.telegram.ui.Components.cj0, pa0 {
    public final /* synthetic */ g50 a;

    public /* synthetic */ b50(g50 g50Var) {
        this.a = g50Var;
    }

    @Override // org.telegram.ui.pa0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        g50 g50Var = this.a;
        Location location = g50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g50Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        g50 g50Var = this.a;
        if (z9) {
            if (!org.telegram.messenger.g0.J1(g50Var)) {
                return;
            }
            sa0 sa0Var = new sa0(4);
            sa0Var.l0 = 0L;
            sa0Var.G0 = new b50(g50Var);
            g50Var.presentFragment(sa0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.m8) || g50Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = g50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.re reVar = new org.telegram.messenger.re(g50Var.getParentActivity(), null, new f(g50Var, 19), true, 1, null);
            reVar.u(g50Var.W);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b, -2, -2);
            g50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.qs.x3;
            g1Var2.setOutsideTouchable(true);
            g50Var.x.setClippingEnabled(true);
            g50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            g50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            g50Var.x.setInputMethodMode(2);
            g50Var.x.getContentView().setFocusableInTouchMode(true);
            g50Var.x.showAtLocation(g50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            g50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
