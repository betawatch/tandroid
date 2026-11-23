package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ bg.v c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ ak(np npVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = vVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                int i7 = npVar.currentAccount;
                bg.v vVar = this.c;
                vVar.b(i7, this.d, this.e, 0);
                g0.g3(new ql(npVar, vVar, 1));
                break;
            case 1:
                np npVar2 = this.b;
                int i10 = npVar2.currentAccount;
                bg.v vVar2 = this.c;
                vVar2.b(i10, this.d, this.e, 0);
                g0.g3(new ql(npVar2, vVar2, 2));
                break;
            default:
                np npVar3 = this.b;
                ur messagesStorage = npVar3.getMessagesStorage();
                bg.v vVar3 = this.c;
                ArrayList arrayList = vVar3.a;
                ak akVar = new ak(npVar3, vVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new zf(messagesStorage, arrayList, akVar, 3));
                    break;
                }
                break;
        }
    }
}
