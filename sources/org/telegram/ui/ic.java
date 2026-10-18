package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ ic(dd ddVar, int i10) {
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
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
