package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ b0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.a) {
            case 0:
                bi.b1 b1Var = (bi.b1) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        LinearLayout linearLayout = b1Var.e;
                        if (linearLayout == null || b1Var.O) {
                            b1Var.c(null);
                        } else {
                            b1Var.e = null;
                            b1Var.h(linearLayout, false);
                        }
                    }
                    break;
                }
                break;
            case 1:
                bi.b1 b1Var2 = (bi.b1) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        b1Var2.c(null);
                    }
                    break;
                }
                break;
            case 2:
                bi.b1 b1Var3 = (bi.b1) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        b1Var3.c(null);
                    }
                    break;
                }
                break;
            case 3:
                bi.b1 b1Var4 = (bi.b1) this.b;
                if (i7 == 4) {
                    if (keyEvent.getAction() == 1) {
                        b1Var4.c(null);
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
