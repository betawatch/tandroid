package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ mk(mp mpVar, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.b = mpVar;
        this.f = arrayList;
        this.c = j3;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = hVar;
        this.d = i7;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                boolean[] zArr = (boolean[]) this.f;
                tr trVar = (tr) this.h;
                long j3 = this.c;
                Runnable[] runnableArr = (Runnable[]) this.n;
                long j10 = this.e;
                int i7 = this.d;
                ap apVar = (ap) this.r;
                if (!zArr[0]) {
                    g0.g3(new nb(mpVar, zArr, trVar.O(j3), runnableArr, j10, i7, apVar));
                    break;
                }
                break;
            default:
                mp mpVar2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j11 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.n;
                a0.h hVar2 = (a0.h) this.r;
                int i10 = this.d;
                long j12 = this.e;
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
                        long[] a22 = mpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j11, null, tL_updateMessageID.id, 0, -1, 0);
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
                        g0.g3(new sl(mpVar2, sparseArray, 1));
                    }
                }
                Utilities.d.c(new jm(mpVar2, updates_channeldifference, j11, chat, hVar, i10, j12));
                break;
        }
    }

    public /* synthetic */ mk(mp mpVar, boolean[] zArr, tr trVar, long j3, Runnable[] runnableArr, long j10, int i7, ap apVar) {
        this.b = mpVar;
        this.f = zArr;
        this.h = trVar;
        this.c = j3;
        this.n = runnableArr;
        this.e = j10;
        this.d = i7;
        this.r = apVar;
    }
}
