package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ g2(int i10, Runnable runnable, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        boolean[] zArr = this.b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = tn.m1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int i12 = zt.b;
                    break;
                }
                break;
        }
    }
}
