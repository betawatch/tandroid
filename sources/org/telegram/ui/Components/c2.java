package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ c2(int i3, Runnable runnable, boolean[] zArr) {
        this.a = i3;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.a;
        boolean[] zArr = this.b;
        switch (i3) {
            case 0:
                if (zArr[0]) {
                    int i10 = an.s1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int[] iArr = xs.Y1;
                    break;
                }
                break;
        }
    }
}
