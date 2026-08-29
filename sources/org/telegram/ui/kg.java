package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ kg(tn tnVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = tnVar;
        this.c = c2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i10 = 0;
                    final tn tnVar = this.b;
                    final int i11 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.tg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    tnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    tnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    tnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    tnVar.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = 1;
                    final tn tnVar2 = this.b;
                    final int i13 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.tg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    tnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    tnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    tnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    tnVar2.showDialog(c2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final int i14 = 2;
                    final tn tnVar3 = this.b;
                    final int i15 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.tg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    tnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    tnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    tnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    tnVar3.showDialog(c2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
