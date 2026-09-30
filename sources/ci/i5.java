package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.dw0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw0 b;

    public /* synthetic */ i5(dw0 dw0Var, int i10) {
        this.a = i10;
        this.b = dw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((q6) this.b).I1.d();
                break;
            default:
                ((qg.n0) this.b).S1.d();
                break;
        }
    }
}
