package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ b5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.a = i7;
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
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.a.c(new dr(messagesStorage, false, 0));
                    break;
                }
                break;
            default:
                g5 g5Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                g5Var2.k0 = hashMap;
                g5Var2.l0 = hashMap2;
                break;
        }
    }
}
