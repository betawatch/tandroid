package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ bl(hp hpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                mj mjVar = hpVar.x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    hpVar.y8 = tL_webBrowserSettings;
                    hpVar.getNotificationCenter().k(hs.R5, new Object[0]);
                }
                g0.r(mjVar);
                g0.i3(mjVar, 3600010L);
                break;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    hp hpVar2 = this.b;
                    hpVar2.y8 = tL_webBrowserSettings2;
                    hpVar2.getNotificationCenter().k(hs.R5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
