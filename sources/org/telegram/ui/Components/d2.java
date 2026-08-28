package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ d2(int i9, Runnable runnable, boolean[] zArr) {
        this.a = i9;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.a;
        boolean[] zArr = this.b;
        switch (i9) {
            case 0:
                if (zArr[0]) {
                    int i10 = jn.i1;
                    break;
                }
                break;
            default:
                if (zArr[0]) {
                    int i11 = mt.b;
                    break;
                }
                break;
        }
    }
}
