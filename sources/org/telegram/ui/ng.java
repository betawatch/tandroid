package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ng(wn wnVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = wnVar;
        this.c = e2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final int i10 = 0;
                    final wn wnVar = this.b;
                    final int i11 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    wnVar.showDialog(e2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final int i12 = 1;
                    final wn wnVar2 = this.b;
                    final int i13 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    wnVar2.showDialog(e2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr3 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr3[0];
                if (e2Var3 != null) {
                    final int i14 = 2;
                    final wn wnVar3 = this.b;
                    final int i15 = this.d;
                    e2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    wnVar3.showDialog(e2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
