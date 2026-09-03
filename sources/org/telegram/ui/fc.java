package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ fc(dd ddVar, int i10) {
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
                kf.k0.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
