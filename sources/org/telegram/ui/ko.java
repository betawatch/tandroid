package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ko(uo uoVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.a = i10;
        this.b = uoVar;
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
                    final int i7 = 1;
                    final uo uoVar = this.b;
                    final int i10 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.lo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    ConnectionsManager.getInstance(uoVar.currentAccount).cancelRequest(i10, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(uoVar.currentAccount).cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    uoVar.showDialog(u1VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final int i11 = 0;
                    final uo uoVar2 = this.b;
                    final int i12 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.lo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    ConnectionsManager.getInstance(uoVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(uoVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    uoVar2.showDialog(u1VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
