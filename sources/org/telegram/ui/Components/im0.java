package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ km0 b;

    public /* synthetic */ im0(km0 km0Var, int i10) {
        this.a = i10;
        this.b = km0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                km0 km0Var = this.b;
                km0Var.getClass();
                AndroidUtilities.runOnUIThread(new im0(km0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new im0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
