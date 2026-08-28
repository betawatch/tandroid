package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ kq0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10, int i11) {
        this.a = i11;
        this.b = c2VarArr;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i9 = 0;
                    final int i10 = this.c;
                    final int i11 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.qq0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i9) {
                                case 0:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    c2VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i12 = 1;
                    final int i13 = this.c;
                    final int i14 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.qq0
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
                    c2VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
