package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.kw0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ z4(kw0 kw0Var, int i10) {
        this.a = i10;
        this.b = kw0Var;
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
