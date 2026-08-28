package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d91;
import org.telegram.ui.e91;
import org.telegram.ui.q91;
import org.telegram.ui.s91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v41(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback0Return
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                z41 z41Var = (z41) this.b;
                Object obj = ((l41) this.c).G;
                wk0 wk0Var = z41Var.d;
                int i9 = 0;
                while (true) {
                    if (i9 < z41Var.x.size()) {
                        l41 G = z41Var.G(i9);
                        if (G == null || G.G != obj) {
                            i9++;
                        }
                    } else {
                        i9 = -1;
                    }
                }
                if (i9 != -1) {
                    for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                        childAt = wk0Var.getChildAt(i10);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i9) {
                            if (childAt instanceof q91) {
                                return null;
                            }
                            return (q91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof q91) {
                }
                break;
            default:
                s91 s91Var = (s91) this.b;
                e91 e91Var = (e91) this.c;
                int childCount = s91Var.O.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = s91Var.O.getChildAt(i11);
                    if (childAt2 instanceof d91) {
                        d91 d91Var = (d91) childAt2;
                        if (d91Var.r == e91Var) {
                            return d91Var;
                        }
                    }
                }
                s91Var.O.setItemAnimator(null);
                s91Var.u0.f();
                return null;
        }
    }
}
