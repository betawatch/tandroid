package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ rf.q c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ mk(wp wpVar, rf.q qVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = qVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                int i10 = wpVar.currentAccount;
                rf.q qVar = this.c;
                qVar.b(i10, this.d, this.e, 0);
                i0.g3(new tl(wpVar, qVar, 0));
                break;
            case 1:
                wp wpVar2 = this.b;
                int i11 = wpVar2.currentAccount;
                rf.q qVar2 = this.c;
                qVar2.b(i11, this.d, this.e, 0);
                i0.g3(new tl(wpVar2, qVar2, 2));
                break;
            default:
                wp wpVar3 = this.b;
                is messagesStorage = wpVar3.getMessagesStorage();
                rf.q qVar3 = this.c;
                ArrayList arrayList = qVar3.a;
                mk mkVar = new mk(wpVar3, qVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new ng(messagesStorage, arrayList, mkVar, 3));
                    break;
                }
                break;
        }
    }
}
