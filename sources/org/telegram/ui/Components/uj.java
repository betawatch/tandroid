package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj b;

    public /* synthetic */ uj(wj wjVar, int i10) {
        this.a = i10;
        this.b = wjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wj wjVar = this.b;
                if (wjVar.f != null) {
                    wjVar.v = org.telegram.messenger.sl.h(new StringBuilder("+"), wjVar.f.phone, jf.b.c());
                    wjVar.s = wjVar.f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    break;
                }
                break;
            default:
                wj wjVar2 = this.b;
                wjVar2.c.l(wjVar2.v, false);
                break;
        }
    }
}
