package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ea1;
import org.telegram.ui.ga1;
import org.telegram.ui.r91;
import org.telegram.ui.s91;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s51(int i10, Object obj, Object obj2) {
        this.a = i10;
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
                w51 w51Var = (w51) this.b;
                Object obj = ((i51) this.c).G;
                sl0 sl0Var = w51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < w51Var.x.size()) {
                        i51 G = w51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                        childAt = sl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof ea1) {
                                return null;
                            }
                            return (ea1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof ea1) {
                }
                break;
            default:
                ga1 ga1Var = (ga1) this.b;
                s91 s91Var = (s91) this.c;
                int childCount = ga1Var.P.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = ga1Var.P.getChildAt(i12);
                    if (childAt2 instanceof r91) {
                        r91 r91Var = (r91) childAt2;
                        if (r91Var.r == s91Var) {
                            return r91Var;
                        }
                    }
                }
                ga1Var.P.setItemAnimator(null);
                ga1Var.v0.f();
                return null;
        }
    }
}
