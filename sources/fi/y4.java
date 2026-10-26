package fi;

import android.widget.PopupWindow;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww0 b;

    public /* synthetic */ y4(ww0 ww0Var, int i10) {
        this.a = i10;
        this.b = ww0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((e6) this.b).x1.d();
                break;
            default:
                ((sg.n0) this.b).H1.d();
                break;
        }
    }
}
