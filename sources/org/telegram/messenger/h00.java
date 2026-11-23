package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ h00(a10 a10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = a10Var;
        this.c = str;
        this.d = gjVar;
        this.e = j3;
        this.f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a10 a10Var = this.b;
                gj gjVar = this.d;
                long j3 = this.e;
                int i7 = this.f;
                c6.d(this.c, new k00(a10Var, gjVar, j3, i7), new k00(a10Var, gjVar, j3, i7), false);
                break;
            default:
                a10 a10Var2 = this.b;
                a10Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.k.originalLanguage = str;
                a10Var2.getMessagesStorage().X1(this.e, gjVar2.k);
                a10Var2.w.remove(Integer.valueOf(this.f));
                a10Var2.f(gjVar2);
                break;
        }
    }
}
