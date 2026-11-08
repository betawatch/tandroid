package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;

    public /* synthetic */ at(dt dtVar, int i7) {
        this.a = i7;
        this.b = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                dtVar.post(new at(dtVar, 1));
                break;
            default:
                dt dtVar2 = this.b;
                dtVar2.h();
                dtVar2.d();
                break;
        }
    }
}
