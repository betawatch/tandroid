package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ ql(wp wpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                ak akVar = wpVar.y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    wpVar.z8 = tL_webBrowserSettings;
                    wpVar.getNotificationCenter().k(at.R5, new Object[0]);
                }
                i0.r(akVar);
                i0.h3(akVar, 3600010L);
                break;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    wp wpVar2 = this.b;
                    wpVar2.z8 = tL_webBrowserSettings2;
                    wpVar2.getNotificationCenter().k(at.R5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
