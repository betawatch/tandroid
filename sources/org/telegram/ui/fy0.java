package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ fy0(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.a) {
            case 0:
                int i10 = 2 - i9;
                if (i10 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i10);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
            default:
                int i11 = 2 - i9;
                if (i11 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
        }
    }
}
