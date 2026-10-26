package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ gg(un unVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.getClass();
                unVar.presentFragment(un.ba(this.c.id));
                break;
            default:
                this.b.wa(this.c);
                break;
        }
    }
}
