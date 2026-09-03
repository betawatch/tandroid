package eg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.rv0;
import qh.a5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ w(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((c1) this.b).P1.d();
                break;
            default:
                ((a5) this.b).F1.d();
                break;
        }
    }
}
