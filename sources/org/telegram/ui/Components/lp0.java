package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ lp0(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10, int i11) {
        this.a = i11;
        this.b = u1VarArr;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final int i7 = 0;
                    final int i10 = this.c;
                    final int i11 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.op0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    u1VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final int i12 = 1;
                    final int i13 = this.c;
                    final int i14 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.op0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(i13).cancelRequest(i14, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i13).cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    u1VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
