package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.fa1;
import org.telegram.ui.ha1;
import org.telegram.ui.s91;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t51(int i10, Object obj, Object obj2) {
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
                x51 x51Var = (x51) this.b;
                Object obj = ((j51) this.c).G;
                tl0 tl0Var = x51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < x51Var.x.size()) {
                        j51 G = x51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < tl0Var.getChildCount(); i11++) {
                        childAt = tl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof fa1) {
                                return null;
                            }
                            return (fa1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof fa1) {
                }
                break;
            default:
                ha1 ha1Var = (ha1) this.b;
                t91 t91Var = (t91) this.c;
                int childCount = ha1Var.P.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = ha1Var.P.getChildAt(i12);
                    if (childAt2 instanceof s91) {
                        s91 s91Var = (s91) childAt2;
                        if (s91Var.r == t91Var) {
                            return s91Var;
                        }
                    }
                }
                ha1Var.P.setItemAnimator(null);
                ha1Var.v0.f();
                return null;
        }
    }
}
