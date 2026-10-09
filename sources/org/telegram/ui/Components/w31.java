package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w31 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new w31());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        x31 x31Var = (x31) view;
        boolean z11 = false;
        if (p61Var.r) {
            x31Var.f();
        } else {
            Object obj = p61Var.G;
            if (obj == null) {
                if (p61Var.d == -2) {
                    x31Var.c();
                } else {
                    x31Var.d((p61Var.y & 1) != 0, p61Var.q, p61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (p61Var.I) {
                    x31Var.b(p61Var.x, (TLRPC.TL_forumTopic) obj, p61Var.e);
                } else {
                    x31Var.g(p61Var.x, (TLRPC.TL_forumTopic) obj, p61Var.e);
                }
            }
        }
        x31Var.L = w7.g0.a(p61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (k71Var != null && k71Var.a3 && x31Var.s) {
            z11 = true;
        }
        x31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x31(context, i10, e6Var);
    }
}
