package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k21 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new k21());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        l21 l21Var = (l21) view;
        boolean z11 = false;
        if (w41Var.r) {
            l21Var.e();
        } else {
            Object obj = w41Var.G;
            if (obj == null) {
                if (w41Var.B == -2) {
                    l21Var.b(w41Var.q, w41Var.e);
                } else {
                    l21Var.c((w41Var.y & 1) != 0, w41Var.q, w41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (w41Var.I) {
                    l21Var.a(w41Var.x, (TLRPC.TL_forumTopic) obj, w41Var.e);
                } else {
                    l21Var.f((TLRPC.TL_forumTopic) obj, w41Var.e);
                }
            }
        }
        if (u51Var != null && u51Var.Y2 && l21Var.y) {
            z11 = true;
        }
        l21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l21(context, i10, c6Var);
    }
}
