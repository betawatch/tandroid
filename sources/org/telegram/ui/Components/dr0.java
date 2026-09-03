package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ dr0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11, int i12) {
        this.a = i12;
        this.b = d2VarArr;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final int i10 = 0;
                    final int i11 = this.c;
                    final int i12 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.jr0
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
                    d2VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i13 = 1;
                    final int i14 = this.c;
                    final int i15 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.jr0
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
                    d2VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
