package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b91;
import org.telegram.ui.c91;
import org.telegram.ui.o91;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x41(int i10, Object obj, Object obj2) {
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
                b51 b51Var = (b51) this.b;
                Object obj = ((n41) this.c).G;
                zk0 zk0Var = b51Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < b51Var.x.size()) {
                        n41 G = b51Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
                        childAt = zk0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof o91) {
                                return null;
                            }
                            return (o91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof o91) {
                }
                break;
            default:
                q91 q91Var = (q91) this.b;
                c91 c91Var = (c91) this.c;
                int childCount = q91Var.O.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = q91Var.O.getChildAt(i12);
                    if (childAt2 instanceof b91) {
                        b91 b91Var = (b91) childAt2;
                        if (b91Var.r == c91Var) {
                            return b91Var;
                        }
                    }
                }
                q91Var.O.setItemAnimator(null);
                q91Var.u0.f();
                return null;
        }
    }
}
