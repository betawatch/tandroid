package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ hp(sp spVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = spVar;
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
                    final sp spVar = this.b;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ip
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(spVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(spVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    spVar.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = 0;
                    final sp spVar2 = this.b;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ip
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(spVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(spVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    spVar2.showDialog(d2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
