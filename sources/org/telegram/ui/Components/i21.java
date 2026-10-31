package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i21 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new i21());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        j21 j21Var = (j21) view;
        boolean z11 = false;
        if (a51Var.r) {
            j21Var.f();
        } else {
            Object obj = a51Var.G;
            if (obj == null) {
                if (a51Var.d == -2) {
                    j21Var.c();
                } else {
                    j21Var.d((a51Var.y & 1) != 0, a51Var.q, a51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (a51Var.I) {
                    j21Var.b(a51Var.x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                } else {
                    j21Var.g(a51Var.x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                }
            }
        }
        j21Var.L = v7.u7.a(a51Var.y, 8) ? org.telegram.messenger.i0.L(10.0f) : 0;
        if (u51Var != null && u51Var.j3 && j21Var.s) {
            z11 = true;
        }
        j21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new j21(i10, context, p6Var);
    }
}
