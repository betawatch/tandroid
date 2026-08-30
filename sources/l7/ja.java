package l7;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import n7.ib;
import n7.mg;
import n7.xf;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja(la laVar, x0 x0Var, long j10) {
        this.c = laVar;
        this.d = x0Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la laVar = (la) this.c;
                x0 x0Var = (x0) this.d;
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
                Collection collection = (Collection) nVar2.get(x0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    hVar2.d++;
                    nVar2.put(x0Var, arrayList);
                } else if (collection.add(valueOf)) {
                    hVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (laVar.c(u7Var, elapsedRealtime)) {
                    laVar.i.put(u7Var, Long.valueOf(elapsedRealtime));
                    cb.o.a.execute(new androidx.activity.i(laVar, 25));
                    return;
                }
                return;
            default:
                xf xfVar = (xf) this.c;
                ib ibVar = ib.K1;
                n7.i1 i1Var = (n7.i1) this.d;
                HashMap hashMap2 = xfVar.j;
                if (!hashMap2.containsKey(ibVar)) {
                    n7.d dVar = new n7.d();
                    mg mgVar = new mg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    mgVar.c = dVar;
                    hashMap2.put(ibVar, mgVar);
                }
                mg mgVar2 = (mg) hashMap2.get(ibVar);
                Long valueOf2 = Long.valueOf(this.b);
                n7.d dVar2 = mgVar2.c;
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
                if (xfVar.d(ibVar, elapsedRealtime2)) {
                    xfVar.i.put(ibVar, Long.valueOf(elapsedRealtime2));
                    cb.o.a.execute(new m2.b(xfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ja(xf xfVar, n7.i1 i1Var, long j10) {
        ib ibVar = ib.b;
        this.c = xfVar;
        this.d = i1Var;
        this.b = j10;
    }
}
