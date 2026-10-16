package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w31 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new w31());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        x31 x31Var = (x31) view;
        boolean z11 = false;
        if (m61Var.r) {
            x31Var.e();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.B == -2) {
                    x31Var.b(m61Var.q, m61Var.e);
                } else {
                    x31Var.c((m61Var.y & 1) != 0, m61Var.q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (m61Var.I) {
                    x31Var.a(m61Var.x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    x31Var.f((TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (i71Var != null && i71Var.a3 && x31Var.y) {
            z11 = true;
        }
        x31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x31(context, i10, c6Var);
    }
}
