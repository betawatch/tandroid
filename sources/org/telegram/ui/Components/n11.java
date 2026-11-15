package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n11 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new n11());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        o11 o11Var = (o11) view;
        boolean z11 = false;
        if (b41Var.r) {
            o11Var.e();
        } else {
            Object obj = b41Var.G;
            if (obj == null) {
                if (b41Var.B == -2) {
                    o11Var.b(b41Var.q, b41Var.e);
                } else {
                    o11Var.c((b41Var.y & 1) != 0, b41Var.q, b41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (b41Var.I) {
                    o11Var.a(b41Var.x, (TLRPC.TL_forumTopic) obj, b41Var.e);
                } else {
                    o11Var.f((TLRPC.TL_forumTopic) obj, b41Var.e);
                }
            }
        }
        if (u41Var != null && u41Var.k3 && o11Var.F) {
            z11 = true;
        }
        o11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new o11(i7, context, e6Var);
    }
}
