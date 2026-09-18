package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.a = i10;
        this.b = ai0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ai0 ai0Var = this.b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                ai0.U(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
