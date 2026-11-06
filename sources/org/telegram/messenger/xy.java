package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class xy {
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
    public final /* synthetic */ gz q;
    public ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public xy(gz gzVar) {
        this.q = gzVar;
    }

    public static void a(xy xyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = xyVar.g;
        tL_messages_startHistoryImport.import_id = xyVar.k;
        xyVar.q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new wy(xyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.i = 0L;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.i = ((Long) ((Map.Entry) it.next()).getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.a)) {
            long j10 = this.i;
            if (j10 != this.o) {
                if (elapsedRealtime != this.n) {
                    double d = (j10 - r2) / ((elapsedRealtime - r4) / 1000.0d);
                    double d2 = this.m;
                    if (d2 == 0.0d) {
                        this.m = d;
                    } else {
                        this.m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.p = (int) (((this.h - j10) * 1000) / this.m);
                    this.o = j10;
                    this.n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((this.i / this.h) * 100.0f);
        if (this.l != i7) {
            this.l = i7;
            this.q.getNotificationCenter().k(qs.v1, Long.valueOf(this.j));
        }
    }

    public final void c(int i7) {
        gz gzVar = this.q;
        if (i7 == 100) {
            gzVar.D.l(this.j);
        }
        gzVar.getNotificationCenter().k(qs.v1, Long.valueOf(this.j));
    }
}
