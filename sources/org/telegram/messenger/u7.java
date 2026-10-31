package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ f1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ u7(b8 b8Var, TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ic icVar, Object obj, String str, long j10, int i10, int i11) {
        this.e = b8Var;
        this.f = document;
        this.h = pwVar;
        this.n = b30Var;
        this.r = tL_fileLocationToBeDeprecated;
        this.s = icVar;
        this.w = obj;
        this.x = str;
        this.c = j10;
        this.b = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.h hVar;
        int i10 = this.a;
        Object obj = this.x;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.n;
        Object obj5 = this.h;
        Object obj6 = this.f;
        f1 f1Var = this.e;
        switch (i10) {
            case 0:
                ((b8) f1Var).Z((TLRPC.Document) obj6, (pw) obj5, (b30) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (ic) obj2, this.w, (String) obj, this.c, this.b, null, 0L, false, this.d);
                break;
            default:
                ui uiVar = (ui) f1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = uiVar.J;
                ConcurrentHashMap concurrentHashMap = uiVar.N;
                a0.h hVar6 = uiVar.I;
                ArrayList[] arrayListArr = uiVar.G;
                int i11 = 0;
                while (true) {
                    int i12 = this.b;
                    Runnable runnable2 = runnable;
                    if (i11 >= arrayListArr[i12].size()) {
                        HashMap hashMap3 = hashMap2;
                        int i13 = 0;
                        while (i13 < hVar2.m()) {
                            hVar6.k((TLRPC.TL_messages_stickerSet) hVar2.n(i13), hVar2.j(i13));
                            if (i12 == 3 || i12 == 6 || i12 == 4) {
                                hVar = hVar3;
                            } else {
                                hVar = hVar3;
                                hVar5.k((TLRPC.TL_messages_stickerSet) hVar2.n(i13), hVar2.j(i13));
                            }
                            i13++;
                            hVar3 = hVar;
                        }
                        concurrentHashMap.putAll(hashMap);
                        arrayListArr[i12] = arrayList;
                        uiVar.X[i12] = this.c;
                        uiVar.Y[i12] = this.d;
                        uiVar.H[i12] = hVar3;
                        if (i12 == 0) {
                            uiVar.d0 = hashMap3;
                            uiVar.c0 = hVar4;
                        } else if (i12 == 3) {
                            uiVar.e0 = hashMap3;
                        }
                        uiVar.getNotificationCenter().k(60, Integer.valueOf(i12), Boolean.TRUE);
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i12].get(i11)).set;
                        HashMap hashMap4 = hashMap2;
                        hVar6.l(stickerSet.id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i12 != 3 && i12 != 6 && i12 != 4) {
                            hVar5.l(stickerSet.id);
                        }
                        i11++;
                        runnable = runnable2;
                        hashMap2 = hashMap4;
                    }
                }
                break;
        }
    }

    public /* synthetic */ u7(ui uiVar, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = uiVar;
        this.b = i10;
        this.f = hVar;
        this.h = hashMap;
        this.n = arrayList;
        this.c = j10;
        this.d = i11;
        this.r = hVar2;
        this.s = hashMap2;
        this.w = hVar3;
        this.x = runnable;
    }
}
