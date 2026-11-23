package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fb0(pb0 pb0Var, String str, int i7) {
        this.a = i7;
        this.b = pb0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new hb0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new hb0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
