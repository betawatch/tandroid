package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ kf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.lc(false);
                break;
            default:
                this.b.lc(false);
                break;
        }
    }
}
