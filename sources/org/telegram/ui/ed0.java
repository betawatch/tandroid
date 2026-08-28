package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ed0(pd0 pd0Var, String str, int i9) {
        this.a = i9;
        this.b = pd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
