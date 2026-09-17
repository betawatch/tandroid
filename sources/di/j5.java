package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ j5(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((q6) this.b).I1.d();
                break;
            default:
                ((rg.o0) this.b).S1.d();
                break;
        }
    }
}
