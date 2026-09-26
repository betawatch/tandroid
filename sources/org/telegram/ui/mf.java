package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ mf(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Nb(false);
                break;
            default:
                this.b.Nb(false);
                break;
        }
    }
}
