package kh;

import android.widget.PopupWindow;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ a5(yu0 yu0Var, int i9) {
        this.a = i9;
        this.b = yu0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((g6) this.b).E1.d();
                break;
            default:
                ((yf.l0) this.b).O1.d();
                break;
        }
    }
}
