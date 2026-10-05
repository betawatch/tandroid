package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileRefController b;
    public final /* synthetic */ TLRPC.TL_messages_sendMultiMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.a = i10;
        this.b = fileRefController;
        this.c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onUpdateObjectReference$30(this.c, this.d);
                break;
            default:
                this.b.lambda$sendErrorToObject$41(this.c, this.d);
                break;
        }
    }
}
