package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ cg.t c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ tj(hp hpVar, cg.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = tVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                int i3 = hpVar.currentAccount;
                cg.t tVar = this.c;
                tVar.b(i3, this.d, this.e, 0);
                g0.h3(new ll(hpVar, tVar, 1));
                break;
            case 1:
                hp hpVar2 = this.b;
                int i10 = hpVar2.currentAccount;
                cg.t tVar2 = this.c;
                tVar2.b(i10, this.d, this.e, 0);
                g0.h3(new ll(hpVar2, tVar2, 2));
                break;
            default:
                hp hpVar3 = this.b;
                qr messagesStorage = hpVar3.getMessagesStorage();
                cg.t tVar3 = this.c;
                ArrayList arrayList = tVar3.a;
                tj tjVar = new tj(hpVar3, tVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new fg(messagesStorage, arrayList, tjVar, 3));
                    break;
                }
                break;
        }
    }
}
