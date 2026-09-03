package lh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        xn.k8(menu, null, false, false, false, false);
    }
}
