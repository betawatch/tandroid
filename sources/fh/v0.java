package fh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v0 extends ChatActivityEnterView {
    public final /* synthetic */ z0 j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, Activity activity, u0 u0Var) {
        super(activity, u0Var, null, false, null);
        this.j5 = z0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void g0(Menu menu) {
        qn.k8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(float f10) {
        z0 z0Var = this.j5;
        z0Var.f.setInputBubbleHeight(f10);
        z0Var.o();
    }
}
