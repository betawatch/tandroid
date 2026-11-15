package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class j00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ j00(c10 c10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = c10Var;
        this.c = str;
        this.d = gjVar;
        this.e = j3;
        this.f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c10 c10Var = this.b;
                gj gjVar = this.d;
                long j3 = this.e;
                int i7 = this.f;
                b6.d(this.c, new m00(c10Var, gjVar, j3, i7), new m00(c10Var, gjVar, j3, i7), false);
                break;
            default:
                c10 c10Var2 = this.b;
                c10Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.k.originalLanguage = str;
                c10Var2.getMessagesStorage().X1(this.e, gjVar2.k);
                c10Var2.w.remove(Integer.valueOf(this.f));
                c10Var2.f(gjVar2);
                break;
        }
    }
}
