package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return cn.u0((cn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) this.b;
                Object obj = ((org.telegram.ui.Components.y31) this.c).G;
                org.telegram.ui.Components.qj0 qj0Var = m41Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < m41Var.D.size()) {
                        org.telegram.ui.Components.y31 G = m41Var.G(i7);
                        if (G == null || G.G != obj) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 != -1) {
                    for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
                        childAt = qj0Var.getChildAt(i10);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i7) {
                            if (childAt instanceof b51) {
                                return null;
                            }
                            return (b51) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof b51) {
                }
                break;
            default:
                d51 d51Var = (d51) this.b;
                p41 p41Var = (p41) this.c;
                int childCount = d51Var.S.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = d51Var.S.getChildAt(i11);
                    if (childAt2 instanceof n41) {
                        n41 n41Var = (n41) childAt2;
                        if (n41Var.r == p41Var) {
                            return n41Var;
                        }
                    }
                }
                d51Var.S.setItemAnimator(null);
                d51Var.B0.f();
                return null;
        }
    }
}
