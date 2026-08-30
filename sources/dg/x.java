package dg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.rv0;
import ph.c5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ x(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((e1) this.b).P1.d();
                break;
            default:
                ((c5) this.b).F1.d();
                break;
        }
    }
}
