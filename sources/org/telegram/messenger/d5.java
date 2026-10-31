package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ d5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i10) {
        this.a = i10;
        this.b = i5Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                Utilities.e.c(new d5(i5Var, this.c, this.d, 1));
                if (!i5Var.e) {
                    i5Var.e = true;
                    hs messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.a.c(new kr(messagesStorage, false, 0));
                    break;
                }
                break;
            default:
                i5 i5Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                i5Var2.k0 = hashMap;
                i5Var2.l0 = hashMap2;
                break;
        }
    }
}
