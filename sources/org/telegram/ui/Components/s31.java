package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s31 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new s31());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        t31 t31Var = (t31) view;
        boolean z11 = false;
        if (m61Var.r) {
            t31Var.f();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.d == -2) {
                    t31Var.c();
                } else {
                    t31Var.d((m61Var.y & 1) != 0, m61Var.q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (m61Var.I) {
                    t31Var.b(m61Var.x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    t31Var.g(m61Var.x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        t31Var.L = w7.l6.a(m61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (i71Var != null && i71Var.a3 && t31Var.s) {
            z11 = true;
        }
        t31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t31(context, i10, c6Var);
    }
}
