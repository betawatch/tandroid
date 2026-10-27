package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ep(pp ppVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = ppVar;
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
                    final int i10 = 1;
                    final pp ppVar = this.b;
                    final int i11 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(ppVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(ppVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    ppVar.showDialog(e2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final int i12 = 0;
                    final pp ppVar2 = this.b;
                    final int i13 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(ppVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(ppVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    ppVar2.showDialog(e2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
