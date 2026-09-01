package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pd0(zd0 zd0Var, String str, int i10) {
        this.a = i10;
        this.b = zd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new rd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
