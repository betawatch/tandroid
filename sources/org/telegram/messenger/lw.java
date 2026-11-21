package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lw(zy zyVar, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zy zyVar = this.b;
                zyVar.getClass();
                TLRPC.Message message = this.c;
                zyVar.d0(message.id);
                zyVar.i0(message.id, this.d);
                break;
            case 1:
                zy zyVar2 = this.b;
                zyVar2.getClass();
                TLRPC.Message message2 = this.c;
                zyVar2.d0(message2.id);
                zyVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
