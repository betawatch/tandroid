package db;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements od.l {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i3) {
        this.a = i3;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l1.b ex = (l1.b) obj;
                kotlin.jvm.internal.j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return gb.j.b;
            case 1:
                p1.b bVar = (p1.b) obj;
                p1.e eVar = ra.i.c;
                long j10 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        p1.e eVar2 = (p1.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String c2 = ra.i.c(System.currentTimeMillis());
                        if (set.contains(c2)) {
                            Object[] objArr = {c2};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar.d(eVar2, DesugarCollections.unmodifiableSet(hashSet));
                            j10++;
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j10 == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j10));
                }
                return null;
            default:
                fd.f fVar = (fd.f) obj;
                if (fVar instanceof wd.x) {
                    return (wd.x) fVar;
                }
                return null;
        }
    }

    public /* synthetic */ o(ra.i iVar) {
        this.a = 1;
    }
}
