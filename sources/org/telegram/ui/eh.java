package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements org.telegram.messenger.r10 {
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
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                return an.u0((an) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) this.b;
                Object obj = ((org.telegram.ui.Components.b41) this.c).G;
                org.telegram.ui.Components.uj0 uj0Var = p41Var.d;
                int i7 = 0;
                while (true) {
                    if (i7 < p41Var.E.size()) {
                        org.telegram.ui.Components.b41 G = p41Var.G(i7);
                        if (G == null || G.G != obj) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 != -1) {
                    for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                        childAt = uj0Var.getChildAt(i10);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i7) {
                            if (childAt instanceof x41) {
                                return null;
                            }
                            return (x41) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof x41) {
                }
                break;
            default:
                z41 z41Var = (z41) this.b;
                l41 l41Var = (l41) this.c;
                int childCount = z41Var.T.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = z41Var.T.getChildAt(i11);
                    if (childAt2 instanceof k41) {
                        k41 k41Var = (k41) childAt2;
                        if (k41Var.r == l41Var) {
                            return k41Var;
                        }
                    }
                }
                z41Var.T.setItemAnimator(null);
                z41Var.C0.f();
                return null;
        }
    }
}
