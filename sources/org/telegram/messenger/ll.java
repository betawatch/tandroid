package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ll implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ ll(qp qpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                wj wjVar = qpVar.x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    qpVar.y8 = tL_webBrowserSettings;
                    qpVar.getNotificationCenter().k(qs.R5, new Object[0]);
                }
                g0.r(wjVar);
                g0.i3(wjVar, 3600010L);
                break;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    qp qpVar2 = this.b;
                    qpVar2.y8 = tL_webBrowserSettings2;
                    qpVar2.getNotificationCenter().k(qs.R5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
