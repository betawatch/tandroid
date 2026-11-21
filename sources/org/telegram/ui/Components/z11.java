package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z11 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new z11());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        a21 a21Var = (a21) view;
        boolean z11 = false;
        if (o41Var.s) {
            a21Var.e();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.C == -2) {
                    a21Var.b(o41Var.r, o41Var.e);
                } else {
                    a21Var.c((o41Var.z & 1) != 0, o41Var.r, o41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (o41Var.J) {
                    a21Var.a(o41Var.y, (TLRPC.TL_forumTopic) obj, o41Var.e);
                } else {
                    a21Var.f((TLRPC.TL_forumTopic) obj, o41Var.e);
                }
            }
        }
        if (h51Var != null && h51Var.k3 && a21Var.F) {
            z11 = true;
        }
        a21Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new a21(i7, context, h6Var);
    }
}
