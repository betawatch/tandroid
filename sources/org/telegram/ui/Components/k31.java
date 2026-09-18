package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k31 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new k31());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        l31 l31Var = (l31) view;
        boolean z11 = false;
        if (x51Var.r) {
            l31Var.e();
        } else {
            Object obj = x51Var.G;
            if (obj == null) {
                if (x51Var.B == -2) {
                    l31Var.b(x51Var.q, x51Var.e);
                } else {
                    l31Var.c((x51Var.y & 1) != 0, x51Var.q, x51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (x51Var.I) {
                    l31Var.a(x51Var.x, (TLRPC.TL_forumTopic) obj, x51Var.e);
                } else {
                    l31Var.f((TLRPC.TL_forumTopic) obj, x51Var.e);
                }
            }
        }
        if (t61Var != null && t61Var.c3 && l31Var.y) {
            z11 = true;
        }
        l31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l31(context, i10, e6Var);
    }
}
