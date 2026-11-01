package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ ds(ns nsVar, int i10) {
        this.a = i10;
        this.b = nsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ns.d0(this.b);
                break;
            case 1:
                ns nsVar = this.b;
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    break;
                }
                break;
            default:
                ns nsVar2 = this.b;
                nsVar2.presentFragment(un.ma(nsVar2.H), true);
                break;
        }
    }
}
