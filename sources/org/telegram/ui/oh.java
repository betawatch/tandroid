package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh(int i10, Object obj, Object obj2) {
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
                return qn.p0((qn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) this.b;
                Object obj = ((org.telegram.ui.Components.h61) this.c).G;
                org.telegram.ui.Components.jm0 jm0Var = u61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < u61Var.x.size()) {
                        org.telegram.ui.Components.h61 G = u61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
                        childAt = jm0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof n91) {
                                return null;
                            }
                            return (n91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof n91) {
                }
                break;
            default:
                p91 p91Var = (p91) this.b;
                b91 b91Var = (b91) this.c;
                int childCount = p91Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = p91Var.S.getChildAt(i12);
                    if (childAt2 instanceof a91) {
                        a91 a91Var = (a91) childAt2;
                        if (a91Var.r == b91Var) {
                            return a91Var;
                        }
                    }
                }
                p91Var.S.setItemAnimator(null);
                p91Var.y0.f();
                return null;
        }
    }
}
