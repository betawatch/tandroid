package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
