package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ nf(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
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
