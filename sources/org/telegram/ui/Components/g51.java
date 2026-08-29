package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.e91;
import org.telegram.ui.f91;
import org.telegram.ui.r91;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g51(int i10, Object obj, Object obj2) {
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
                k51 k51Var = (k51) this.b;
                Object obj = ((w41) this.c).G;
                jl0 jl0Var = k51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < k51Var.x.size()) {
                        w41 G = k51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                        childAt = jl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof r91) {
                                return null;
                            }
                            return (r91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof r91) {
                }
                break;
            default:
                t91 t91Var = (t91) this.b;
                f91 f91Var = (f91) this.c;
                int childCount = t91Var.O.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = t91Var.O.getChildAt(i12);
                    if (childAt2 instanceof e91) {
                        e91 e91Var = (e91) childAt2;
                        if (e91Var.r == f91Var) {
                            return e91Var;
                        }
                    }
                }
                t91Var.O.setItemAnimator(null);
                t91Var.u0.f();
                return null;
        }
    }
}
