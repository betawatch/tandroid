package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ ic(dd ddVar, int i10) {
        this.a = i10;
        this.b = ddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dd.U(this.b);
                break;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
