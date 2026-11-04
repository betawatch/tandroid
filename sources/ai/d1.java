package ai;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d1 extends ChatActivityEnterView {
    public final /* synthetic */ i1 u5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i1 i1Var, Activity activity, c1 c1Var) {
        super(activity, c1Var, null, false, null);
        this.u5 = i1Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        wm.A8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(float f10) {
        i1 i1Var = this.u5;
        i1Var.n1.setInputBubbleHeight(f10);
        i1Var.I0();
    }
}
