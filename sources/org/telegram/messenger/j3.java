package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileRefController b;
    public final /* synthetic */ TLRPC.TL_messages_sendMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ j3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i9) {
        this.a = i9;
        this.b = fileRefController;
        this.c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onUpdateObjectReference$31(this.c, this.d);
                break;
            default:
                this.b.lambda$sendErrorToObject$42(this.c, this.d);
                break;
        }
    }
}
