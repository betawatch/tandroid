package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ bg.u c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ ak(np npVar, bg.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = uVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                int i7 = npVar.currentAccount;
                bg.u uVar = this.c;
                uVar.b(i7, this.d, this.e, 0);
                g0.h3(new sl(npVar, uVar, 1));
                break;
            case 1:
                np npVar2 = this.b;
                int i10 = npVar2.currentAccount;
                bg.u uVar2 = this.c;
                uVar2.b(i10, this.d, this.e, 0);
                g0.h3(new sl(npVar2, uVar2, 2));
                break;
            default:
                np npVar3 = this.b;
                vr messagesStorage = npVar3.getMessagesStorage();
                bg.u uVar3 = this.c;
                ArrayList arrayList = uVar3.a;
                ak akVar = new ak(npVar3, uVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new mg(messagesStorage, arrayList, akVar, 3));
                    break;
                }
                break;
        }
    }
}
