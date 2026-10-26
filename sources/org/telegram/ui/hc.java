package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ hc(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bd.V(this.b);
                break;
            default:
                org.telegram.messenger.t.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.b0(this.b), R.raw.done, 36);
                break;
        }
    }
}
