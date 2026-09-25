package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ fh0(sh0 sh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.a = i10;
        this.b = sh0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                sh0Var.getNotificationCenter().doOnIdle(new fh0(sh0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                sh0.U(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
