package fi;

import android.widget.PopupWindow;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ y4(xw0 xw0Var, int i10) {
        this.a = i10;
        this.b = xw0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((e6) this.b).x1.d();
                break;
            default:
                ((sg.m0) this.b).H1.d();
                break;
        }
    }
}
