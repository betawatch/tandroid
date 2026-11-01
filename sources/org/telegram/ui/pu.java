package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ pu(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 != this.b) {
                    org.telegram.messenger.uz.w(i11);
                    break;
                } else {
                    org.telegram.messenger.uz.w(-1);
                    break;
                }
            default:
                int i12 = 2 - i10;
                if (i12 != this.b) {
                    org.telegram.messenger.uz.w(i12);
                    break;
                } else {
                    org.telegram.messenger.uz.w(-1);
                    break;
                }
        }
    }
}
