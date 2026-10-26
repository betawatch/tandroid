package a8;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.ui.Components.cy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ig(kg kgVar, r1 r1Var, long j10) {
        rb rbVar = rb.b;
        this.c = kgVar;
        this.d = r1Var;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kg kgVar = (kg) this.c;
                rb rbVar = rb.N1;
                r1 r1Var = (r1) this.d;
                HashMap hashMap = kgVar.j;
                if (!hashMap.containsKey(rbVar)) {
                    g gVar = new g();
                    gh ghVar = new gh();
                    if (!gVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    ghVar.c = gVar;
                    hashMap.put(rbVar, ghVar);
                }
                gh ghVar2 = (gh) hashMap.get(rbVar);
                Long valueOf = Long.valueOf(this.b);
                g gVar2 = ghVar2.c;
                Collection collection = (Collection) gVar2.get(r1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    gVar2.put(r1Var, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (kgVar.d(rbVar, elapsedRealtime)) {
                    kgVar.i.put(rbVar, Long.valueOf(elapsedRealtime));
                    sb.m.a.execute(new a5.d(kgVar));
                    return;
                }
                return;
            default:
                y7.ca caVar = (y7.ca) this.c;
                y7.q0 q0Var = (y7.q0) this.d;
                HashMap hashMap2 = caVar.j;
                y7.m7 m7Var = y7.m7.f;
                if (!hashMap2.containsKey(m7Var)) {
                    y7.i iVar = new y7.i();
                    y7.e eVar = new y7.e();
                    if (!iVar.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    eVar.c = iVar;
                    hashMap2.put(m7Var, eVar);
                }
                y7.e eVar2 = (y7.e) hashMap2.get(m7Var);
                Long valueOf2 = Long.valueOf(this.b);
                y7.i iVar2 = eVar2.c;
                Collection collection2 = (Collection) iVar2.get(q0Var);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    eVar2.d++;
                    iVar2.put(q0Var, arrayList2);
                } else if (collection2.add(valueOf2)) {
                    eVar2.d++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (caVar.c(m7Var, elapsedRealtime2)) {
                    caVar.i.put(m7Var, Long.valueOf(elapsedRealtime2));
                    sb.m.a.execute(new cy0(caVar, 20));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ig(y7.ca caVar, y7.q0 q0Var, long j10) {
        this.c = caVar;
        this.d = q0Var;
        this.b = j10;
    }
}
