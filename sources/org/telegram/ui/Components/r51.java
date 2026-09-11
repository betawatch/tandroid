package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bb1;
import org.telegram.ui.ma1;
import org.telegram.ui.na1;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                ll0 ll0Var = v51Var.d;
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
                    for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                        childAt = ll0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof za1) {
                                return null;
                            }
                            return (za1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof za1) {
                }
                break;
            default:
                bb1 bb1Var = (bb1) this.b;
                na1 na1Var = (na1) this.c;
                int childCount = bb1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = bb1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ma1) {
                        ma1 ma1Var = (ma1) childAt2;
                        if (ma1Var.r == na1Var) {
                            return ma1Var;
                        }
                    }
                }
                bb1Var.S.setItemAnimator(null);
                bb1Var.y0.f();
                return null;
        }
    }
}
