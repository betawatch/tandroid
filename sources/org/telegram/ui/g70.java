package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g70 implements org.telegram.ui.Components.kl0, dd0 {
    public final /* synthetic */ k70 a;

    public /* synthetic */ g70(k70 k70Var) {
        this.a = k70Var;
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        k70 k70Var = this.a;
        Location location = k70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        k70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        k70 k70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(k70Var)) {
                return;
            }
            id0 id0Var = new id0(4);
            id0Var.e0 = 0L;
            id0Var.F0 = new g70(k70Var);
            k70Var.presentFragment(id0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.s8) || k70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = k70Var.w;
        if (p1Var == null || !p1Var.isShowing()) {
            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(k70Var.getParentActivity(), null, new g(k70Var, 22), true, 1, null);
            o8Var.b(k70Var.W);
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(o8Var.a, -2, -2);
            k70Var.w = p1Var2;
            p1Var2.e = true;
            p1Var2.c = 220;
            p1Var2.setOutsideTouchable(true);
            k70Var.w.setClippingEnabled(true);
            k70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            k70Var.w.setFocusable(true);
            o8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            k70Var.w.setInputMethodMode(2);
            k70Var.w.getContentView().setFocusableInTouchMode(true);
            k70Var.w.showAtLocation(k70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            k70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
