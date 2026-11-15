package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ jo(to toVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.a = i10;
        this.b = toVar;
        this.c = t1VarArr;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final int i7 = 1;
                    final to toVar = this.b;
                    final int i10 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ko
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    ConnectionsManager.getInstance(toVar.currentAccount).cancelRequest(i10, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(toVar.currentAccount).cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    toVar.showDialog(t1VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final int i11 = 0;
                    final to toVar2 = this.b;
                    final int i12 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ko
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    ConnectionsManager.getInstance(toVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(toVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    toVar2.showDialog(t1VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
