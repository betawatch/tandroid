package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ jn(pn pnVar, int i7) {
        this.a = i7;
        this.b = pnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ln(this.b, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new ln(this.b, 4));
                break;
        }
    }
}
