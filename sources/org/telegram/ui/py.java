package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz b;

    public /* synthetic */ py(iz izVar, int i7) {
        this.a = i7;
        this.b = izVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(23, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new tp(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
