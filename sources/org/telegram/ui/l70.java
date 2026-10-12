package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements org.telegram.ui.Components.bm0, id0 {
    public final /* synthetic */ p70 a;

    public /* synthetic */ l70(p70 p70Var) {
        this.a = p70Var;
    }

    @Override // org.telegram.ui.id0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        p70 p70Var = this.a;
        Location location = p70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        p70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        p70 p70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(p70Var)) {
                return;
            }
            nd0 nd0Var = new nd0(4);
            nd0Var.e0 = 0L;
            nd0Var.F0 = new l70(p70Var);
            p70Var.presentFragment(nd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || p70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = p70Var.w;
        if (m1Var == null || !m1Var.isShowing()) {
            org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(p70Var.getParentActivity(), null, new g(p70Var, 22), true, 1, null);
            s8Var.b(p70Var.W);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(s8Var.a, -2, -2);
            p70Var.w = m1Var2;
            m1Var2.e = true;
            m1Var2.c = 220;
            m1Var2.setOutsideTouchable(true);
            p70Var.w.setClippingEnabled(true);
            p70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            p70Var.w.setFocusable(true);
            s8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            p70Var.w.setInputMethodMode(2);
            p70Var.w.getContentView().setFocusableInTouchMode(true);
            p70Var.w.showAtLocation(p70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((s8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            p70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
