package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ ao(jo joVar, int i10) {
        this.a = i10;
        this.b = joVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new co(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new co(this.b, 4));
                break;
        }
    }
}
