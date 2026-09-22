package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r21 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new r21());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        s21 s21Var = (s21) view;
        boolean z11 = false;
        if (i51Var.r) {
            s21Var.f();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.d == -2) {
                    s21Var.c();
                } else {
                    s21Var.d((i51Var.y & 1) != 0, i51Var.q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (i51Var.I) {
                    s21Var.b(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    s21Var.g(i51Var.x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        s21Var.L = w7.c0.a(i51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (e61Var != null && e61Var.c3 && s21Var.s) {
            z11 = true;
        }
        s21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new s21(context, i10, e6Var);
    }
}
