package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    int i10 = jn.s1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int[] iArr = ft.d2;
                    break;
                }
                break;
        }
    }
}
