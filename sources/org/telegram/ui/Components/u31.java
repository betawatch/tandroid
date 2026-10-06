package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class u31 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new u31());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        v31 v31Var = (v31) view;
        boolean z11 = false;
        if (h61Var.r) {
            v31Var.e();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.B == -2) {
                    v31Var.b(h61Var.q, h61Var.e);
                } else {
                    v31Var.c((h61Var.y & 1) != 0, h61Var.q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h61Var.I) {
                    v31Var.a(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    v31Var.f((TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        if (e71Var != null && e71Var.j3 && v31Var.y) {
            z11 = true;
        }
        v31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v31(context, i10, d6Var);
    }
}
