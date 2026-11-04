package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ e00(x00 x00Var, String str, zi ziVar, long j10, int i3, int i10) {
        this.a = i10;
        this.b = x00Var;
        this.c = str;
        this.d = ziVar;
        this.e = j10;
        this.f = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x00 x00Var = this.b;
                zi ziVar = this.d;
                long j10 = this.e;
                int i3 = this.f;
                b6.d(this.c, new h00(x00Var, ziVar, j10, i3), new h00(x00Var, ziVar, j10, i3), false);
                break;
            default:
                x00 x00Var2 = this.b;
                x00Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                zi ziVar2 = this.d;
                ziVar2.k.originalLanguage = str;
                x00Var2.getMessagesStorage().X1(this.e, ziVar2.k);
                x00Var2.w.remove(Integer.valueOf(this.f));
                x00Var2.f(ziVar2);
                break;
        }
    }
}
