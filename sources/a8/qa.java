package a8;

import android.os.SystemClock;
import c8.jg;
import c8.uf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qa(ta taVar, e1 e1Var, long j3) {
        this.c = taVar;
        this.d = e1Var;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ta taVar = (ta) this.c;
                e1 e1Var = (e1) this.d;
                HashMap hashMap = taVar.j;
                a8 a8Var = a8.f;
                if (!hashMap.containsKey(a8Var)) {
                    o oVar = new o();
                    i iVar = new i();
                    if (!oVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    iVar.c = oVar;
                    hashMap.put(a8Var, iVar);
                }
                i iVar2 = (i) hashMap.get(a8Var);
                Long valueOf = Long.valueOf(this.b);
                o oVar2 = iVar2.c;
                Collection collection = (Collection) oVar2.get(e1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    iVar2.d++;
                    oVar2.put(e1Var, arrayList);
                } else if (collection.add(valueOf)) {
                    iVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (taVar.c(a8Var, elapsedRealtime)) {
                    taVar.i.put(a8Var, Long.valueOf(elapsedRealtime));
                    pb.m.a.execute(new ra(taVar, 0));
                    return;
                }
                return;
            default:
                uf ufVar = (uf) this.c;
                c8.fb fbVar = c8.fb.N1;
                c8.h1 h1Var = (c8.h1) this.d;
                HashMap hashMap2 = ufVar.j;
                if (!hashMap2.containsKey(fbVar)) {
                    c8.d dVar = new c8.d();
                    jg jgVar = new jg();
                    if (!dVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    jgVar.c = dVar;
                    hashMap2.put(fbVar, jgVar);
                }
                jg jgVar2 = (jg) hashMap2.get(fbVar);
                Long valueOf2 = Long.valueOf(this.b);
                c8.d dVar2 = jgVar2.c;
                Collection collection2 = (Collection) dVar2.get(h1Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    dVar2.put(h1Var, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ufVar.d(fbVar, elapsedRealtime2)) {
                    ufVar.i.put(fbVar, Long.valueOf(elapsedRealtime2));
                    pb.m.a.execute(new ra(ufVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qa(uf ufVar, c8.h1 h1Var, long j3) {
        c8.fb fbVar = c8.fb.b;
        this.c = ufVar;
        this.d = h1Var;
        this.b = j3;
    }
}
