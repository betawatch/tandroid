package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ de0(ee0 ee0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = ee0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
