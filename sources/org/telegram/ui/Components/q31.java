package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class q31 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new q31());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        r31 r31Var = (r31) view;
        boolean z11 = false;
        if (h61Var.r) {
            r31Var.f();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.d == -2) {
                    r31Var.c();
                } else {
                    r31Var.d((h61Var.y & 1) != 0, h61Var.q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h61Var.I) {
                    r31Var.b(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    r31Var.g(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        r31Var.L = w7.e0.a(h61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (e71Var != null && e71Var.j3 && r31Var.s) {
            z11 = true;
        }
        r31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r31(context, i10, d6Var);
    }
}
