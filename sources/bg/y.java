package bg;

import android.widget.PopupWindow;
import nh.t5;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ y(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((g1) this.b).O1.d();
                break;
            default:
                ((t5) this.b).E1.d();
                break;
        }
    }
}
