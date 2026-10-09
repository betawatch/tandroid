package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a41 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new a41());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        b41 b41Var = (b41) view;
        boolean z11 = false;
        if (p61Var.r) {
            b41Var.e();
        } else {
            Object obj = p61Var.G;
            if (obj == null) {
                if (p61Var.B == -2) {
                    b41Var.b(p61Var.q, p61Var.e);
                } else {
                    b41Var.c((p61Var.y & 1) != 0, p61Var.q, p61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (p61Var.I) {
                    b41Var.a(p61Var.x, (TLRPC.TL_forumTopic) obj, p61Var.e);
                } else {
                    b41Var.f((TLRPC.TL_forumTopic) obj, p61Var.e);
                }
            }
        }
        if (k71Var != null && k71Var.a3 && b41Var.y) {
            z11 = true;
        }
        b41Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b41(context, i10, e6Var);
    }
}
