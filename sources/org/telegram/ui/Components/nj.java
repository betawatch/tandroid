package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
