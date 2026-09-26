package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class az0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ az0(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
            default:
                int i12 = 2 - i10;
                if (i12 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
        }
    }
}
