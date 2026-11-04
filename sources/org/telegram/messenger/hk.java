package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ hk(hp hpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i3, long j11) {
        this.b = hpVar;
        this.f = arrayList;
        this.c = j10;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = hVar;
        this.d = i3;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                boolean[] zArr = (boolean[]) this.f;
                qr qrVar = (qr) this.h;
                long j10 = this.c;
                Runnable[] runnableArr = (Runnable[]) this.n;
                long j11 = this.e;
                int i3 = this.d;
                vo voVar = (vo) this.r;
                if (!zArr[0]) {
                    g0.h3(new ib(hpVar, zArr, qrVar.O(j10), runnableArr, j11, i3, voVar));
                    break;
                }
                break;
            default:
                hp hpVar2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j12 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.n;
                a0.h hVar2 = (a0.h) this.r;
                int i10 = this.d;
                long j13 = this.e;
                if (arrayList.isEmpty()) {
                    chat = chat2;
                    hVar = hVar2;
                } else {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        TLRPC.Chat chat3 = chat2;
                        a0.h hVar3 = hVar2;
                        ArrayList arrayList2 = arrayList;
                        long[] a22 = hpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.id, 0, -1, 0);
                        if (a22 != null) {
                            sparseArray.put(tL_updateMessageID.id, a22);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        g0.h3(new tl(hpVar2, sparseArray, 1));
                    }
                }
                Utilities.d.c(new vl(hpVar2, updates_channeldifference, j12, chat, hVar, i10, j13));
                break;
        }
    }

    public /* synthetic */ hk(hp hpVar, boolean[] zArr, qr qrVar, long j10, Runnable[] runnableArr, long j11, int i3, vo voVar) {
        this.b = hpVar;
        this.f = zArr;
        this.h = qrVar;
        this.c = j10;
        this.n = runnableArr;
        this.e = j11;
        this.d = i3;
        this.r = voVar;
    }
}
