package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                Object obj = ((org.telegram.ui.Components.x31) this.c).G;
                org.telegram.ui.Components.pj0 pj0Var = m41Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < m41Var.D.size()) {
                        org.telegram.ui.Components.x31 G = m41Var.G(i7);
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
                            if (childAt instanceof c51) {
                                return null;
                            }
                            return (c51) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof c51) {
                }
                break;
            default:
                e51 e51Var = (e51) this.b;
                q41 q41Var = (q41) this.c;
                int childCount = e51Var.S.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = e51Var.S.getChildAt(i11);
                    if (childAt2 instanceof o41) {
                        o41 o41Var = (o41) childAt2;
                        if (o41Var.r == q41Var) {
                            return o41Var;
                        }
                    }
                }
                e51Var.S.setItemAnimator(null);
                e51Var.B0.f();
                return null;
        }
    }
}
