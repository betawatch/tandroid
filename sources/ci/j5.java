package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ j5(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((r6) this.b).I1.d();
                break;
            default:
                ((qg.p0) this.b).S1.d();
                break;
        }
    }
}
