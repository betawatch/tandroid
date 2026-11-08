package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
