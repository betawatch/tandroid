package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k11 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new k11());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        l11 l11Var = (l11) view;
        boolean z10 = false;
        if (x31Var.r) {
            l11Var.e();
        } else {
            Object obj = x31Var.G;
            if (obj == null) {
                if (x31Var.B == -2) {
                    l11Var.b(x31Var.q, x31Var.e);
                } else {
                    l11Var.c((x31Var.y & 1) != 0, x31Var.q, x31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (x31Var.I) {
                    l11Var.a(x31Var.x, (TLRPC.TL_forumTopic) obj, x31Var.e);
                } else {
                    l11Var.f((TLRPC.TL_forumTopic) obj, x31Var.e);
                }
            }
        }
        if (r41Var != null && r41Var.j3 && l11Var.E) {
            z10 = true;
        }
        l11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l11(i7, context, h6Var);
    }
}
