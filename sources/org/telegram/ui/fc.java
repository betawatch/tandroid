package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
