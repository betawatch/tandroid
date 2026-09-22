package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ fc(ad adVar, int i10) {
        this.a = i10;
        this.b = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ad.U(this.b);
                break;
            default:
                org.telegram.messenger.y0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
