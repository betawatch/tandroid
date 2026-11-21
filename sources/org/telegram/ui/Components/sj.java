package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    ujVar.w = org.telegram.messenger.n10.h(new StringBuilder("+"), ujVar.f.phone, pf.b.c());
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
