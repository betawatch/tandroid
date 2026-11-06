package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k11 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new k11());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
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
        if (q41Var != null && q41Var.j3 && l11Var.E) {
            z10 = true;
        }
        l11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l11(i7, context, f6Var);
    }
}
