package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ ou(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zw zwVar = this.b;
                if (zwVar.S3 != null) {
                    zwVar.getMessagesController().k4(0L, zwVar.S3);
                    zwVar.S3 = null;
                    zwVar.X4();
                    break;
                }
                break;
            case 1:
                this.b.n4(true);
                break;
            case 2:
                this.b.n4(true);
                break;
            default:
                zw.l0(this.b);
                break;
        }
    }
}
