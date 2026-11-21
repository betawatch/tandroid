package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ dw(zy zyVar, TLRPC.Updates updates, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().V3(this.c, false);
                break;
            default:
                this.b.getMessagesController().V3(this.c, false);
                break;
        }
    }
}
