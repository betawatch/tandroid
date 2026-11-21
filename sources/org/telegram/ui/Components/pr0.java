package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pr0 extends dt0 {
    public final /* synthetic */ jt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(jt0 jt0Var, Context context) {
        super(jt0Var, context);
        this.h = jt0Var;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        jt0 jt0Var = this.h;
        ds0 g02 = jt0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        jt0Var.L.f();
    }
}
