package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q21 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new q21());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        r21 r21Var = (r21) view;
        boolean z10 = false;
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
        r21Var.I = k7.x8.a(h51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (h61Var != null && h61Var.Z2 && r21Var.s) {
            z10 = true;
        }
        r21Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r21(context, i10, g6Var);
    }
}
