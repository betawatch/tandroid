package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j11 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new j11());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        k11 k11Var = (k11) view;
        boolean z11 = false;
        if (b41Var.r) {
            k11Var.f();
        } else {
            Object obj = b41Var.G;
            if (obj == null) {
                if (b41Var.d == -2) {
                    k11Var.c();
                } else {
                    k11Var.d((b41Var.y & 1) != 0, b41Var.q, b41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (b41Var.I) {
                    k11Var.b(b41Var.x, (TLRPC.TL_forumTopic) obj, b41Var.e);
                } else {
                    k11Var.g(b41Var.x, (TLRPC.TL_forumTopic) obj, b41Var.e);
                }
            }
        }
        k11Var.M = c8.zc.a(b41Var.y, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (u41Var != null && u41Var.k3 && k11Var.s) {
            z11 = true;
        }
        k11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new k11(i7, context, e6Var);
    }
}
