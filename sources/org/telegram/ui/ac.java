package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public /* synthetic */ ac(xc xcVar, int i9) {
        this.a = i9;
        this.b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xc.T(this.b);
                break;
            default:
                org.telegram.messenger.l0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.oc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
