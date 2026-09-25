package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ gh(int i10, boolean[] zArr) {
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
