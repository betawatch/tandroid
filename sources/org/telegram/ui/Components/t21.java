package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.kj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ t21(org.telegram.messenger.kj kjVar, long j10, String str, int i10) {
        this.a = i10;
        this.b = kjVar;
        this.c = j10;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.d;
        long j10 = this.c;
        org.telegram.messenger.kj kjVar = this.b;
        switch (i10) {
            case 0:
                v21.f(kjVar, j10, str);
                break;
            default:
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(kjVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f7.k(org.telegram.messenger.at.A1, kjVar, valueOf, str, bool, bool);
                break;
        }
    }
}
