package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements org.telegram.messenger.m10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.m10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return wm.r0((wm) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) this.b;
                Object obj = ((org.telegram.ui.Components.r31) this.c).G;
                org.telegram.ui.Components.tj0 tj0Var = f41Var.d;
                int i3 = 0;
                while (true) {
                    if (i3 < f41Var.E.size()) {
                        org.telegram.ui.Components.r31 G = f41Var.G(i3);
                        if (G == null || G.G != obj) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (i3 != -1) {
                    for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                        childAt = tj0Var.getChildAt(i10);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i3) {
                            if (childAt instanceof p41) {
                                return null;
                            }
                            return (p41) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof p41) {
                }
                break;
            default:
                r41 r41Var = (r41) this.b;
                d41 d41Var = (d41) this.c;
                int childCount = r41Var.T.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = r41Var.T.getChildAt(i11);
                    if (childAt2 instanceof c41) {
                        c41 c41Var = (c41) childAt2;
                        if (c41Var.r == d41Var) {
                            return c41Var;
                        }
                    }
                }
                r41Var.T.setItemAnimator(null);
                r41Var.C0.f();
                return null;
        }
    }
}
