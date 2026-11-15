package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uk(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = updates;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.O3(this.c, this.d);
                break;
            default:
                Utilities.d.c(new uk(this.b, this.c, this.d, 0));
                break;
        }
    }
}
