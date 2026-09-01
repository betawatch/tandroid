package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                    rjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), rjVar.f.phone, se.b.c());
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
