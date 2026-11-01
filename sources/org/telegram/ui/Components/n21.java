package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n21 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new n21());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        o21 o21Var = (o21) view;
        boolean z11 = false;
        if (b51Var.r) {
            o21Var.e();
        } else {
            Object obj = b51Var.G;
            if (obj == null) {
                if (b51Var.B == -2) {
                    o21Var.b(b51Var.q, b51Var.e);
                } else {
                    o21Var.c((b51Var.y & 1) != 0, b51Var.q, b51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (b51Var.I) {
                    o21Var.a(b51Var.x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                } else {
                    o21Var.f((TLRPC.TL_forumTopic) obj, b51Var.e);
                }
            }
        }
        if (v51Var != null && v51Var.j3 && o21Var.E) {
            z11 = true;
        }
        o21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new o21(i10, context, p6Var);
    }
}
