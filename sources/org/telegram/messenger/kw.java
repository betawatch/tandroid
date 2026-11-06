package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ kw(gz gzVar, TLRPC.Updates updates, int i7) {
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
