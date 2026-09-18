package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s21 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new s21());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        t21 t21Var = (t21) view;
        boolean z11 = false;
        if (j51Var.r) {
            t21Var.f();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.d == -2) {
                    t21Var.c();
                } else {
                    t21Var.d((j51Var.y & 1) != 0, j51Var.q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (j51Var.I) {
                    t21Var.b(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    t21Var.g(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        t21Var.L = w7.c0.a(j51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (f61Var != null && f61Var.c3 && t21Var.s) {
            z11 = true;
        }
        t21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t21(context, i10, f6Var);
    }
}
