package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements pc, oc {
    public final /* synthetic */ f10 a;
    public final /* synthetic */ ij b;
    public final /* synthetic */ f3.s c;
    public final /* synthetic */ bi.ya d;

    public /* synthetic */ l00(f10 f10Var, ij ijVar, f3.s sVar, bi.ya yaVar) {
        this.a = f10Var;
        this.b = ijVar;
        this.c = sVar;
        this.d = yaVar;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        g0.h3(new mn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        g0.h3(new em(this.a, this.b, this.c, this.d, 27));
    }
}
