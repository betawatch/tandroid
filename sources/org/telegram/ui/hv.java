package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ hv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                gy.i0(this.b);
                break;
            case 1:
                gy gyVar = this.b;
                if (gyVar.O3 != null) {
                    gyVar.getMessagesController().removeSuggestion(0L, gyVar.O3);
                    gyVar.O3 = null;
                    gyVar.L4();
                    break;
                }
                break;
            case 2:
                this.b.b4(true);
                break;
            default:
                this.b.b4(true);
                break;
        }
    }
}
