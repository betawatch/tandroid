package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class l31 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new l31());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        m31 m31Var = (m31) view;
        boolean z11 = false;
        if (h61Var.r) {
            m31Var.f();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.d == -2) {
                    m31Var.c();
                } else {
                    m31Var.d((h61Var.y & 1) != 0, h61Var.q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h61Var.I) {
                    m31Var.b(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    m31Var.g(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        m31Var.L = w7.j6.a(h61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (c71Var != null && c71Var.a3 && m31Var.s) {
            z11 = true;
        }
        m31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new m31(context, i10, d6Var);
    }
}
