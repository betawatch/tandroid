package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ rf.q c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ lk(vp vpVar, rf.q qVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = qVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                int i10 = vpVar.currentAccount;
                rf.q qVar = this.c;
                qVar.b(i10, this.d, this.e, 0);
                i0.g3(new sl(vpVar, qVar, 0));
                break;
            case 1:
                vp vpVar2 = this.b;
                int i11 = vpVar2.currentAccount;
                rf.q qVar2 = this.c;
                qVar2.b(i11, this.d, this.e, 0);
                i0.g3(new sl(vpVar2, qVar2, 2));
                break;
            default:
                vp vpVar3 = this.b;
                hs messagesStorage = vpVar3.getMessagesStorage();
                rf.q qVar3 = this.c;
                ArrayList arrayList = qVar3.a;
                lk lkVar = new lk(vpVar3, qVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new mg(messagesStorage, arrayList, lkVar, 3));
                    break;
                }
                break;
        }
    }
}
