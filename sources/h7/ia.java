package h7;

import android.os.SystemClock;
import j7.hb;
import j7.lg;
import j7.wf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ia(ka kaVar, w0 w0Var, long j10) {
        this.c = kaVar;
        this.d = w0Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.c;
                w0 w0Var = (w0) this.d;
                HashMap hashMap = kaVar.j;
                t7 t7Var = t7.f;
                if (!hashMap.containsKey(t7Var)) {
                    n nVar = new n();
                    h hVar = new h();
                    if (!nVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    hVar.c = nVar;
                    hashMap.put(t7Var, hVar);
                }
                h hVar2 = (h) hashMap.get(t7Var);
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
                if (kaVar.c(t7Var, elapsedRealtime)) {
                    kaVar.i.put(t7Var, Long.valueOf(elapsedRealtime));
                    ya.m.a.execute(new androidx.activity.i(kaVar, 22));
                    return;
                }
                return;
            default:
                wf wfVar = (wf) this.c;
                hb hbVar = hb.J1;
                j7.i1 i1Var = (j7.i1) this.d;
                HashMap hashMap2 = wfVar.j;
                if (!hashMap2.containsKey(hbVar)) {
                    j7.d dVar = new j7.d();
                    lg lgVar = new lg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    lgVar.c = dVar;
                    hashMap2.put(hbVar, lgVar);
                }
                lg lgVar2 = (lg) hashMap2.get(hbVar);
                Long valueOf2 = Long.valueOf(this.b);
                j7.d dVar2 = lgVar2.c;
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
                    ya.m.a.execute(new androidx.activity.i(wfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ia(wf wfVar, j7.i1 i1Var, long j10) {
        hb hbVar = hb.b;
        this.c = wfVar;
        this.d = i1Var;
        this.b = j10;
    }
}
