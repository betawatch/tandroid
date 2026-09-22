package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ cd(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(23, this.b, tLObject));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.b, 3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(21, this.b, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
