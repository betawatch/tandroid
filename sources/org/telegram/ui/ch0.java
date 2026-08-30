package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ch0(ph0 ph0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.a = i10;
        this.b = ph0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ph0 ph0Var = this.b;
                ph0Var.getNotificationCenter().doOnIdle(new ch0(ph0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                ph0.U(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
