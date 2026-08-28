package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ lg(qn qnVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = c2VarArr;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i9 = 0;
                    final qn qnVar = this.b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ug
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i9) {
                                case 0:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                case 1:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                default:
                                    qnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    qnVar.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i11 = 1;
                    final qn qnVar2 = this.b;
                    final int i12 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ug
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    qnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                case 1:
                                    qnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                default:
                                    qnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    qnVar2.showDialog(c2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final int i13 = 2;
                    final qn qnVar3 = this.b;
                    final int i14 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ug
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    qnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                case 1:
                                    qnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                default:
                                    qnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    qnVar3.showDialog(c2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
