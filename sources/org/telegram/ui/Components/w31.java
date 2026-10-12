package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w31 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new w31());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        x31 x31Var = (x31) view;
        boolean z11 = false;
        if (l61Var.r) {
            x31Var.e();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.B == -2) {
                    x31Var.b(l61Var.q, l61Var.e);
                } else {
                    x31Var.c((l61Var.y & 1) != 0, l61Var.q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (l61Var.I) {
                    x31Var.a(l61Var.x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    x31Var.f((TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        if (h71Var != null && h71Var.a3 && x31Var.y) {
            z11 = true;
        }
        x31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x31(context, i10, c6Var);
    }
}
