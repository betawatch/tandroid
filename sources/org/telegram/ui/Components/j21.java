package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j21 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new j21());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        k21 k21Var = (k21) view;
        boolean z11 = false;
        if (b51Var.r) {
            k21Var.f();
        } else {
            Object obj = b51Var.G;
            if (obj == null) {
                if (b51Var.d == -2) {
                    k21Var.c();
                } else {
                    k21Var.d((b51Var.y & 1) != 0, b51Var.q, b51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (b51Var.I) {
                    k21Var.b(b51Var.x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                } else {
                    k21Var.g(b51Var.x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                }
            }
        }
        k21Var.L = v7.u7.a(b51Var.y, 8) ? org.telegram.messenger.i0.L(10.0f) : 0;
        if (v51Var != null && v51Var.j3 && k21Var.s) {
            z11 = true;
        }
        k21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new k21(i10, context, p6Var);
    }
}
