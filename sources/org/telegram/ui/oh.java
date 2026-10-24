package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                return sn.p0((sn) this.b, (Context) this.c);
            case 1:
                org.telegram.ui.Components.b71 b71Var = (org.telegram.ui.Components.b71) this.b;
                Object obj = ((org.telegram.ui.Components.m61) this.c).G;
                org.telegram.ui.Components.mm0 mm0Var = b71Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < b71Var.y.size()) {
                        org.telegram.ui.Components.m61 G = b71Var.G(i10);
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
                            if (childAt instanceof s91) {
                                return null;
                            }
                            return (s91) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof s91) {
                }
                break;
            default:
                u91 u91Var = (u91) this.b;
                g91 g91Var = (g91) this.c;
                int childCount = u91Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = u91Var.S.getChildAt(i12);
                    if (childAt2 instanceof f91) {
                        f91 f91Var = (f91) childAt2;
                        if (f91Var.r == g91Var) {
                            return f91Var;
                        }
                    }
                }
                u91Var.S.setItemAnimator(null);
                u91Var.y0.f();
                return null;
        }
    }
}
