// default package

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bw4 extends ChatActivityEnterView {
    public final /* synthetic */ fw4 A7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw4(fw4 fw4Var, Activity activity, aw4 aw4Var) {
        super(activity, aw4Var, null, false, null);
        this.A7 = fw4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(Menu menu) {
        yv1.E6(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(float f) {
        fw4 fw4Var = this.A7;
        fw4Var.p1.setInputBubbleHeight(f);
        fw4Var.D0();
    }
}
