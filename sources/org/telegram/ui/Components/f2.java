package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    int i11 = un.m1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int i12 = bu.b;
                    break;
                }
                break;
        }
    }
}
