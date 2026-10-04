package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t31 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new t31());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        u31 u31Var = (u31) view;
        boolean z11 = false;
        if (g61Var.r) {
            u31Var.e();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.B == -2) {
                    u31Var.b(g61Var.q, g61Var.e);
                } else {
                    u31Var.c((g61Var.y & 1) != 0, g61Var.q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (g61Var.I) {
                    u31Var.a(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    u31Var.f((TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        if (c71Var != null && c71Var.j3 && u31Var.y) {
            z11 = true;
        }
        u31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u31(context, i10, d6Var);
    }
}
