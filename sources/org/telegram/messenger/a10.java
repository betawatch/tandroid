package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class a10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ a10(u10 u10Var, String str, kj kjVar, long j10, int i10, int i11) {
        this.a = i11;
        this.b = u10Var;
        this.c = str;
        this.d = kjVar;
        this.e = j10;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u10 u10Var = this.b;
                kj kjVar = this.d;
                long j10 = this.e;
                int i10 = this.f;
                ks.d(this.c, new d10(u10Var, kjVar, j10, i10), new d10(u10Var, kjVar, j10, i10), false);
                break;
            default:
                u10 u10Var2 = this.b;
                u10Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                kj kjVar2 = this.d;
                kjVar2.k.originalLanguage = str;
                u10Var2.getMessagesStorage().X1(this.e, kjVar2.k);
                u10Var2.w.remove(Integer.valueOf(this.f));
                u10Var2.f(kjVar2);
                break;
        }
    }
}
