package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ eh(int i10, boolean[] zArr) {
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
