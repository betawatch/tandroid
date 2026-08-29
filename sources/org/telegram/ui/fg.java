package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ fg(tn tnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                tnVar.getClass();
                tnVar.presentFragment(tn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
