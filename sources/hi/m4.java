package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ m4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((m5) this.b).s1.d();
                break;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.b).R;
                if (n0Var != null) {
                    n0Var.i();
                    break;
                }
                break;
            default:
                ((tg.g0) this.b).C1.d();
                break;
        }
    }
}
