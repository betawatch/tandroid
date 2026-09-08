package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ fc(bd bdVar, int i10) {
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
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
