package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileRefController b;
    public final /* synthetic */ TLRPC.TL_messages_sendMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ s3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.a = i10;
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
