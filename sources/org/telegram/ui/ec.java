package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ ec(bd bdVar, int i10) {
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
                kh.a2.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
