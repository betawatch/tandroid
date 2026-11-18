package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b1 extends ChatActivityEnterView {
    public final /* synthetic */ g1 o7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(g1 g1Var, Activity activity, a1 a1Var) {
        super(activity, a1Var, null, false, null);
        this.o7 = g1Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void X0(float f10) {
        g1 g1Var = this.o7;
        g1Var.q1.setInputBubbleHeight(f10);
        g1Var.J0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(Menu menu) {
        bn.C8(menu, null, false, false, false, false);
    }
}
