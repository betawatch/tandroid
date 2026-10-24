package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ mg(sn snVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = snVar;
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
                    final sn snVar = this.b;
                    final int i11 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    snVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    snVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    snVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    snVar.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = 1;
                    final sn snVar2 = this.b;
                    final int i13 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    snVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    snVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    snVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    snVar2.showDialog(c2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final int i14 = 2;
                    final sn snVar3 = this.b;
                    final int i15 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    snVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    snVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    snVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    snVar3.showDialog(c2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
