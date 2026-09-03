package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj b;

    public /* synthetic */ nj(pj pjVar, int i10) {
        this.a = i10;
        this.b = pjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj pjVar = this.b;
                if (pjVar.f != null) {
                    pjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), pjVar.f.phone, se.b.c());
                    pjVar.s = pjVar.f;
                    AndroidUtilities.runOnUIThread(new nj(pjVar, 1));
                    break;
                }
                break;
            default:
                pj pjVar2 = this.b;
                pjVar2.c.l(pjVar2.v, false);
                break;
        }
    }
}
