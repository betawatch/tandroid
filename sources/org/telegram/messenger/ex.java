package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ex implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ex(qz qzVar, TLRPC.Message message, boolean z10, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz qzVar = this.b;
                qzVar.getClass();
                TLRPC.Message message = this.c;
                qzVar.d0(message.id);
                qzVar.i0(message.id, this.d);
                break;
            case 1:
                qz qzVar2 = this.b;
                qzVar2.getClass();
                TLRPC.Message message2 = this.c;
                qzVar2.d0(message2.id);
                qzVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
