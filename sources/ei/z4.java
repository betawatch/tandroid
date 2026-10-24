package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw0 b;

    public /* synthetic */ z4(pw0 pw0Var, int i10) {
        this.a = i10;
        this.b = pw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((f6) this.b).I1.d();
                break;
            default:
                ((rg.m0) this.b).S1.d();
                break;
        }
    }
}
