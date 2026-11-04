package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ b5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i3) {
        this.a = i3;
        this.b = g5Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                Utilities.e.c(new b5(g5Var, this.c, this.d, 1));
                if (!g5Var.e) {
                    g5Var.e = true;
                    qr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.a.c(new vq(messagesStorage, false, 0));
                    break;
                }
                break;
            default:
                g5 g5Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                g5Var2.l0 = hashMap;
                g5Var2.m0 = hashMap2;
                break;
        }
    }
}
