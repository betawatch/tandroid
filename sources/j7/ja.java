package j7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import l7.hb;
import l7.lg;
import l7.wf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja(la laVar, w0 w0Var, long j10) {
        this.c = laVar;
        this.d = w0Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la laVar = (la) this.c;
                w0 w0Var = (w0) this.d;
                HashMap hashMap = laVar.j;
                u7 u7Var = u7.f;
                if (!hashMap.containsKey(u7Var)) {
                    n nVar = new n();
                    h hVar = new h();
                    if (!nVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    hVar.c = nVar;
                    hashMap.put(u7Var, hVar);
                }
                h hVar2 = (h) hashMap.get(u7Var);
                Long valueOf = Long.valueOf(this.b);
                n nVar2 = hVar2.c;
                Collection collection = (Collection) nVar2.get(w0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    hVar2.d++;
                    nVar2.put(w0Var, arrayList);
                } else if (collection.add(valueOf)) {
                    hVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (laVar.c(u7Var, elapsedRealtime)) {
                    laVar.i.put(u7Var, Long.valueOf(elapsedRealtime));
                    ab.q.a.execute(new ag.q1(laVar, 25));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.c;
                hb hbVar = hb.J1;
                l7.i1 i1Var = (l7.i1) this.d;
                HashMap hashMap2 = wfVar.j;
                if (!hashMap2.containsKey(hbVar)) {
                    l7.d dVar = new l7.d();
                    lg lgVar = new lg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    lgVar.c = dVar;
                    hashMap2.put(hbVar, lgVar);
                }
                lg lgVar2 = (lg) hashMap2.get(hbVar);
                Long valueOf2 = Long.valueOf(this.b);
                l7.d dVar2 = lgVar2.c;
                Collection collection2 = (Collection) dVar2.get(i1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    dVar2.put(i1Var, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (wfVar.d(hbVar, elapsedRealtime2)) {
                    wfVar.i.put(hbVar, Long.valueOf(elapsedRealtime2));
                    ab.q.a.execute(new ag.q1(wfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ja(wf wfVar, l7.i1 i1Var, long j10) {
        hb hbVar = hb.b;
        this.c = wfVar;
        this.d = i1Var;
        this.b = j10;
    }
}
