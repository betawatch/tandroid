package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements org.telegram.ui.Components.kl0, wc0 {
    public final /* synthetic */ f70 a;

    public /* synthetic */ b70(f70 f70Var) {
        this.a = f70Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.aa;
        f70 f70Var = this.a;
        if (z4) {
            if (!AndroidUtilities.isMapsInstalled(f70Var)) {
                return;
            }
            bd0 bd0Var = new bd0(4);
            bd0Var.b0 = 0L;
            bd0Var.C0 = new b70(f70Var);
            f70Var.presentFragment(bd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.o8) || f70Var.M == 5) {
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = f70Var.w;
        if (p1Var == null || !p1Var.isShowing()) {
            org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(f70Var.getParentActivity(), null, new h(f70Var, 22), true, 1, null);
            h8Var.b(f70Var.T);
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.a, -2, -2);
            f70Var.w = p1Var2;
            p1Var2.e = true;
            p1Var2.c = 220;
            p1Var2.setOutsideTouchable(true);
            f70Var.w.setClippingEnabled(true);
            f70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            f70Var.w.setFocusable(true);
            h8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            f70Var.w.setInputMethodMode(2);
            f70Var.w.getContentView().setFocusableInTouchMode(true);
            f70Var.w.showAtLocation(f70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            f70Var.w.b();
        }
    }

    @Override // org.telegram.ui.wc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        f70 f70Var = this.a;
        Location location = f70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f70Var.Q = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
