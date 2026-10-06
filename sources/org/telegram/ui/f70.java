package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements org.telegram.ui.Components.nl0, bd0 {
    public final /* synthetic */ k70 a;

    public /* synthetic */ f70(k70 k70Var) {
        this.a = k70Var;
    }

    @Override // org.telegram.ui.bd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        k70 k70Var = this.a;
        Location location = k70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        k70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        k70 k70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(k70Var)) {
                return;
            }
            gd0 gd0Var = new gd0(4);
            gd0Var.e0 = 0L;
            gd0Var.F0 = new f70(k70Var);
            k70Var.presentFragment(gd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || k70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = k70Var.w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(k70Var.getParentActivity(), null, new g(k70Var, 22), true, 1, null);
            o8Var.b(k70Var.W);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(o8Var.a, -2, -2);
            k70Var.w = n1Var2;
            n1Var2.e = true;
            n1Var2.c = 220;
            n1Var2.setOutsideTouchable(true);
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

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
