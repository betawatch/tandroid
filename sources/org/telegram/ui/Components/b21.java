package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b21 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new b21());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        c21 c21Var = (c21) view;
        boolean z11 = false;
        if (n41Var.r) {
            c21Var.e();
        } else {
            Object obj = n41Var.G;
            if (obj == null) {
                if (n41Var.B == -2) {
                    c21Var.b(n41Var.q, n41Var.e);
                } else {
                    c21Var.c((n41Var.y & 1) != 0, n41Var.q, n41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (n41Var.I) {
                    c21Var.a(n41Var.x, (TLRPC.TL_forumTopic) obj, n41Var.e);
                } else {
                    c21Var.f((TLRPC.TL_forumTopic) obj, n41Var.e);
                }
            }
        }
        if (k51Var != null && k51Var.Y2 && c21Var.y) {
            z11 = true;
        }
        c21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c21(context, i10, c6Var);
    }
}
