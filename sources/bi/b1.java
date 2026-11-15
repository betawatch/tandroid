package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
