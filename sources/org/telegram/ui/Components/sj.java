package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj b;

    public /* synthetic */ sj(uj ujVar, int i7) {
        this.a = i7;
        this.b = ujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj ujVar = this.b;
                if (ujVar.f != null) {
                    ujVar.w = org.telegram.messenger.o10.h(new StringBuilder("+"), ujVar.f.phone, pf.b.c());
                    ujVar.s = ujVar.f;
                    org.telegram.messenger.g0.g3(new sj(ujVar, 1));
                    break;
                }
                break;
            default:
                uj ujVar2 = this.b;
                ujVar2.c.l(ujVar2.w, false);
                break;
        }
    }
}
