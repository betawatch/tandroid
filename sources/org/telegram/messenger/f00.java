package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ f00(y00 y00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = y00Var;
        this.c = str;
        this.d = fjVar;
        this.e = j3;
        this.f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y00 y00Var = this.b;
                fj fjVar = this.d;
                long j3 = this.e;
                int i7 = this.f;
                c6.d(this.c, new i00(y00Var, fjVar, j3, i7), new i00(y00Var, fjVar, j3, i7), false);
                break;
            default:
                y00 y00Var2 = this.b;
                y00Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.k.originalLanguage = str;
                y00Var2.getMessagesStorage().X1(this.e, fjVar2.k);
                y00Var2.w.remove(Integer.valueOf(this.f));
                y00Var2.f(fjVar2);
                break;
        }
    }
}
