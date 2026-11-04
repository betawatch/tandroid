package b8;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fg(hg hgVar, p1 p1Var, long j10) {
        ob obVar = ob.b;
        this.c = hgVar;
        this.d = p1Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hg hgVar = (hg) this.c;
                ob obVar = ob.O1;
                p1 p1Var = (p1) this.d;
                HashMap hashMap = hgVar.j;
                if (!hashMap.containsKey(obVar)) {
                    g gVar = new g();
                    dh dhVar = new dh();
                    if (!gVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    dhVar.c = gVar;
                    hashMap.put(obVar, dhVar);
                }
                dh dhVar2 = (dh) hashMap.get(obVar);
                Long valueOf = Long.valueOf(this.b);
                g gVar2 = dhVar2.c;
                Collection collection = (Collection) gVar2.get(p1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    gVar2.put(p1Var, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (hgVar.d(obVar, elapsedRealtime)) {
                    hgVar.i.put(obVar, Long.valueOf(elapsedRealtime));
                    mb.m.a.execute(new a3.o(hgVar));
                    return;
                }
                return;
            default:
                z7.da daVar = (z7.da) this.c;
                z7.r0 r0Var = (z7.r0) this.d;
                HashMap hashMap2 = daVar.j;
                z7.n7 n7Var = z7.n7.f;
                if (!hashMap2.containsKey(n7Var)) {
                    z7.i iVar = new z7.i();
                    z7.e eVar = new z7.e();
                    if (!iVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    eVar.c = iVar;
                    hashMap2.put(n7Var, eVar);
                }
                z7.e eVar2 = (z7.e) hashMap2.get(n7Var);
                Long valueOf2 = Long.valueOf(this.b);
                z7.i iVar2 = eVar2.c;
                Collection collection2 = (Collection) iVar2.get(r0Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    eVar2.d++;
                    iVar2.put(r0Var, arrayList2);
                } else if (collection2.add(valueOf2)) {
                    eVar2.d++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (daVar.c(n7Var, elapsedRealtime2)) {
                    daVar.i.put(n7Var, Long.valueOf(elapsedRealtime2));
                    mb.m.a.execute(new wi.i0(daVar, 3));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fg(z7.da daVar, z7.r0 r0Var, long j10) {
        this.c = daVar;
        this.d = r0Var;
        this.b = j10;
    }
}
