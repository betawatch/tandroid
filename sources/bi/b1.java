package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
