package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y00 implements qc, pc {
    public final /* synthetic */ t10 a;
    public final /* synthetic */ jj b;
    public final /* synthetic */ c3.s c;
    public final /* synthetic */ bi.i6 d;

    public /* synthetic */ y00(t10 t10Var, jj jjVar, c3.s sVar, bi.i6 i6Var) {
        this.a = t10Var;
        this.b = jjVar;
        this.c = sVar;
        this.d = i6Var;
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        i0.g3(new cn(this.a, this.b, str, this.c, this.d, 18));
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        i0.g3(new ul(this.a, this.b, this.c, this.d, 27));
    }
}
