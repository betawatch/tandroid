package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ np(xp xpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = xpVar;
        this.c = b2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 1;
                    final xp xpVar = this.b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.op
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(xpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    xpVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 0;
                    final xp xpVar2 = this.b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.op
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(xpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    xpVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
