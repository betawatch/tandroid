package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak b;

    public /* synthetic */ yj(ak akVar, int i10) {
        this.a = i10;
        this.b = akVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak akVar = this.b;
                if (akVar.f != null) {
                    akVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), akVar.f.phone, gf.b.c());
                    akVar.s = akVar.f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    break;
                }
                break;
            default:
                ak akVar2 = this.b;
                akVar2.c.l(akVar2.v, false);
                break;
        }
    }
}
