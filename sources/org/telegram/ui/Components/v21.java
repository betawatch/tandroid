package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v21 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v21());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        w21 w21Var = (w21) view;
        boolean z11 = false;
        if (i51Var.r) {
            w21Var.e();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.B == -2) {
                    w21Var.b(i51Var.q, i51Var.e);
                } else {
                    w21Var.c((i51Var.y & 1) != 0, i51Var.q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (i51Var.I) {
                    w21Var.a(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    w21Var.f((TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (e61Var != null && e61Var.c3 && w21Var.y) {
            z11 = true;
        }
        w21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w21(context, i10, e6Var);
    }
}
