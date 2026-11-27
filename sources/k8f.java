// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class k8f implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k8f(ijf ijfVar, ywd ywdVar, long j) {
        gaf gafVar = gaf.b;
        this.c = ijfVar;
        this.d = ywdVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                q8f q8fVar = (q8f) obj2;
                std stdVar = (std) obj;
                HashMap hashMap = q8fVar.j;
                vxe vxeVar = vxe.f;
                if (!hashMap.containsKey(vxeVar)) {
                    lp2 lp2Var = new lp2((byte) 2);
                    ccd ccdVar = new ccd();
                    if (!lp2Var.isEmpty()) {
                        iy8.d();
                        throw null;
                    }
                    ccdVar.c = lp2Var;
                    hashMap.put(vxeVar, ccdVar);
                }
                ccd ccdVar2 = (ccd) hashMap.get(vxeVar);
                Long valueOf = Long.valueOf(j);
                lp2 lp2Var2 = ccdVar2.c;
                Collection collection = (Collection) lp2Var2.get(stdVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        hz6.e("New Collection violated the Collection spec");
                        return;
                    } else {
                        ccdVar2.d++;
                        lp2Var2.put(stdVar, arrayList);
                    }
                } else if (collection.add(valueOf)) {
                    ccdVar2.d++;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (q8fVar.c(vxeVar, elapsedRealtime)) {
                    q8fVar.i.put(vxeVar, Long.valueOf(elapsedRealtime));
                    xnb.c(1, new dhe(q8fVar, (byte) 2));
                    return;
                }
                return;
            default:
                ijf ijfVar = (ijf) obj2;
                gaf gafVar = gaf.O1;
                ywd ywdVar = (ywd) obj;
                HashMap hashMap2 = ijfVar.j;
                if (!hashMap2.containsKey(gafVar)) {
                    lp2 lp2Var3 = new lp2((byte) 1);
                    lmf lmfVar = new lmf();
                    if (!lp2Var3.isEmpty()) {
                        iy8.d();
                        throw null;
                    }
                    lmfVar.c = lp2Var3;
                    hashMap2.put(gafVar, lmfVar);
                }
                lmf lmfVar2 = (lmf) hashMap2.get(gafVar);
                Long valueOf2 = Long.valueOf(j);
                lp2 lp2Var4 = lmfVar2.c;
                Collection collection2 = (Collection) lp2Var4.get(ywdVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        hz6.e("New Collection violated the Collection spec");
                        return;
                    }
                    lp2Var4.put(ywdVar, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ijfVar.d(gafVar, elapsedRealtime2)) {
                    ijfVar.i.put(gafVar, Long.valueOf(elapsedRealtime2));
                    xnb.c(1, new dhe(ijfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k8f(q8f q8fVar, std stdVar, long j) {
        this.c = q8fVar;
        this.d = stdVar;
        this.b = j;
    }
}
