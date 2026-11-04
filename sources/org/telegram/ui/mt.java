package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ mt(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.a) {
            case 0:
                int i10 = 2 - i3;
                if (i10 != this.b) {
                    org.telegram.messenger.az.w(i10);
                    break;
                } else {
                    org.telegram.messenger.az.w(-1);
                    break;
                }
            default:
                int i11 = 2 - i3;
                if (i11 != this.b) {
                    org.telegram.messenger.az.w(i11);
                    break;
                } else {
                    org.telegram.messenger.az.w(-1);
                    break;
                }
        }
    }
}
