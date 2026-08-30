package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u21 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new u21());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        v21 v21Var = (v21) view;
        boolean z10 = false;
        if (i51Var.r) {
            v21Var.e();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.B == -2) {
                    v21Var.b(i51Var.q, i51Var.e);
                } else {
                    v21Var.c((i51Var.y & 1) != 0, i51Var.q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (i51Var.I) {
                    v21Var.a(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    v21Var.f((TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (g61Var != null && g61Var.Z2 && v21Var.y) {
            z10 = true;
        }
        v21Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v21(context, i10, f6Var);
    }
}
