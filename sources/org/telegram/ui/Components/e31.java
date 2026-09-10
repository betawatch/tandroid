package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e31 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new e31());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        f31 f31Var = (f31) view;
        boolean z11 = false;
        if (v51Var.r) {
            f31Var.f();
        } else {
            Object obj = v51Var.G;
            if (obj == null) {
                if (v51Var.d == -2) {
                    f31Var.c();
                } else {
                    f31Var.d((v51Var.y & 1) != 0, v51Var.q, v51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (v51Var.I) {
                    f31Var.b(v51Var.x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                } else {
                    f31Var.g(v51Var.x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                }
            }
        }
        f31Var.L = w7.c0.a(v51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (r61Var != null && r61Var.c3 && f31Var.s) {
            z11 = true;
        }
        f31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f31(context, i10, f6Var);
    }
}
