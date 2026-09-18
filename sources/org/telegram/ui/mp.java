package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ mp(wp wpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = wpVar;
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
                    final int i10 = 1;
                    final wp wpVar = this.b;
                    final int i11 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.np
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(wpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    wpVar.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = 0;
                    final wp wpVar2 = this.b;
                    final int i13 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.np
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(wpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    wpVar2.showDialog(c2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
