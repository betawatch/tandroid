package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ zp0(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10, int i11) {
        this.a = i11;
        this.b = t1VarArr;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final int i7 = 0;
                    final int i10 = this.c;
                    final int i11 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.bq0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    t1VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final int i12 = 1;
                    final int i13 = this.c;
                    final int i14 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.bq0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(i13).cancelRequest(i14, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i13).cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    t1VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
