package eg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.sv0;
import qh.b5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ w(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((c1) this.b).P1.d();
                break;
            default:
                ((b5) this.b).F1.d();
                break;
        }
    }
}
