package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class p31 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new p31());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        q31 q31Var = (q31) view;
        boolean z11 = false;
        if (g61Var.r) {
            q31Var.f();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.d == -2) {
                    q31Var.c();
                } else {
                    q31Var.d((g61Var.y & 1) != 0, g61Var.q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (g61Var.I) {
                    q31Var.b(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    q31Var.g(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        q31Var.L = w7.e0.a(g61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (c71Var != null && c71Var.j3 && q31Var.s) {
            z11 = true;
        }
        q31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q31(context, i10, d6Var);
    }
}
