package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements org.telegram.ui.Components.bl0, yc0 {
    public final /* synthetic */ i70 a;

    public /* synthetic */ d70(i70 i70Var) {
        this.a = i70Var;
    }

    @Override // org.telegram.ui.yc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        i70 i70Var = this.a;
        Location location = i70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        i70Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.fa;
        i70 i70Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(i70Var)) {
                return;
            }
            dd0 dd0Var = new dd0(4);
            dd0Var.e0 = 0L;
            dd0Var.F0 = new d70(i70Var);
            i70Var.presentFragment(dd0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.s8) || i70Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = i70Var.w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(i70Var.getParentActivity(), null, new g(i70Var, 22), true, 1, null);
            o8Var.b(i70Var.W);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(o8Var.a, -2, -2);
            i70Var.w = n1Var2;
            n1Var2.e = true;
            n1Var2.c = 220;
            n1Var2.setOutsideTouchable(true);
            i70Var.w.setClippingEnabled(true);
            i70Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            i70Var.w.setFocusable(true);
            o8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            i70Var.w.setInputMethodMode(2);
            i70Var.w.getContentView().setFocusableInTouchMode(true);
            i70Var.w.showAtLocation(i70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            i70Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
