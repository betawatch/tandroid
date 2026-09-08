package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ of(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
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
