package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e11 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new e11());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        f11 f11Var = (f11) view;
        boolean z11 = false;
        if (r31Var.r) {
            f11Var.e();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.B == -2) {
                    f11Var.b(r31Var.q, r31Var.e);
                } else {
                    f11Var.c((r31Var.y & 1) != 0, r31Var.q, r31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (r31Var.I) {
                    f11Var.a(r31Var.x, (TLRPC.TL_forumTopic) obj, r31Var.e);
                } else {
                    f11Var.f((TLRPC.TL_forumTopic) obj, r31Var.e);
                }
            }
        }
        if (l41Var != null && l41Var.k3 && f11Var.F) {
            z11 = true;
        }
        f11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f11(i3, context, e6Var);
    }
}
