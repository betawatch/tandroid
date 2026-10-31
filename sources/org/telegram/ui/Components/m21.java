package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m21 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new m21());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        n21 n21Var = (n21) view;
        boolean z11 = false;
        if (a51Var.r) {
            n21Var.e();
        } else {
            Object obj = a51Var.G;
            if (obj == null) {
                if (a51Var.B == -2) {
                    n21Var.b(a51Var.q, a51Var.e);
                } else {
                    n21Var.c((a51Var.y & 1) != 0, a51Var.q, a51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (a51Var.I) {
                    n21Var.a(a51Var.x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                } else {
                    n21Var.f((TLRPC.TL_forumTopic) obj, a51Var.e);
                }
            }
        }
        if (u51Var != null && u51Var.j3 && n21Var.E) {
            z11 = true;
        }
        n21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new n21(i10, context, p6Var);
    }
}
