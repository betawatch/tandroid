package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
