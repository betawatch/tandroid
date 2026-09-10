package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                org.telegram.messenger.a2.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
