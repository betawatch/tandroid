package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u60 b;

    public /* synthetic */ s60(u60 u60Var, int i10) {
        this.a = i10;
        this.b = u60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gf(this.b, tL_error, tLObject, 11));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hy(13, this.b, tL_error));
                break;
        }
    }
}
