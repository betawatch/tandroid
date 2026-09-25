package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
