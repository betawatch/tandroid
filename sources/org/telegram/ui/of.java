package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ of(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
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
