package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z31 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new z31());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        a41 a41Var = (a41) view;
        boolean z11 = false;
        if (u61Var.r) {
            a41Var.f();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.d == -2) {
                    a41Var.c();
                } else {
                    a41Var.d((u61Var.y & 1) != 0, u61Var.q, u61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (u61Var.I) {
                    a41Var.b(u61Var.x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                } else {
                    a41Var.g(u61Var.x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                }
            }
        }
        a41Var.L = a8.pf.a(u61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (s71Var != null && s71Var.k3 && a41Var.s) {
            z11 = true;
        }
        a41Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a41(context, i10, u6Var);
    }
}
