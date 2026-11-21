package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v11 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new v11());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        w11 w11Var = (w11) view;
        boolean z11 = false;
        if (o41Var.s) {
            w11Var.f();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.d == -2) {
                    w11Var.c();
                } else {
                    w11Var.d((o41Var.z & 1) != 0, o41Var.r, o41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (o41Var.J) {
                    w11Var.b(o41Var.y, (TLRPC.TL_forumTopic) obj, o41Var.e);
                } else {
                    w11Var.g(o41Var.y, (TLRPC.TL_forumTopic) obj, o41Var.e);
                }
            }
        }
        w11Var.M = c8.dd.a(o41Var.z, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (h51Var != null && h51Var.k3 && w11Var.s) {
            z11 = true;
        }
        w11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w11(i7, context, h6Var);
    }
}
