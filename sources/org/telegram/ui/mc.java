package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;

    public /* synthetic */ mc(hd hdVar, int i10) {
        this.a = i10;
        this.b = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd.U(this.b);
                break;
            default:
                org.telegram.messenger.q.r(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.zc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
