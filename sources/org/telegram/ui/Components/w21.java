package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w21 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new w21());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        x21 x21Var = (x21) view;
        boolean z11 = false;
        if (j51Var.r) {
            x21Var.e();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.B == -2) {
                    x21Var.b(j51Var.q, j51Var.e);
                } else {
                    x21Var.c((j51Var.y & 1) != 0, j51Var.q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (j51Var.I) {
                    x21Var.a(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    x21Var.f((TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        if (f61Var != null && f61Var.c3 && x21Var.y) {
            z11 = true;
        }
        x21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x21(context, i10, f6Var);
    }
}
