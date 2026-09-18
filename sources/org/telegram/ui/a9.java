package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a9 extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, o2Var, frameLayout, false, f6Var);
        this.P0 = i10;
        this.Q0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                m9 m9Var = (m9) this.Q0;
                m9Var.M.i(m9Var.N, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.Q0;
                gjVar.x.i(gjVar.y, i10 == 0, true);
                break;
            default:
                fg1 fg1Var = (fg1) this.Q0;
                fg1Var.U0.i(fg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(fg1 fg1Var, Context context, fg1 fg1Var2) {
        super(context, fg1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = fg1Var;
    }
}
