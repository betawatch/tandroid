package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g21 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new g21());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        h21 h21Var = (h21) view;
        boolean z11 = false;
        if (w41Var.r) {
            h21Var.f();
        } else {
            Object obj = w41Var.G;
            if (obj == null) {
                if (w41Var.d == -2) {
                    h21Var.c();
                } else {
                    h21Var.d((w41Var.y & 1) != 0, w41Var.q, w41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (w41Var.I) {
                    h21Var.b(w41Var.x, (TLRPC.TL_forumTopic) obj, w41Var.e);
                } else {
                    h21Var.g(w41Var.x, (TLRPC.TL_forumTopic) obj, w41Var.e);
                }
            }
        }
        h21Var.H = i7.n8.a(w41Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (u51Var != null && u51Var.Y2 && h21Var.s) {
            z11 = true;
        }
        h21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h21(context, i10, c6Var);
    }
}
