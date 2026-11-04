package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ eg(int i3, boolean[] zArr) {
        this.a = i3;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.a;
        boolean[] zArr = this.b;
        switch (i3) {
            case 0:
                zArr[0] = true;
                break;
            default:
                String str = LaunchActivity.E1;
                zArr[0] = true;
                break;
        }
    }
}
