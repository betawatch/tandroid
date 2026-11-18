package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ c1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ p7(w7 w7Var, TLRPC.Document document, yv yvVar, h20 h20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, fc fcVar, Object obj, String str, long j3, int i7, int i10) {
        this.e = w7Var;
        this.f = document;
        this.h = yvVar;
        this.n = h20Var;
        this.r = tL_fileLocationToBeDeprecated;
        this.s = fcVar;
        this.w = obj;
        this.x = str;
        this.c = j3;
        this.b = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.h hVar;
        int i7 = this.a;
        Object obj = this.x;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.n;
        Object obj5 = this.h;
        Object obj6 = this.f;
        c1 c1Var = this.e;
        switch (i7) {
            case 0:
                ((w7) c1Var).Y((TLRPC.Document) obj6, (yv) obj5, (h20) obj4, (TLRPC.TL_fileLocationToBeDeprecated) obj3, (fc) obj2, this.w, (String) obj, this.c, this.b, null, 0L, false, this.d);
                break;
            default:
                ri riVar = (ri) c1Var;
                a0.h hVar2 = (a0.h) obj6;
                HashMap hashMap = (HashMap) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar3 = (a0.h) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                a0.h hVar4 = (a0.h) this.w;
                Runnable runnable = (Runnable) obj;
                a0.h hVar5 = riVar.K;
                ConcurrentHashMap concurrentHashMap = riVar.O;
                a0.h hVar6 = riVar.J;
                ArrayList[] arrayListArr = riVar.H;
                int i10 = 0;
                while (true) {
                    int i11 = this.b;
                    Runnable runnable2 = runnable;
                    if (i10 >= arrayListArr[i11].size()) {
                        HashMap hashMap3 = hashMap2;
                        int i12 = 0;
                        while (i12 < hVar2.m()) {
                            hVar6.k((TLRPC.TL_messages_stickerSet) hVar2.n(i12), hVar2.j(i12));
                            if (i11 == 3 || i11 == 6 || i11 == 4) {
                                hVar = hVar3;
                            } else {
                                hVar = hVar3;
                                hVar5.k((TLRPC.TL_messages_stickerSet) hVar2.n(i12), hVar2.j(i12));
                            }
                            i12++;
                            hVar3 = hVar;
                        }
                        concurrentHashMap.putAll(hashMap);
                        arrayListArr[i11] = arrayList;
                        riVar.Y[i11] = this.c;
                        riVar.Z[i11] = this.d;
                        riVar.I[i11] = hVar3;
                        if (i11 == 0) {
                            riVar.e0 = hashMap3;
                            riVar.d0 = hVar4;
                        } else if (i11 == 3) {
                            riVar.f0 = hashMap3;
                        }
                        riVar.getNotificationCenter().k(60, Integer.valueOf(i11), Boolean.TRUE);
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i11].get(i10)).set;
                        HashMap hashMap4 = hashMap2;
                        hVar6.l(stickerSet.id);
                        concurrentHashMap.remove(stickerSet.short_name);
                        if (i11 != 3 && i11 != 6 && i11 != 4) {
                            hVar5.l(stickerSet.id);
                        }
                        i10++;
                        runnable = runnable2;
                        hashMap2 = hashMap4;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p7(ri riVar, int i7, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j3, int i10, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = riVar;
        this.b = i7;
        this.f = hVar;
        this.h = hashMap;
        this.n = arrayList;
        this.c = j3;
        this.d = i10;
        this.r = hVar2;
        this.s = hashMap2;
        this.w = hVar3;
        this.x = runnable;
    }
}
