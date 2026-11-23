package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements org.telegram.ui.Components.rj0, na0 {
    public final /* synthetic */ f50 a;

    public /* synthetic */ b50(f50 f50Var) {
        this.a = f50Var;
    }

    @Override // org.telegram.ui.na0
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        f50 f50Var = this.a;
        Location location = f50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f50Var.U = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        f50 f50Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.g0.J1(f50Var)) {
                return;
            }
            qa0 qa0Var = new qa0(4);
            qa0Var.m0 = 0L;
            qa0Var.M0 = new b50(f50Var);
            f50Var.presentFragment(qa0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.n8) || f50Var.Q == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = f50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(f50Var.getParentActivity(), null, new f(f50Var, 19), true, 1, null);
            qeVar.u(f50Var.X);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b, -2, -2);
            f50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.ls.x3;
            g1Var2.setOutsideTouchable(true);
            f50Var.x.setClippingEnabled(true);
            f50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            f50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            f50Var.x.setInputMethodMode(2);
            f50Var.x.getContentView().setFocusableInTouchMode(true);
            f50Var.x.showAtLocation(f50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            f50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
