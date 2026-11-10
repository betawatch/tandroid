package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements pc, oc {
    public final /* synthetic */ f10 a;
    public final /* synthetic */ ij b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.a = f10Var;
        this.b = ijVar;
        this.c = j3;
        this.d = i7;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        g0.h3(new m00(this.a, str, this.b, this.c, this.d, 1));
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        g0.h3(new hk(this.d, 12, this.c, this.a, this.b));
    }
}
