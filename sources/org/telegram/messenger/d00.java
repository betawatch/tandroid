package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d00 implements jc, ic {
    public final /* synthetic */ x00 a;
    public final /* synthetic */ zi b;
    public final /* synthetic */ e3.s c;
    public final /* synthetic */ ci.w9 d;

    public /* synthetic */ d00(x00 x00Var, zi ziVar, e3.s sVar, ci.w9 w9Var) {
        this.a = x00Var;
        this.b = ziVar;
        this.c = sVar;
        this.d = w9Var;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        g0.h3(new cn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        g0.h3(new ul(this.a, this.b, this.c, this.d, 27));
    }
}
