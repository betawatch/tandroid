package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
