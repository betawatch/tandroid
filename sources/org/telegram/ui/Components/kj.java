package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kj extends v4.d0 {
    public final /* synthetic */ kg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(kg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(8.0f, ((vj) this.r.V).s.getPaddingTop() - org.telegram.messenger.g0.m, super.k(i7, view));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
