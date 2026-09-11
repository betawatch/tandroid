package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
