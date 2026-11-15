package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ d0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.a) {
            case 0:
                bi.x0 x0Var = (bi.x0) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        x0Var.c(null);
                    }
                    break;
                }
                break;
            case 1:
                bi.x0 x0Var2 = (bi.x0) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        x0Var2.c(null);
                    }
                    break;
                }
                break;
            case 2:
                bi.x0 x0Var3 = (bi.x0) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        x0Var3.c(null);
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.b;
                q0Var.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
                    q0Var.d.d(true);
                    break;
                }
                break;
        }
        return true;
    }
}
