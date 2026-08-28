package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u11 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new u11());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        v11 v11Var = (v11) view;
        boolean z11 = false;
        if (l41Var.r) {
            v11Var.f();
        } else {
            Object obj = l41Var.G;
            if (obj == null) {
                if (l41Var.d == -2) {
                    v11Var.c();
                } else {
                    v11Var.d((l41Var.y & 1) != 0, l41Var.q, l41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (l41Var.I) {
                    v11Var.b(l41Var.x, (TLRPC.TL_forumTopic) obj, l41Var.e);
                } else {
                    v11Var.g(l41Var.x, (TLRPC.TL_forumTopic) obj, l41Var.e);
                }
            }
        }
        v11Var.H = g7.z7.a(l41Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (i51Var != null && i51Var.Y2 && v11Var.s) {
            z11 = true;
        }
        v11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new v11(context, i9, b6Var);
    }
}
