package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b9 extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, p2Var, frameLayout, false, f6Var);
        this.K0 = i10;
        this.L0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                n9 n9Var = (n9) this.L0;
                n9Var.J.i(n9Var.K, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.L0;
                wiVar.x.i(wiVar.y, i10 == 0, true);
                break;
            default:
                sf1 sf1Var = (sf1) this.L0;
                sf1Var.R0.i(sf1Var.C0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(sf1 sf1Var, Context context, sf1 sf1Var2) {
        super(context, sf1Var2, null, false, null);
        this.K0 = 2;
        this.L0 = sf1Var;
    }
}
