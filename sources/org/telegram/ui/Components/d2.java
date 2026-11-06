package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ d2(int i7, Runnable runnable, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        boolean[] zArr = this.b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.r1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int[] iArr = ys.X1;
                    break;
                }
                break;
        }
    }
}
