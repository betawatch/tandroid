package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements org.telegram.ui.Components.dj0, oa0 {
    public final /* synthetic */ f50 a;

    public /* synthetic */ a50(f50 f50Var) {
        this.a = f50Var;
    }

    @Override // org.telegram.ui.oa0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        f50 f50Var = this.a;
        Location location = f50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f50Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        f50 f50Var = this.a;
        if (z9) {
            if (!org.telegram.messenger.g0.J1(f50Var)) {
                return;
            }
            ra0 ra0Var = new ra0(4);
            ra0Var.l0 = 0L;
            ra0Var.G0 = new a50(f50Var);
            f50Var.presentFragment(ra0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.m8) || f50Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = f50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.re reVar = new org.telegram.messenger.re(f50Var.getParentActivity(), null, new f(f50Var, 19), true, 1, null);
            reVar.u(f50Var.W);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b, -2, -2);
            f50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.qs.x3;
            g1Var2.setOutsideTouchable(true);
            f50Var.x.setClippingEnabled(true);
            f50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            f50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            f50Var.x.setInputMethodMode(2);
            f50Var.x.getContentView().setFocusableInTouchMode(true);
            f50Var.x.showAtLocation(f50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            f50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
