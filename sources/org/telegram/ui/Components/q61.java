package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ga1;
import org.telegram.ui.ha1;
import org.telegram.ui.ta1;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class q61 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q61(int i10, Object obj, Object obj2) {
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
                u61 u61Var = (u61) this.b;
                Object obj = ((g61) this.c).G;
                zl0 zl0Var = u61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < u61Var.x.size()) {
                        g61 G = u61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                        childAt = zl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof ta1) {
                                return null;
                            }
                            return (ta1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof ta1) {
                }
                break;
            default:
                va1 va1Var = (va1) this.b;
                ha1 ha1Var = (ha1) this.c;
                int childCount = va1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = va1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ga1) {
                        ga1 ga1Var = (ga1) childAt2;
                        if (ga1Var.r == ha1Var) {
                            return ga1Var;
                        }
                    }
                }
                va1Var.S.setItemAnimator(null);
                va1Var.B0.f();
                return null;
        }
    }
}
