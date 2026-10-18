package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j31 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new j31());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        k31 k31Var = (k31) view;
        boolean z11 = false;
        if (f61Var.r) {
            k31Var.f();
        } else {
            Object obj = f61Var.G;
            if (obj == null) {
                if (f61Var.d == -2) {
                    k31Var.c();
                } else {
                    k31Var.d((f61Var.y & 1) != 0, f61Var.q, f61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (f61Var.I) {
                    k31Var.b(f61Var.x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                } else {
                    k31Var.g(f61Var.x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                }
            }
        }
        k31Var.L = w7.m6.a(f61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (a71Var != null && a71Var.a3 && k31Var.s) {
            z11 = true;
        }
        k31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k31(context, i10, d6Var);
    }
}
