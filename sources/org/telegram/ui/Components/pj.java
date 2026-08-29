package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj b;

    public /* synthetic */ pj(rj rjVar, int i10) {
        this.a = i10;
        this.b = rjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rj rjVar = this.b;
                if (rjVar.f != null) {
                    rjVar.v = org.telegram.messenger.x3.k(new StringBuilder("+"), rjVar.f.phone, qe.b.c());
                    rjVar.s = rjVar.f;
                    AndroidUtilities.runOnUIThread(new pj(rjVar, 1));
                    break;
                }
                break;
            default:
                rj rjVar2 = this.b;
                rjVar2.c.l(rjVar2.v, false);
                break;
        }
    }
}
