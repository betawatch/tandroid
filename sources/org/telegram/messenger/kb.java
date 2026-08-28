package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class kb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ kb(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i9) {
        this.a = i9;
        this.b = messagesController;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadWebBrowserConfig$510(this.c);
                break;
            default:
                this.b.lambda$loadWebBrowserConfig$508(this.c);
                break;
        }
    }
}
