package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw0 b;

    public /* synthetic */ j5(cw0 cw0Var, int i10) {
        this.a = i10;
        this.b = cw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((r6) this.b).I1.d();
                break;
            default:
                ((qg.m0) this.b).S1.d();
                break;
        }
    }
}
