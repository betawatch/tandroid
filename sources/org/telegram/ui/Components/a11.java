package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a11 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new a11());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        b11 b11Var = (b11) view;
        boolean z11 = false;
        if (r31Var.r) {
            b11Var.f();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.d == -2) {
                    b11Var.c();
                } else {
                    b11Var.d((r31Var.y & 1) != 0, r31Var.q, r31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (r31Var.I) {
                    b11Var.b(r31Var.x, (TLRPC.TL_forumTopic) obj, r31Var.e);
                } else {
                    b11Var.g(r31Var.x, (TLRPC.TL_forumTopic) obj, r31Var.e);
                }
            }
        }
        b11Var.M = x7.u.a(r31Var.y, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (l41Var != null && l41Var.k3 && b11Var.s) {
            z11 = true;
        }
        b11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b11(i3, context, e6Var);
    }
}
