package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class we {
    public final int a;
    public TLRPC.TL_inputDocument b;
    public long c = -9223372036854775807L;
    public final ArrayList d = new ArrayList();
    public final a e = new a(this, 18);

    public we(int i3) {
        this.a = i3;
    }

    public static void a(we weVar, long j10, long j11) {
        ArrayList arrayList = weVar.d;
        int i3 = 0;
        while (i3 < arrayList.size() && ((Long) ((Pair) arrayList.get(i3)).first).longValue() <= j10) {
            i3++;
        }
        arrayList.add(i3, new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        int max = Math.max(0, i3 - 1);
        while (max < arrayList.size() - 1) {
            Pair pair = (Pair) arrayList.get(max);
            int i10 = max + 1;
            Pair pair2 = (Pair) arrayList.get(i10);
            if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                arrayList.set(max, new Pair((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                arrayList.remove(i10);
            } else {
                max = i10;
            }
        }
    }

    public final void b() {
        if (this.b == null) {
            return;
        }
        d();
        this.b = null;
    }

    public final long c() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            j10 += ((Long) pair.second).longValue() - ((Long) pair.first).longValue();
        }
        return j10;
    }

    public final void d() {
        g0.r(this.e);
        if (this.b != null && c() >= 3000) {
            TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
            tL_messages_reportMusicListen.id = this.b;
            tL_messages_reportMusicListen.listened_duration = (int) Math.round(c() / 1000.0d);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportMusicListen, null);
            this.c = -9223372036854775807L;
            this.d.clear();
        }
    }
}
