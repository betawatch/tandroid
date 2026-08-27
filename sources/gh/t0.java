package gh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends ChatActivityEnterView {
    public final /* synthetic */ x0 j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, Activity activity, s0 s0Var) {
        super(activity, s0Var, null, false, null);
        this.j5 = x0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        x0 x0Var = this.j5;
        x0Var.f.setInputBubbleHeight(f10);
        x0Var.p();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        rn.k8(menu, null, false, false, false, false);
    }
}
