package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements org.telegram.ui.Components.jl0, vc0 {
    public final /* synthetic */ e70 a;

    public /* synthetic */ a70(e70 e70Var) {
        this.a = e70Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.aa;
        e70 e70Var = this.a;
        if (z4) {
            if (!AndroidUtilities.isMapsInstalled(e70Var)) {
                return;
            }
            ad0 ad0Var = new ad0(4);
            ad0Var.b0 = 0L;
            ad0Var.C0 = new a70(e70Var);
            e70Var.presentFragment(ad0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.o8) || e70Var.M == 5) {
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = e70Var.w;
        if (p1Var == null || !p1Var.isShowing()) {
            org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(e70Var.getParentActivity(), null, new h(e70Var, 22), true, 1, null);
            h8Var.b(e70Var.T);
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.a, -2, -2);
            e70Var.w = p1Var2;
            p1Var2.e = true;
            p1Var2.c = 220;
            p1Var2.setOutsideTouchable(true);
            e70Var.w.setClippingEnabled(true);
            e70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            e70Var.w.setFocusable(true);
            h8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            e70Var.w.setInputMethodMode(2);
            e70Var.w.getContentView().setFocusableInTouchMode(true);
            e70Var.w.showAtLocation(e70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            e70Var.w.b();
        }
    }

    @Override // org.telegram.ui.vc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        e70 e70Var = this.a;
        Location location = e70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        e70Var.Q = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
