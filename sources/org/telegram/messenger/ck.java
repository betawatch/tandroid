package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ck implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ bg.u c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ ck(qp qpVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = uVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                int i7 = qpVar.currentAccount;
                bg.u uVar = this.c;
                uVar.b(i7, this.d, this.e, 0);
                g0.h3(new vl(qpVar, uVar, 1));
                break;
            case 1:
                qp qpVar2 = this.b;
                int i10 = qpVar2.currentAccount;
                bg.u uVar2 = this.c;
                uVar2.b(i10, this.d, this.e, 0);
                g0.h3(new vl(qpVar2, uVar2, 2));
                break;
            default:
                qp qpVar3 = this.b;
                yr messagesStorage = qpVar3.getMessagesStorage();
                bg.u uVar3 = this.c;
                ArrayList arrayList = uVar3.a;
                ck ckVar = new ck(qpVar3, uVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, ckVar, 3));
                    break;
                }
                break;
        }
    }
}
