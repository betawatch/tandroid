package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ o1(int i7, int[] iArr, org.telegram.ui.q10 q10Var) {
        this.b = i7;
        this.c = iArr;
        this.d = q10Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i7) {
            case 0:
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o1(int[] iArr, int i7, Runnable runnable) {
        this.c = iArr;
        this.b = i7;
        this.d = runnable;
    }
}
