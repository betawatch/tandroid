package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ il(np npVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                tj tjVar = npVar.y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
                if (tL_webBrowserSettings != null) {
                    npVar.z8 = tL_webBrowserSettings;
                    npVar.getNotificationCenter().k(ns.R5, new Object[0]);
                }
                g0.r(tjVar);
                g0.i3(tjVar, 3600010L);
                break;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.c;
                if (tL_webBrowserSettings2 != null) {
                    np npVar2 = this.b;
                    npVar2.z8 = tL_webBrowserSettings2;
                    npVar2.getNotificationCenter().k(ns.R5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
