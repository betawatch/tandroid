package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class u21 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new u21());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        v21 v21Var = (v21) view;
        boolean z11 = false;
        if (h51Var.r) {
            v21Var.e();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.B == -2) {
                    v21Var.b(h51Var.q, h51Var.e);
                } else {
                    v21Var.c((h51Var.y & 1) != 0, h51Var.q, h51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h51Var.I) {
                    v21Var.a(h51Var.x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                } else {
                    v21Var.f((TLRPC.TL_forumTopic) obj, h51Var.e);
                }
            }
        }
        if (d61Var != null && d61Var.c3 && v21Var.y) {
            z11 = true;
        }
        v21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v21(context, i10, f6Var);
    }
}
