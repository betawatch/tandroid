package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ le0(xe0 xe0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i3) {
        this.a = i3;
        this.b = xe0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe0 xe0Var = this.b;
                xe0Var.getNotificationCenter().d(new le0(xe0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                xe0.Z(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
