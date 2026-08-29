package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements org.telegram.ui.Components.al0, mc0 {
    public final /* synthetic */ t60 a;

    public /* synthetic */ o60(t60 t60Var) {
        this.a = t60Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.y9;
        t60 t60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(t60Var)) {
                return;
            }
            rc0 rc0Var = new rc0(4);
            rc0Var.a0 = 0L;
            rc0Var.B0 = new o60(t60Var);
            t60Var.presentFragment(rc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.m8) || t60Var.L == 5) {
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = t60Var.w;
        if (o1Var == null || !o1Var.isShowing()) {
            org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(t60Var.getParentActivity(), null, new h(t60Var, 22), true, 1, null);
            m8Var.b(t60Var.S);
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(m8Var.a, -2, -2);
            t60Var.w = o1Var2;
            o1Var2.e = true;
            o1Var2.c = 220;
            o1Var2.setOutsideTouchable(true);
            t60Var.w.setClippingEnabled(true);
            t60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            t60Var.w.setFocusable(true);
            m8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            t60Var.w.setInputMethodMode(2);
            t60Var.w.getContentView().setFocusableInTouchMode(true);
            t60Var.w.showAtLocation(t60Var.getFragmentView(), 0, (int) (view.getX() + f9), (int) ((m8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            t60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        t60 t60Var = this.a;
        Location location = t60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        t60Var.P = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
