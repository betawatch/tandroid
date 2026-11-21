package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fr0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ jt0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.q0 = jt0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.q0.h1(i7);
    }
}
