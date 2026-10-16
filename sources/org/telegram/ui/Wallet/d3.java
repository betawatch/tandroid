package org.telegram.ui.Wallet;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d3 extends tg.s {
    public final /* synthetic */ e3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, Context context, a3 a3Var) {
        super(context, a3Var);
        this.x = e3Var;
    }

    @Override // tg.s
    public final void a() {
        e3 e3Var = this.x;
        e3Var.o = true;
        setPaused(true);
        setVisibility(8);
        e3Var.a.invalidate();
    }
}
