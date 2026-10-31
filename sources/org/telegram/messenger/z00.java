package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ z00(t10 t10Var, String str, jj jjVar, long j10, int i10, int i11) {
        this.a = i11;
        this.b = t10Var;
        this.c = str;
        this.d = jjVar;
        this.e = j10;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t10 t10Var = this.b;
                jj jjVar = this.d;
                long j10 = this.e;
                int i10 = this.f;
                js.d(this.c, new c10(t10Var, jjVar, j10, i10), new c10(t10Var, jjVar, j10, i10), false);
                break;
            default:
                t10 t10Var2 = this.b;
                t10Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                jj jjVar2 = this.d;
                jjVar2.k.originalLanguage = str;
                t10Var2.getMessagesStorage().X1(this.e, jjVar2.k);
                t10Var2.w.remove(Integer.valueOf(this.f));
                t10Var2.f(jjVar2);
                break;
        }
    }
}
