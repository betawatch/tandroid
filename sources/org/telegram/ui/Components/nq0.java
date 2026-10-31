package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ nq0(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11, int i12) {
        this.a = i12;
        this.b = x1VarArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    final int i10 = 0;
                    final int i11 = this.c;
                    final int i12 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.rq0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    x1VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final int i13 = 1;
                    final int i14 = this.c;
                    final int i15 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.rq0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    ConnectionsManager.getInstance(i14).cancelRequest(i15, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i14).cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    x1VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
