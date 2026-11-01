package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class iz {
    public String a;
    public TLRPC.InputPeer g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public double m;
    public long n;
    public long o;
    public final /* synthetic */ rz q;
    public ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public iz(rz rzVar) {
        this.q = rzVar;
    }

    public static void a(iz izVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = izVar.g;
        tL_messages_startHistoryImport.import_id = izVar.k;
        izVar.q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new hz(izVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j10, float f7) {
        this.d.put(str, Float.valueOf(f7));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.i = 0L;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.i = ((Long) ((Map.Entry) it.next()).getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.a)) {
            long j11 = this.i;
            if (j11 != this.o) {
                if (elapsedRealtime != this.n) {
                    double d = (j11 - r2) / ((elapsedRealtime - r4) / 1000.0d);
                    double d10 = this.m;
                    if (d10 == 0.0d) {
                        this.m = d;
                    } else {
                        this.m = (0.99d * d10) + (d * 0.01d);
                    }
                    this.p = (int) (((this.h - j11) * 1000) / this.m);
                    this.o = j11;
                    this.n = elapsedRealtime;
                }
            }
        }
        int i10 = (int) ((this.i / this.h) * 100.0f);
        if (this.l != i10) {
            this.l = i10;
            this.q.getNotificationCenter().k(at.v1, Long.valueOf(this.j));
        }
    }

    public final void c(int i10) {
        rz rzVar = this.q;
        if (i10 == 100) {
            rzVar.D.l(this.j);
        }
        rzVar.getNotificationCenter().k(at.v1, Long.valueOf(this.j));
    }
}
