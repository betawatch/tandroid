package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class jl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ jl(mp mpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    mp mpVar = this.b;
                    mpVar.E8 = tL_webBrowserSettings;
                    mpVar.getNotificationCenter().k(ks.U5, new Object[0]);
                    break;
                }
                break;
            default:
                mp mpVar2 = this.b;
                rj rjVar = mpVar2.D8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    mpVar2.E8 = tL_webBrowserSettings2;
                    mpVar2.getNotificationCenter().k(ks.U5, new Object[0]);
                }
                g0.r(rjVar);
                g0.h3(rjVar, 3600010L);
                break;
        }
    }
}
