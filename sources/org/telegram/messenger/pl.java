package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ pl(vp vpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                zj zjVar = vpVar.y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    vpVar.z8 = tL_webBrowserSettings;
                    vpVar.getNotificationCenter().k(zs.R5, new Object[0]);
                }
                i0.r(zjVar);
                i0.h3(zjVar, 3600010L);
                break;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    vp vpVar2 = this.b;
                    vpVar2.z8 = tL_webBrowserSettings2;
                    vpVar2.getNotificationCenter().k(zs.R5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
