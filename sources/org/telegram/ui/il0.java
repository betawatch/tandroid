package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ il0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lf0(13, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new el0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lf0(12, this.b, tLObject));
                break;
        }
    }
}
