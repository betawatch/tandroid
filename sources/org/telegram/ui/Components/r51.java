package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ca1;
import org.telegram.ui.da1;
import org.telegram.ui.pa1;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r51(int i10, Object obj, Object obj2) {
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
                v51 v51Var = (v51) this.b;
                Object obj = ((h51) this.c).G;
                ml0 ml0Var = v51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < v51Var.x.size()) {
                        h51 G = v51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                        childAt = ml0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof pa1) {
                                return null;
                            }
                            return (pa1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof pa1) {
                }
                break;
            default:
                ra1 ra1Var = (ra1) this.b;
                da1 da1Var = (da1) this.c;
                int childCount = ra1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = ra1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ca1) {
                        ca1 ca1Var = (ca1) childAt2;
                        if (ca1Var.r == da1Var) {
                            return ca1Var;
                        }
                    }
                }
                ra1Var.S.setItemAnimator(null);
                ra1Var.y0.f();
                return null;
        }
    }
}
