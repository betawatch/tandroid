package jh;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                e eVar = this.b;
                g0.i3(eVar.D, 400L);
                eVar.c();
                break;
        }
    }
}
