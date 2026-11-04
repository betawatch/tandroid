package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.zi b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ k11(org.telegram.messenger.zi ziVar, long j10, String str, int i3) {
        this.a = i3;
        this.b = ziVar;
        this.c = j10;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        String str = this.d;
        long j10 = this.c;
        org.telegram.messenger.zi ziVar = this.b;
        switch (i3) {
            case 0:
                m11.f(ziVar, j10, str);
                break;
            default:
                org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(ziVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f10.k(org.telegram.messenger.hs.A1, ziVar, valueOf, str, bool, bool);
                break;
        }
    }
}
