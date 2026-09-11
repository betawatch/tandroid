package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class q21 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new q21());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        r21 r21Var = (r21) view;
        boolean z11 = false;
        if (h51Var.r) {
            r21Var.f();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.d == -2) {
                    r21Var.c();
                } else {
                    r21Var.d((h51Var.y & 1) != 0, h51Var.q, h51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (h51Var.I) {
                    r21Var.b(h51Var.x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                } else {
                    r21Var.g(h51Var.x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                }
            }
        }
        r21Var.L = w7.b0.a(h51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (d61Var != null && d61Var.c3 && r21Var.s) {
            z11 = true;
        }
        r21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r21(context, i10, f6Var);
    }
}
