package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v21 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new v21());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        w21 w21Var = (w21) view;
        boolean z10 = false;
        if (j51Var.r) {
            w21Var.e();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.B == -2) {
                    w21Var.b(j51Var.q, j51Var.e);
                } else {
                    w21Var.c((j51Var.y & 1) != 0, j51Var.q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (j51Var.I) {
                    w21Var.a(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    w21Var.f((TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        if (i61Var != null && i61Var.Z2 && w21Var.y) {
            z10 = true;
        }
        w21Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w21(context, i10, g6Var);
    }
}
