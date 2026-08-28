package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v31 {
    public final /* synthetic */ e41 a;
    public final /* synthetic */ h41 b;

    public v31(h41 h41Var, e41 e41Var) {
        this.b = h41Var;
        this.a = e41Var;
    }

    public final int a() {
        return this.b.s.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10) {
        h41 h41Var = this.b;
        x31 x31Var = h41Var.n;
        if (z10) {
            f2.r0 adapter = x31Var.getAdapter();
            of.y1 y1Var = h41Var.v;
            if (adapter != y1Var) {
                x31Var.setAdapter(y1Var);
                if (x31Var.getAdapter().h() <= 0) {
                    h41Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-x31Var.getPaddingTop()) + h41Var.A, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        f2.r0 adapter2 = x31Var.getAdapter();
        g41 g41Var = h41Var.s;
        if (adapter2 == g41Var) {
            return;
        }
        x31Var.setAdapter(g41Var);
        if (x31Var.getAdapter().h() <= 0) {
        }
    }
}
