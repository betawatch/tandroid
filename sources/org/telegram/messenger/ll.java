package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                vj vjVar = qpVar.x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    qpVar.y8 = tL_webBrowserSettings;
                    qpVar.getNotificationCenter().k(qs.R5, new Object[0]);
                }
                g0.r(vjVar);
                g0.i3(vjVar, 3600010L);
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
