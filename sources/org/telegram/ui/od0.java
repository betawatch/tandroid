package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ od0(yd0 yd0Var, String str, int i10) {
        this.a = i10;
        this.b = yd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new qd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
