// default package

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dw4 extends ChatActivityEnterView {
    public final /* synthetic */ hw4 Y7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw4(hw4 hw4Var, Activity activity, cw4 cw4Var) {
        super(activity, cw4Var, null, false, null);
        this.Y7 = hw4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void F0(Menu menu) {
        zu1.E6(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f1(float f) {
        hw4 hw4Var = this.Y7;
        hw4Var.p1.setInputBubbleHeight(f);
        hw4Var.E0();
    }
}
