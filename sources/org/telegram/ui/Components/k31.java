package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k31 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new k31());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        l31 l31Var = (l31) view;
        boolean z11 = false;
        if (g61Var.r) {
            l31Var.f();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.d == -2) {
                    l31Var.c();
                } else {
                    l31Var.d((g61Var.y & 1) != 0, g61Var.q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (g61Var.I) {
                    l31Var.b(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    l31Var.g(g61Var.x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        l31Var.L = w7.j6.a(g61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (b71Var != null && b71Var.a3 && l31Var.s) {
            z11 = true;
        }
        l31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l31(context, i10, d6Var);
    }
}
