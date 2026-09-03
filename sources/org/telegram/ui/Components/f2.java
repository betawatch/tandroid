package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ f2(int i10, Runnable runnable, boolean[] zArr) {
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
                    int i11 = rn.j1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int i12 = xt.b;
                    break;
                }
                break;
        }
    }
}
