package org.telegram.ui.Wallet;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c3 extends sg.s {
    public final /* synthetic */ d3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, Context context, z2 z2Var) {
        super(context, z2Var);
        this.x = d3Var;
    }

    @Override // sg.s
    public final void a() {
        d3 d3Var = this.x;
        d3Var.o = true;
        setPaused(true);
        setVisibility(8);
        d3Var.a.invalidate();
    }
}
