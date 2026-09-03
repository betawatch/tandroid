package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ gp(rp rpVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = rpVar;
        this.c = d2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final int i10 = 1;
                    final rp rpVar = this.b;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.hp
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
                    rpVar.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = 0;
                    final rp rpVar2 = this.b;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.hp
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
                    rpVar2.showDialog(d2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
