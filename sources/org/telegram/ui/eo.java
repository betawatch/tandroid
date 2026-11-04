package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ eo(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10) {
        this.a = i10;
        this.b = qoVar;
        this.c = s1VarArr;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.c;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final int i3 = 1;
                    final qo qoVar = this.b;
                    final int i10 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i3) {
                                case 0:
                                    ConnectionsManager.getInstance(qoVar.currentAccount).cancelRequest(i10, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(qoVar.currentAccount).cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    qoVar.showDialog(s1VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.c;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final int i11 = 0;
                    final qo qoVar2 = this.b;
                    final int i12 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    ConnectionsManager.getInstance(qoVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(qoVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    qoVar2.showDialog(s1VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
