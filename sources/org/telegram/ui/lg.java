package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(Object obj, int i10) {
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
                unVar.Mb = 0;
                unVar.Z4 = 0;
                unVar.H9();
                unVar.lc(false);
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
                ((ta0) this.b).b();
                break;
        }
    }
}
