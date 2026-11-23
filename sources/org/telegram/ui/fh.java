package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements org.telegram.messenger.o10 {
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
    @Override // org.telegram.messenger.o10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return bn.u0((bn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) this.b;
                Object obj = ((org.telegram.ui.Components.n41) this.c).H;
                org.telegram.ui.Components.ek0 ek0Var = b51Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < b51Var.E.size()) {
                        org.telegram.ui.Components.n41 G = b51Var.G(i7);
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
                            if (childAt instanceof z41) {
                                return null;
                            }
                            return (z41) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof z41) {
                }
                break;
            default:
                b51 b51Var2 = (b51) this.b;
                n41 n41Var = (n41) this.c;
                int childCount = b51Var2.T.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = b51Var2.T.getChildAt(i11);
                    if (childAt2 instanceof m41) {
                        m41 m41Var = (m41) childAt2;
                        if (m41Var.r == n41Var) {
                            return m41Var;
                        }
                    }
                }
                b51Var2.T.setItemAnimator(null);
                b51Var2.C0.f();
                return null;
        }
    }
}
