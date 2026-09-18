package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd b;

    public /* synthetic */ hc(cd cdVar, int i10) {
        this.a = i10;
        this.b = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cd.U(this.b);
                break;
            default:
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
