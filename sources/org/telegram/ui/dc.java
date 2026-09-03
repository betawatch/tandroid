package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ dc(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bd.U(this.b);
                break;
            default:
                l.d.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
