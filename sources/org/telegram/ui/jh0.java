package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ jh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.a = i10;
        this.b = wh0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wh0 wh0Var = this.b;
                wh0Var.getNotificationCenter().doOnIdle(new jh0(wh0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                wh0.S(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
