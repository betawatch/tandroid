package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements org.telegram.ui.Components.fm0, cd0 {
    public final /* synthetic */ j70 a;

    public /* synthetic */ e70(j70 j70Var) {
        this.a = j70Var;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.cd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        j70 j70Var = this.a;
        Location location = j70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        j70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        j70 j70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(j70Var)) {
                return;
            }
            hd0 hd0Var = new hd0(4);
            hd0Var.e0 = 0L;
            hd0Var.F0 = new e70(j70Var);
            j70Var.presentFragment(hd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || j70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = j70Var.w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(j70Var.getParentActivity(), null, new g(j70Var, 22), true, 1, null);
            q8Var.b(j70Var.W);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(q8Var.a, -2, -2);
            j70Var.w = n1Var2;
            n1Var2.e = true;
            n1Var2.c = 220;
            n1Var2.setOutsideTouchable(true);
            j70Var.w.setClippingEnabled(true);
            j70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            j70Var.w.setFocusable(true);
            q8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            j70Var.w.setInputMethodMode(2);
            j70Var.w.getContentView().setFocusableInTouchMode(true);
            j70Var.w.showAtLocation(j70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((q8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            j70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
