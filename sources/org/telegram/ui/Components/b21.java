package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ b21(org.telegram.messenger.gj gjVar, long j3, String str, int i7) {
        this.a = i7;
        this.b = gjVar;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.d;
        long j3 = this.c;
        org.telegram.messenger.gj gjVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(gjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(org.telegram.messenger.ls.A1, gjVar, valueOf, str, bool, bool);
                break;
            default:
                j21.f(gjVar, j3, str);
                break;
        }
    }
}
