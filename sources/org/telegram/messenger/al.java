package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ al(wp wpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.b = wpVar;
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
                wp wpVar = this.b;
                boolean[] zArr = (boolean[]) this.f;
                is isVar = (is) this.h;
                long j10 = this.c;
                Runnable[] runnableArr = (Runnable[]) this.n;
                long j11 = this.e;
                int i10 = this.d;
                kp kpVar = (kp) this.r;
                if (!zArr[0]) {
                    i0.g3(new rb(wpVar, zArr, isVar.O(j10), runnableArr, j11, i10, kpVar));
                    break;
                }
                break;
            default:
                wp wpVar2 = this.b;
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
                        long[] a2 = wpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.id, 0, -1, 0);
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
                        i0.g3(new ul(wpVar2, sparseArray, 1));
                    }
                }
                Utilities.d.c(new an(wpVar2, updates_channeldifference, j12, chat, hVar, i11, j13));
                break;
        }
    }

    public /* synthetic */ al(wp wpVar, boolean[] zArr, is isVar, long j10, Runnable[] runnableArr, long j11, int i10, kp kpVar) {
        this.b = wpVar;
        this.f = zArr;
        this.h = isVar;
        this.c = j10;
        this.n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.r = kpVar;
    }
}
