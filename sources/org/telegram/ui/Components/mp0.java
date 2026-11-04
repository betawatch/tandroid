package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ mp0(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10, int i11) {
        this.a = i11;
        this.b = s1VarArr;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final int i3 = 0;
                    final int i10 = this.c;
                    final int i11 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.pp0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i3) {
                                case 0:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    s1VarArr[0].show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final int i12 = 1;
                    final int i13 = this.c;
                    final int i14 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.pp0
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
                    s1VarArr2[0].show();
                    break;
                }
                break;
        }
    }
}
