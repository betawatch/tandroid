package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ gg(bn bnVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.c.id));
                break;
            default:
                this.b.Pa(this.c);
                break;
        }
    }
}
