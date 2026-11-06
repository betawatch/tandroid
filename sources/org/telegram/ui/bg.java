package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ bg(an anVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.a = i10;
        this.b = anVar;
        this.c = u1VarArr;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final int i7 = 0;
                    final an anVar = this.b;
                    final int i10 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                case 1:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                default:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    anVar.showDialog(u1VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final int i11 = 1;
                    final an anVar2 = this.b;
                    final int i12 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                case 1:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                default:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    anVar2.showDialog(u1VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr3 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr3[0];
                if (u1Var3 != null) {
                    final int i13 = 2;
                    final an anVar3 = this.b;
                    final int i14 = this.d;
                    u1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                case 1:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                default:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    anVar3.showDialog(u1VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
