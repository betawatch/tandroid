package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi(int i10, Object obj, Object obj2) {
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
                return fo.p0((fo) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.z61 z61Var = (org.telegram.ui.Components.z61) this.b;
                Object obj = ((org.telegram.ui.Components.l61) this.c).G;
                org.telegram.ui.Components.mm0 mm0Var = z61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < z61Var.x.size()) {
                        org.telegram.ui.Components.l61 G = z61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                        childAt = mm0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof fb1) {
                                return null;
                            }
                            return (fb1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof fb1) {
                }
                break;
            default:
                hb1 hb1Var = (hb1) this.b;
                ta1 ta1Var = (ta1) this.c;
                int childCount = hb1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = hb1Var.S.getChildAt(i12);
                    if (childAt2 instanceof sa1) {
                        sa1 sa1Var = (sa1) childAt2;
                        if (sa1Var.r == ta1Var) {
                            return sa1Var;
                        }
                    }
                }
                hb1Var.S.setItemAnimator(null);
                hb1Var.y0.f();
                return null;
        }
    }
}
