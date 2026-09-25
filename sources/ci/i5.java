package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ i5(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
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
