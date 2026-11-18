package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements nc, mc {
    public final /* synthetic */ z00 a;
    public final /* synthetic */ fj b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ di.o9 d;

    public /* synthetic */ f00(z00 z00Var, fj fjVar, f3.s sVar, di.o9 o9Var) {
        this.a = z00Var;
        this.b = fjVar;
        this.c = sVar;
        this.d = o9Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new fn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        g0.g3(new tl(this.a, this.b, this.c, this.d, 27));
    }
}
