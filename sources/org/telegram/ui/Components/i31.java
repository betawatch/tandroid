package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class i31 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new i31());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        j31 j31Var = (j31) view;
        boolean z11 = false;
        if (v51Var.r) {
            j31Var.e();
        } else {
            Object obj = v51Var.G;
            if (obj == null) {
                if (v51Var.B == -2) {
                    j31Var.b(v51Var.q, v51Var.e);
                } else {
                    j31Var.c((v51Var.y & 1) != 0, v51Var.q, v51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (v51Var.I) {
                    j31Var.a(v51Var.x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                } else {
                    j31Var.f((TLRPC.TL_forumTopic) obj, v51Var.e);
                }
            }
        }
        if (r61Var != null && r61Var.c3 && j31Var.y) {
            z11 = true;
        }
        j31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new j31(context, i10, d6Var);
    }
}
