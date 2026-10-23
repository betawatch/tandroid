package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements org.telegram.ui.Components.yl0, ic0 {
    public final /* synthetic */ s60 a;

    public /* synthetic */ n60(s60 s60Var) {
        this.a = s60Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ic0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        s60 s60Var = this.a;
        Location location = s60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        s60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.yl0
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        s60 s60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(s60Var)) {
                return;
            }
            nc0 nc0Var = new nc0(4);
            nc0Var.e0 = 0L;
            nc0Var.F0 = new n60(s60Var);
            s60Var.presentFragment(nc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.q8) || s60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = s60Var.w;
        if (m1Var == null || !m1Var.isShowing()) {
            org.telegram.ui.Components.p8 p8Var = new org.telegram.ui.Components.p8(s60Var.getParentActivity(), null, new g(s60Var, 22), true, 1, null);
            p8Var.b(s60Var.W);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(p8Var.a, -2, -2);
            s60Var.w = m1Var2;
            m1Var2.e = true;
            m1Var2.c = 220;
            m1Var2.setOutsideTouchable(true);
            s60Var.w.setClippingEnabled(true);
            s60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            s60Var.w.setFocusable(true);
            p8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            s60Var.w.setInputMethodMode(2);
            s60Var.w.getContentView().setFocusableInTouchMode(true);
            s60Var.w.showAtLocation(s60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((p8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            s60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
