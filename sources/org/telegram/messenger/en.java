package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class en implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ en(gp gpVar, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = gpVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
