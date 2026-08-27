package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public /* synthetic */ bc(xc xcVar, int i10) {
        this.a = i10;
        this.b = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xc.U(this.b);
                break;
            default:
                org.telegram.messenger.y1.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.mc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
