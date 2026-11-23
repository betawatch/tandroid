package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ k4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((k5) this.b).s1.d();
                break;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.b).R;
                if (n0Var != null) {
                    n0Var.j();
                    break;
                }
                break;
            default:
                ((tg.h0) this.b).C1.d();
                break;
        }
    }
}
