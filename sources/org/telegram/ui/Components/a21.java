package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ a21(org.telegram.messenger.fj fjVar, long j3, String str, int i7) {
        this.a = i7;
        this.b = fjVar;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.d;
        long j3 = this.c;
        org.telegram.messenger.fj fjVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(fjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(org.telegram.messenger.ks.A1, fjVar, valueOf, str, bool, bool);
                break;
            default:
                g21.f(fjVar, j3, str);
                break;
        }
    }
}
