package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q21 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new q21());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        r21 r21Var = (r21) view;
        boolean z10 = false;
        if (i51Var.r) {
            r21Var.f();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.d == -2) {
                    r21Var.c();
                } else {
                    r21Var.d((i51Var.y & 1) != 0, i51Var.q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (i51Var.I) {
                    r21Var.b(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    r21Var.g(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        r21Var.I = k7.w8.a(i51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (g61Var != null && g61Var.Z2 && r21Var.s) {
            z10 = true;
        }
        r21Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r21(context, i10, f6Var);
    }
}
