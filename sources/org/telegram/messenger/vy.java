package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ vy(qz qzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz qzVar = this.b;
                qzVar.getMessagesController().L3(this.c, false);
                i0.g3(new ex(qzVar, this.d, this.e, 0));
                break;
            default:
                qz qzVar2 = this.b;
                qzVar2.getMessagesController().L3(this.c, false);
                i0.g3(new ex(qzVar2, this.d, this.e, 1));
                break;
        }
    }
}
