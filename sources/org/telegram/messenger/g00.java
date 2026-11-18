package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z00 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ g00(z00 z00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = z00Var;
        this.c = str;
        this.d = fjVar;
        this.e = j3;
        this.f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z00 z00Var = this.b;
                fj fjVar = this.d;
                long j3 = this.e;
                int i7 = this.f;
                c6.d(this.c, new j00(z00Var, fjVar, j3, i7), new j00(z00Var, fjVar, j3, i7), false);
                break;
            default:
                z00 z00Var2 = this.b;
                z00Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.k.originalLanguage = str;
                z00Var2.getMessagesStorage().X1(this.e, fjVar2.k);
                z00Var2.w.remove(Integer.valueOf(this.f));
                z00Var2.f(fjVar2);
                break;
        }
    }
}
