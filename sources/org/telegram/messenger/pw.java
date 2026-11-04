package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ pw(yy yyVar, TLRPC.Message message, int i3, int i10) {
        this.a = i10;
        this.b = yyVar;
        this.c = message;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.d;
        TLRPC.Message message = this.c;
        yy yyVar = this.b;
        switch (i3) {
            case 0:
                message.send_state = 2;
                yyVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                yyVar.d0(message.id);
                yyVar.i0(message.id, i10 != 0);
                break;
            default:
                message.send_state = 0;
                yyVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                break;
        }
    }
}
