package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                cd.S(this.b);
                break;
            default:
                org.telegram.messenger.q.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
