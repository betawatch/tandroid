package gb;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements rd.l {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i7) {
        this.a = i7;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                m1.b ex = (m1.b) obj;
                kotlin.jvm.internal.j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return jb.j.b;
            case 1:
                q1.b bVar = (q1.b) obj;
                q1.e eVar = sa.h.c;
                long j3 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        q1.e eVar2 = (q1.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String c10 = sa.h.c(System.currentTimeMillis());
                        if (set.contains(c10)) {
                            Object[] objArr = {c10};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar.d(eVar2, DesugarCollections.unmodifiableSet(hashSet));
                            j3++;
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j3 == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j3));
                }
                return null;
            default:
                id.f fVar = (id.f) obj;
                if (fVar instanceof zd.x) {
                    return (zd.x) fVar;
                }
                return null;
        }
    }

    public /* synthetic */ p(sa.h hVar) {
        this.a = 1;
    }
}
