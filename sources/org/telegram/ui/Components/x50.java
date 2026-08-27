package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ x50(z50 z50Var, int i10) {
        this.a = i10;
        this.b = z50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this.b, tL_error, tLObject, 18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq(22, this.b, tL_error));
                break;
        }
    }
}
