package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ab1;
import org.telegram.ui.la1;
import org.telegram.ui.ma1;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ml0 ml0Var = x51Var.d;
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
                    for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                        childAt = ml0Var.getChildAt(i11);
                        int S = RecyclerView.S(childAt);
                        if (S != -1 && S == i10) {
                            if (childAt instanceof ya1) {
                                return null;
                            }
                            return (ya1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof ya1) {
                }
                break;
            default:
                ab1 ab1Var = (ab1) this.b;
                ma1 ma1Var = (ma1) this.c;
                int childCount = ab1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = ab1Var.S.getChildAt(i12);
                    if (childAt2 instanceof la1) {
                        la1 la1Var = (la1) childAt2;
                        if (la1Var.r == ma1Var) {
                            return la1Var;
                        }
                    }
                }
                ab1Var.S.setItemAnimator(null);
                ab1Var.y0.f();
                return null;
        }
    }
}
