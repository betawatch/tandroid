package kh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q0 extends ChatActivityEnterView {
    public final /* synthetic */ u0 k5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, Activity activity, p0 p0Var) {
        super(activity, p0Var, null, false, null);
        this.k5 = u0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        u0 u0Var = this.k5;
        u0Var.f.setInputBubbleHeight(f10);
        u0Var.o();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        zn.k8(menu, null, false, false, false, false);
    }
}
