package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d61 {
    public final /* synthetic */ m61 a;
    public final /* synthetic */ p61 b;

    public d61(p61 p61Var, m61 m61Var) {
        this.b = p61Var;
        this.a = m61Var;
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
        p61 p61Var = this.b;
        f61 f61Var = p61Var.n;
        if (z10) {
            s4.h0 adapter = f61Var.getAdapter();
            ig.d2 d2Var = p61Var.v;
            if (adapter != d2Var) {
                f61Var.setAdapter(d2Var);
                if (f61Var.getAdapter().h() <= 0) {
                    p61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-f61Var.getPaddingTop()) + p61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = f61Var.getAdapter();
        o61 o61Var = p61Var.s;
        if (adapter2 == o61Var) {
            return;
        }
        f61Var.setAdapter(o61Var);
        if (f61Var.getAdapter().h() <= 0) {
        }
    }
}
