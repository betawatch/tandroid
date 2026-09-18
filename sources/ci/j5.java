package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ j5(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
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
