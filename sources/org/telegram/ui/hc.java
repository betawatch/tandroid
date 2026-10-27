package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
