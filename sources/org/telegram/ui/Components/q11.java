package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ij b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ q11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
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
                s11.f(ijVar, j3, str);
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
