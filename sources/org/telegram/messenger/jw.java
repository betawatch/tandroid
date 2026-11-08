package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ jw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().O3(this.c, false);
                break;
            default:
                this.b.getMessagesController().O3(this.c, false);
                break;
        }
    }
}
