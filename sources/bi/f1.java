package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f1 extends ChatActivityEnterView {
    public final /* synthetic */ k1 t7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, Activity activity, e1 e1Var) {
        super(activity, e1Var, null, false, null);
        this.t7 = k1Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(Menu menu) {
        bn.C8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void b1(float f10) {
        k1 k1Var = this.t7;
        k1Var.q1.setInputBubbleHeight(f10);
        k1Var.J0();
    }
}
