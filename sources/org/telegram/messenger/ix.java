package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ix implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ ix(qz qzVar, TLRPC.Message message, int i10, int i11) {
        this.a = i11;
        this.b = qzVar;
        this.c = message;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        TLRPC.Message message = this.c;
        qz qzVar = this.b;
        switch (i10) {
            case 0:
                message.send_state = 2;
                qzVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                qzVar.d0(message.id);
                qzVar.i0(message.id, i11 != 0);
                break;
            default:
                message.send_state = 0;
                qzVar.getNotificationCenter().k(20, Integer.valueOf(i11));
                break;
        }
    }
}
