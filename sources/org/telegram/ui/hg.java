package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ hg(cn cnVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(this.c.id));
                break;
            default:
                this.b.Oa(this.c);
                break;
        }
    }
}
