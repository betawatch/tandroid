package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.a = i7;
        this.b = w7Var;
        this.c = document;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d0(this.c, this.d);
                break;
            default:
                this.b.a0(this.c, this.d);
                break;
        }
    }
}
