package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ zk(vp vpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.b = vpVar;
        this.f = arrayList;
        this.c = j10;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                boolean[] zArr = (boolean[]) this.f;
                hs hsVar = (hs) this.h;
                long j10 = this.c;
                Runnable[] runnableArr = (Runnable[]) this.n;
                long j11 = this.e;
                int i10 = this.d;
                jp jpVar = (jp) this.r;
                if (!zArr[0]) {
                    i0.g3(new qb(vpVar, zArr, hsVar.O(j10), runnableArr, j11, i10, jpVar));
                    break;
                }
                break;
            default:
                vp vpVar2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j12 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.n;
                a0.h hVar2 = (a0.h) this.r;
                int i11 = this.d;
                long j13 = this.e;
                if (arrayList.isEmpty()) {
                    chat = chat2;
                    hVar = hVar2;
                } else {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        TLRPC.Chat chat3 = chat2;
                        a0.h hVar3 = hVar2;
                        ArrayList arrayList2 = arrayList;
                        long[] a2 = vpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.id, 0, -1, 0);
                        if (a2 != null) {
                            sparseArray.put(tL_updateMessageID.id, a2);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        i0.g3(new tl(vpVar2, sparseArray, 1));
                    }
                }
                Utilities.d.c(new zm(vpVar2, updates_channeldifference, j12, chat, hVar, i11, j13));
                break;
        }
    }

    public /* synthetic */ zk(vp vpVar, boolean[] zArr, hs hsVar, long j10, Runnable[] runnableArr, long j11, int i10, jp jpVar) {
        this.b = vpVar;
        this.f = zArr;
        this.h = hsVar;
        this.c = j10;
        this.n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.r = jpVar;
    }
}
