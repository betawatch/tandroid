package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.a = i7;
        this.b = i5Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                Utilities.e.c(new c5(i5Var, this.c, this.d, 1));
                if (!i5Var.e) {
                    i5Var.e = true;
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.a.c(new yq(messagesStorage, false, 0));
                    break;
                }
                break;
            default:
                i5 i5Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                i5Var2.l0 = hashMap;
                i5Var2.m0 = hashMap2;
                break;
        }
    }
}
