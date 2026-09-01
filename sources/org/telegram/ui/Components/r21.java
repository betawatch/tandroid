package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r21 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new r21());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        s21 s21Var = (s21) view;
        boolean z10 = false;
        if (j51Var.r) {
            s21Var.f();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.d == -2) {
                    s21Var.c();
                } else {
                    s21Var.d((j51Var.y & 1) != 0, j51Var.q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (j51Var.I) {
                    s21Var.b(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    s21Var.g(j51Var.x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        s21Var.I = k7.x8.a(j51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (i61Var != null && i61Var.Z2 && s21Var.s) {
            z10 = true;
        }
        s21Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new s21(context, i10, g6Var);
    }
}
