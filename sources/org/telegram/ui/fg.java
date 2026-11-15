package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ fg(int i7, boolean[] zArr) {
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
                String str = LaunchActivity.C1;
                zArr[0] = true;
                break;
        }
    }
}
