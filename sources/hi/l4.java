package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ l4(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((l5) this.b).s1.d();
                break;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.b).R;
                if (o0Var != null) {
                    o0Var.j();
                    break;
                }
                break;
            default:
                ((tg.g0) this.b).C1.d();
                break;
        }
    }
}
