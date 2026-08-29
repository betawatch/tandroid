package ih;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 extends ChatActivityEnterView {
    public final /* synthetic */ v0 j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, Activity activity, q0 q0Var) {
        super(activity, q0Var, null, false, null);
        this.j5 = v0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f9) {
        v0 v0Var = this.j5;
        v0Var.f.setInputBubbleHeight(f9);
        v0Var.o();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        tn.k8(menu, null, false, false, false, false);
    }
}
