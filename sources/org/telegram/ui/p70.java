package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ p70(LaunchActivity launchActivity, int i3) {
        this.a = i3;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.d2 lastFragment;
        int i3 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i3) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.r0 != null && booleanValue && org.telegram.messenger.lc.c() < 100 && (lastFragment = launchActivity.r0.getLastFragment()) != null && !(lastFragment instanceof t90)) {
                    int b10 = org.telegram.messenger.lc.b();
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(lastFragment);
                    org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String M0 = org.telegram.messenger.bd.M0(2131748723, null);
                    String a03 = org.telegram.messenger.bd.a0("LowPowerEnabledSubtitle", null, 2131748724, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.bd.M0(2131751436, null);
                    m60 m60Var = new m60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.c;
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(W, e6Var);
                    xbVar.a.setImageDrawable(m9Var);
                    xbVar.b.setText(M0);
                    xbVar.c.setText(a03);
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), e6Var, true);
                    ybVar.e(M02);
                    ybVar.b = m60Var;
                    xbVar.setButton(ybVar);
                    org.telegram.ui.Components.ac b11 = a02.b(xbVar, 2750);
                    b11.j = 5000;
                    b11.j();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.E1;
                org.telegram.messenger.hp.s1(launchActivity.P).x3(null, user, null, 0, null, false, false);
                break;
        }
    }
}
