package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c10 implements qc, pc {
    public final /* synthetic */ t10 a;
    public final /* synthetic */ jj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ c10(t10 t10Var, jj jjVar, long j10, int i10) {
        this.a = t10Var;
        this.b = jjVar;
        this.c = j10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        i0.g3(new z00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        i0.g3(new rk(this.d, 12, this.c, this.a, this.b));
    }
}
