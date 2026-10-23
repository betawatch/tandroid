package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class u31 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new u31());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        v31 v31Var = (v31) view;
        boolean z11 = false;
        if (m61Var.r) {
            v31Var.e();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.B == -2) {
                    v31Var.b(m61Var.q, m61Var.e);
                } else {
                    v31Var.c((m61Var.y & 1) != 0, m61Var.q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (m61Var.I) {
                    v31Var.a(m61Var.x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    v31Var.f((TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (j71Var != null && j71Var.d3 && v31Var.E) {
            z11 = true;
        }
        v31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v31(context, i10, g6Var);
    }
}
