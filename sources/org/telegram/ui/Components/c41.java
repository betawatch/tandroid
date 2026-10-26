package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c41 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new c41());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        d41 d41Var = (d41) view;
        boolean z11 = false;
        if (t61Var.r) {
            d41Var.e();
        } else {
            Object obj = t61Var.G;
            if (obj == null) {
                if (t61Var.B == -2) {
                    d41Var.b(t61Var.q, t61Var.e);
                } else {
                    d41Var.c((t61Var.y & 1) != 0, t61Var.q, t61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (t61Var.I) {
                    d41Var.a(t61Var.x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                } else {
                    d41Var.f((TLRPC.TL_forumTopic) obj, t61Var.e);
                }
            }
        }
        if (r71Var != null && r71Var.k3 && d41Var.E) {
            z11 = true;
        }
        d41Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new d41(context, i10, u6Var);
    }
}
