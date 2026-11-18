package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 d;

    public /* synthetic */ h1(a5 a5Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.a = i7;
        this.b = a5Var;
        this.c = u1Var;
        this.d = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new h1(this.b, this.c, this.d, 1));
                break;
            default:
                b5.b0(this.b, this.c, this.d);
                break;
        }
    }
}
