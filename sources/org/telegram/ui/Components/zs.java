package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct b;

    public /* synthetic */ zs(ct ctVar, int i7) {
        this.a = i7;
        this.b = ctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ct ctVar = this.b;
                ctVar.post(new zs(ctVar, 1));
                break;
            default:
                ct ctVar2 = this.b;
                ctVar2.h();
                ctVar2.d();
                break;
        }
    }
}
