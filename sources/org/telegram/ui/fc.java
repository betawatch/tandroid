package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
