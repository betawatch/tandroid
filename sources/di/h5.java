package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw0 b;

    public /* synthetic */ h5(pw0 pw0Var, int i10) {
        this.a = i10;
        this.b = pw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((o6) this.b).I1.d();
                break;
            default:
                ((rg.o0) this.b).S1.d();
                break;
        }
    }
}
