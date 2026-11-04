package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ir b;

    public /* synthetic */ q1(org.telegram.messenger.ir irVar, int i3) {
        this.a = i3;
        this.b = irVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.ir irVar = this.b;
                if (irVar != null) {
                    irVar.o(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.ir irVar2 = this.b;
                if (irVar2 != null) {
                    irVar2.o(false);
                    break;
                }
                break;
        }
    }
}
