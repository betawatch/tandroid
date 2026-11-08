package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ ig(int i7, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        boolean[] zArr = this.b;
        switch (i7) {
            case 0:
                zArr[0] = true;
                break;
            default:
                String str = LaunchActivity.B1;
                zArr[0] = true;
                break;
        }
    }
}
