package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ pp(aq aqVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = aqVar;
        this.c = a2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final int i10 = 1;
                    final aq aqVar = this.b;
                    final int i11 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.qp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(aqVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(aqVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    aqVar.showDialog(a2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = 0;
                    final aq aqVar2 = this.b;
                    final int i13 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.qp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(aqVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(aqVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    aqVar2.showDialog(a2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
