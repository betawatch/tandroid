package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ lf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.gc(false);
                break;
            default:
                this.b.gc(false);
                break;
        }
    }
}
