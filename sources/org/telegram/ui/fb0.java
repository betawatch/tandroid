package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
