package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ s50(u50 u50Var, int i9) {
        this.a = i9;
        this.b = u50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this.b, tL_error, tLObject, 24));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zq(22, this.b, tL_error));
                break;
        }
    }
}
