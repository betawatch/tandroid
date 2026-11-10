package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ c2(int i7, Runnable runnable, boolean[] zArr) {
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
                    int i10 = an.r1;
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
