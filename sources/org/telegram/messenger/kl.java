package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ kl(np npVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    np npVar = this.b;
                    npVar.E8 = tL_webBrowserSettings;
                    npVar.getNotificationCenter().k(ls.U5, new Object[0]);
                    break;
                }
                break;
            default:
                np npVar2 = this.b;
                sj sjVar = npVar2.D8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    npVar2.E8 = tL_webBrowserSettings2;
                    npVar2.getNotificationCenter().k(ls.U5, new Object[0]);
                }
                g0.r(sjVar);
                g0.h3(sjVar, 3600010L);
                break;
        }
    }
}
