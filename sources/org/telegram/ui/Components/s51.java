package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.aa1;
import org.telegram.ui.ma1;
import org.telegram.ui.oa1;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                rl0 rl0Var = w51Var.d;
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
                    for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                        childAt = rl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof ma1) {
                                return null;
                            }
                            return (ma1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof ma1) {
                }
                break;
            default:
                oa1 oa1Var = (oa1) this.b;
                aa1 aa1Var = (aa1) this.c;
                int childCount = oa1Var.P.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = oa1Var.P.getChildAt(i12);
                    if (childAt2 instanceof z91) {
                        z91 z91Var = (z91) childAt2;
                        if (z91Var.r == aa1Var) {
                            return z91Var;
                        }
                    }
                }
                oa1Var.P.setItemAnimator(null);
                oa1Var.v0.f();
                return null;
        }
    }
}
