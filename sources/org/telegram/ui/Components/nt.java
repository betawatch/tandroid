package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ nt(qt qtVar, int i10) {
        this.a = i10;
        this.b = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qt qtVar = this.b;
                qtVar.post(new nt(qtVar, 1));
                break;
            default:
                qt qtVar2 = this.b;
                qtVar2.h();
                qtVar2.d();
                break;
        }
    }
}
