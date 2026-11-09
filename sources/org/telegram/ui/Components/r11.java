package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ r11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.a = i7;
        this.b = ijVar;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.d;
        long j3 = this.c;
        org.telegram.messenger.ij ijVar = this.b;
        switch (i7) {
            case 0:
                t11.f(ijVar, j3, str);
                break;
            default:
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(ijVar.I1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(org.telegram.messenger.qs.A1, ijVar, valueOf, str, bool, bool);
                break;
        }
    }
}
