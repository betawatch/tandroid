package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y31 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new y31());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        z31 z31Var = (z31) view;
        boolean z11 = false;
        if (t61Var.r) {
            z31Var.f();
        } else {
            Object obj = t61Var.G;
            if (obj == null) {
                if (t61Var.d == -2) {
                    z31Var.c();
                } else {
                    z31Var.d((t61Var.y & 1) != 0, t61Var.q, t61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (t61Var.I) {
                    z31Var.b(t61Var.x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                } else {
                    z31Var.g(t61Var.x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                }
            }
        }
        z31Var.L = a8.pf.a(t61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (r71Var != null && r71Var.k3 && z31Var.s) {
            z11 = true;
        }
        z31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new z31(context, i10, u6Var);
    }
}
