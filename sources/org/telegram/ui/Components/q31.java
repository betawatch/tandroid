package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class q31 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new q31());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        r31 r31Var = (r31) view;
        boolean z11 = false;
        if (h61Var.r) {
            r31Var.e();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.B == -2) {
                    r31Var.b(h61Var.q, h61Var.e);
                } else {
                    r31Var.c((h61Var.y & 1) != 0, h61Var.q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h61Var.I) {
                    r31Var.a(h61Var.x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    r31Var.f((TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        if (c71Var != null && c71Var.a3 && r31Var.y) {
            z11 = true;
        }
        r31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r31(context, i10, d6Var);
    }
}
