package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.la1;
import org.telegram.ui.na1;
import org.telegram.ui.y91;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                Object obj = ((h51) this.c).G;
                sl0 sl0Var = w51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < w51Var.x.size()) {
                        h51 G = w51Var.G(i10);
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
                            if (childAt instanceof la1) {
                                return null;
                            }
                            return (la1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof la1) {
                }
                break;
            default:
                na1 na1Var = (na1) this.b;
                z91 z91Var = (z91) this.c;
                int childCount = na1Var.P.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = na1Var.P.getChildAt(i12);
                    if (childAt2 instanceof y91) {
                        y91 y91Var = (y91) childAt2;
                        if (y91Var.r == z91Var) {
                            return y91Var;
                        }
                    }
                }
                na1Var.P.setItemAnimator(null);
                na1Var.v0.f();
                return null;
        }
    }
}
