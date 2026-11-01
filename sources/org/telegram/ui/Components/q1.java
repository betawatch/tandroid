package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.as b;

    public /* synthetic */ q1(org.telegram.messenger.as asVar, int i10) {
        this.a = i10;
        this.b = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.as asVar = this.b;
                if (asVar != null) {
                    asVar.i(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.as asVar2 = this.b;
                if (asVar2 != null) {
                    asVar2.i(false);
                    break;
                }
                break;
        }
    }
}
