package lh;

import android.widget.PopupWindow;
import org.telegram.ui.Components.av0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ av0 b;

    public /* synthetic */ y4(av0 av0Var, int i10) {
        this.a = i10;
        this.b = av0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((f6) this.b).E1.d();
                break;
            default:
                ((zf.l0) this.b).O1.d();
                break;
        }
    }
}
