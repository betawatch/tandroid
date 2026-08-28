package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z11 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new z11());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        a21 a21Var = (a21) view;
        boolean z11 = false;
        if (l41Var.r) {
            a21Var.e();
        } else {
            Object obj = l41Var.G;
            if (obj == null) {
                if (l41Var.B == -2) {
                    a21Var.b(l41Var.q, l41Var.e);
                } else {
                    a21Var.c((l41Var.y & 1) != 0, l41Var.q, l41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (l41Var.I) {
                    a21Var.a(l41Var.x, (TLRPC.TL_forumTopic) obj, l41Var.e);
                } else {
                    a21Var.f((TLRPC.TL_forumTopic) obj, l41Var.e);
                }
            }
        }
        if (i51Var != null && i51Var.Y2 && a21Var.y) {
            z11 = true;
        }
        a21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new a21(context, i9, b6Var);
    }
}
