package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ bg.v c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ zj(mp mpVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = vVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                int i7 = mpVar.currentAccount;
                bg.v vVar = this.c;
                vVar.b(i7, this.d, this.e, 0);
                g0.g3(new pl(mpVar, vVar, 1));
                break;
            case 1:
                mp mpVar2 = this.b;
                int i10 = mpVar2.currentAccount;
                bg.v vVar2 = this.c;
                vVar2.b(i10, this.d, this.e, 0);
                g0.g3(new pl(mpVar2, vVar2, 2));
                break;
            default:
                mp mpVar3 = this.b;
                tr messagesStorage = mpVar3.getMessagesStorage();
                bg.v vVar3 = this.c;
                ArrayList arrayList = vVar3.a;
                zj zjVar = new zj(mpVar3, vVar3, this.d, this.e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new yf(messagesStorage, arrayList, zjVar, 3));
                    break;
                }
                break;
        }
    }
}
