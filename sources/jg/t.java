package jg;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
import vh.b4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ t(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((r0) this.b).B1.d();
                break;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = ((org.telegram.ui.ActionBar.t0) this.b).Q;
                if (q0Var != null) {
                    q0Var.a();
                    break;
                }
                break;
            default:
                ((b4) this.b).r1.d();
                break;
        }
    }
}
