package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ hp(rp rpVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = rpVar;
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
                    final rp rpVar = this.b;
                    final int i11 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ip
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(rpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(rpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    rpVar.showDialog(a2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = 0;
                    final rp rpVar2 = this.b;
                    final int i13 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ip
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(rpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(rpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    rpVar2.showDialog(a2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
