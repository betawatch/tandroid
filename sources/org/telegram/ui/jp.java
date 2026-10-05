package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ jp(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = tpVar;
        this.c = b2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 1;
                    final tp tpVar = this.b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.kp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(tpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(tpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    tpVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 0;
                    final tp tpVar2 = this.b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.kp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(tpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(tpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    tpVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
