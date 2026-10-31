package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.jj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ s21(org.telegram.messenger.jj jjVar, long j10, String str, int i10) {
        this.a = i10;
        this.b = jjVar;
        this.c = j10;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.d;
        long j10 = this.c;
        org.telegram.messenger.jj jjVar = this.b;
        switch (i10) {
            case 0:
                u21.f(jjVar, j10, str);
                break;
            default:
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(jjVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f7.k(org.telegram.messenger.zs.A1, jjVar, valueOf, str, bool, bool);
                break;
        }
    }
}
