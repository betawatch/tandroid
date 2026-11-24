// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class j77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ b54 c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ j77(oc7 oc7Var, b54 b54Var, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = b54Var;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        b54 b54Var = this.c;
        oc7 oc7Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                b54Var.b(oc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gm.c3(new y87(oc7Var, b54Var, b2));
                break;
            case 1:
                b54Var.b(oc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                gm.c3(new y87(oc7Var, b54Var, (byte) 2));
                break;
            default:
                oc7 oc7Var2 = this.b;
                cf7 messagesStorage = oc7Var2.getMessagesStorage();
                b54 b54Var2 = this.c;
                ArrayList arrayList = b54Var2.a;
                j77 j77Var = new j77(oc7Var2, b54Var2, this.d, this.e, (byte) 1);
                messagesStorage.getClass();
                if (!arrayList.isEmpty()) {
                    messagesStorage.H(new op6(messagesStorage, arrayList, j77Var, (byte) 3));
                    break;
                }
                break;
        }
    }
}
