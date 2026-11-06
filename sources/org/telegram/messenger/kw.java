package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
