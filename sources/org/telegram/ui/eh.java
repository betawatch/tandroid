package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return bn.u0((bn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) this.b;
                Object obj = ((org.telegram.ui.Components.l41) this.c).H;
                org.telegram.ui.Components.ck0 ck0Var = z41Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < z41Var.E.size()) {
                        org.telegram.ui.Components.l41 G = z41Var.G(i7);
                        if (G == null || G.H != obj) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 != -1) {
                    for (int i10 = 0; i10 < ck0Var.getChildCount(); i10++) {
                        childAt = ck0Var.getChildAt(i10);
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
                c51 c51Var = (c51) this.b;
                o41 o41Var = (o41) this.c;
                int childCount = c51Var.T.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = c51Var.T.getChildAt(i11);
                    if (childAt2 instanceof n41) {
                        n41 n41Var = (n41) childAt2;
                        if (n41Var.r == o41Var) {
                            return n41Var;
                        }
                    }
                }
                c51Var.T.setItemAnimator(null);
                c51Var.C0.f();
                return null;
        }
    }
}
