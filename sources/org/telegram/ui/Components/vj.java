package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj b;

    public /* synthetic */ vj(xj xjVar, int i10) {
        this.a = i10;
        this.b = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xj xjVar = this.b;
                if (xjVar.f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f.phone, gf.b.c());
                    xjVar.s = xjVar.f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    break;
                }
                break;
            default:
                xj xjVar2 = this.b;
                xjVar2.c.l(xjVar2.v, false);
                break;
        }
    }
}
