package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fd0(pd0 pd0Var, String str, int i10) {
        this.a = i10;
        this.b = pd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
