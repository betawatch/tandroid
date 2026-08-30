package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ po b;

    public /* synthetic */ ho(po poVar, int i10) {
        this.a = i10;
        this.b = poVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jo(this.b, 4));
                break;
        }
    }
}
