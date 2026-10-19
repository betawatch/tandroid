package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p31 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new p31());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        q31 q31Var = (q31) view;
        boolean z11 = false;
        if (g61Var.r) {
            q31Var.e();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.B == -2) {
                    q31Var.b(g61Var.q, g61Var.e);
                } else {
                    q31Var.c((g61Var.y & 1) != 0, g61Var.q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (g61Var.I) {
                    q31Var.a(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    q31Var.f((TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        if (b71Var != null && b71Var.a3 && q31Var.y) {
            z11 = true;
        }
        q31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q31(context, i10, d6Var);
    }
}
