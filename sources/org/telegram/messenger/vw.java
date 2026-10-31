package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ vw(qz qzVar, TLRPC.Updates updates, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().L3(this.c, false);
                break;
            default:
                this.b.getMessagesController().L3(this.c, false);
                break;
        }
    }
}
