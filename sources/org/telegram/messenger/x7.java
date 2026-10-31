package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x7(b8 b8Var, TLRPC.Document document, boolean z10, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = document;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, this.d);
                break;
            default:
                this.b.b0(this.c, this.d);
                break;
        }
    }
}
