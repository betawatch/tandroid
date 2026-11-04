package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements jc, ic {
    public final /* synthetic */ x00 a;
    public final /* synthetic */ zi b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h00(x00 x00Var, zi ziVar, long j10, int i3) {
        this.a = x00Var;
        this.b = ziVar;
        this.c = j10;
        this.d = i3;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        g0.h3(new e00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        g0.h3(new yj(this.d, 12, this.c, this.a, this.b));
    }
}
