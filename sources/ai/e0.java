package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
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
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.b;
                r0Var.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (h1Var = r0Var.d) != null && h1Var.isShowing()) {
                    r0Var.d.d(true);
                    break;
                }
                break;
        }
        return true;
    }
}
