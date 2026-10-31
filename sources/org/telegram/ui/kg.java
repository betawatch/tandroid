package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                unVar.p9 = true;
                unVar.n9 = 0;
                unVar.Lb = 0;
                unVar.Z4 = 0;
                unVar.C9();
                unVar.gc(false);
                break;
            case 1:
                oo ooVar = (oo) this.b;
                ooVar.M0 = false;
                ooVar.b = null;
                ooVar.N0 = false;
                break;
            case 2:
                ((qp) this.b).n = null;
                break;
            default:
                ((ua0) this.b).b();
                break;
        }
    }
}
