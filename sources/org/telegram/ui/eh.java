package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements org.telegram.messenger.u10 {
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
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return an.r0((an) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) this.b;
                Object obj = ((org.telegram.ui.Components.x31) this.c).G;
                org.telegram.ui.Components.pj0 pj0Var = l41Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < l41Var.D.size()) {
                        org.telegram.ui.Components.x31 G = l41Var.G(i7);
                        if (G == null || G.G != obj) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 != -1) {
                    for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                        childAt = pj0Var.getChildAt(i10);
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
                int childCount = c51Var.S.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = c51Var.S.getChildAt(i11);
                    if (childAt2 instanceof m41) {
                        m41 m41Var = (m41) childAt2;
                        if (m41Var.r == o41Var) {
                            return m41Var;
                        }
                    }
                }
                c51Var.S.setItemAnimator(null);
                c51Var.B0.f();
                return null;
        }
    }
}
