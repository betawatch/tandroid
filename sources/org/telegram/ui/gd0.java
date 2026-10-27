package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gd0(qd0 qd0Var, String str, int i10) {
        this.a = i10;
        this.b = qd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new id0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new id0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
