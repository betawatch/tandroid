package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ka1;
import org.telegram.ui.la1;
import org.telegram.ui.xa1;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ll0 ll0Var = w51Var.d;
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
                    for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                        childAt = ll0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof xa1) {
                                return null;
                            }
                            return (xa1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof xa1) {
                }
                break;
            default:
                za1 za1Var = (za1) this.b;
                la1 la1Var = (la1) this.c;
                int childCount = za1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = za1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ka1) {
                        ka1 ka1Var = (ka1) childAt2;
                        if (ka1Var.r == la1Var) {
                            return ka1Var;
                        }
                    }
                }
                za1Var.S.setItemAnimator(null);
                za1Var.y0.f();
                return null;
        }
    }
}
