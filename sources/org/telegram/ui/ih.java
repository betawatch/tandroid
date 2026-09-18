package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ ih(int i10, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.a;
        boolean[] zArr = this.b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                break;
            default:
                Pattern pattern = LaunchActivity.B1;
                zArr[0] = true;
                break;
        }
    }
}
