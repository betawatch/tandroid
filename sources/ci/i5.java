package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.nw0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nw0 b;

    public /* synthetic */ i5(nw0 nw0Var, int i10) {
        this.a = i10;
        this.b = nw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((q6) this.b).I1.d();
                break;
            default:
                ((qg.m0) this.b).S1.d();
                break;
        }
    }
}
