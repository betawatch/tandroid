package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b1 extends ChatActivityEnterView {
    public final /* synthetic */ f1 O6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var, Activity activity, a1 a1Var) {
        super(activity, a1Var, null, false, null);
        this.O6 = f1Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P0(float f10) {
        f1 f1Var = this.O6;
        f1Var.q1.setInputBubbleHeight(f10);
        f1Var.I0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void q0(Menu menu) {
        an.C8(menu, null, false, false, false, false);
    }
}
