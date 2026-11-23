package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fh(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return bn.u0((bn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) this.b;
                Object obj = ((org.telegram.ui.Components.o41) this.c).H;
                org.telegram.ui.Components.ek0 ek0Var = c51Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < c51Var.E.size()) {
                        org.telegram.ui.Components.o41 G = c51Var.G(i7);
                        if (G == null || G.H != obj) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 != -1) {
                    for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                        childAt = ek0Var.getChildAt(i10);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i7) {
                            if (childAt instanceof a51) {
                                return null;
                            }
                            return (a51) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof a51) {
                }
                break;
            default:
                c51 c51Var2 = (c51) this.b;
                o41 o41Var = (o41) this.c;
                int childCount = c51Var2.T.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = c51Var2.T.getChildAt(i11);
                    if (childAt2 instanceof n41) {
                        n41 n41Var = (n41) childAt2;
                        if (n41Var.r == o41Var) {
                            return n41Var;
                        }
                    }
                }
                c51Var2.T.setItemAnimator(null);
                c51Var2.C0.f();
                return null;
        }
    }
}
