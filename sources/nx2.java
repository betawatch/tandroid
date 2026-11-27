// default package

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class nx2 implements ur4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ nx2(uf5 uf5Var) {
        this.a = (byte) 2;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kx2 kx2Var = (kx2) obj;
                if (kx2Var instanceof px2) {
                    return (px2) kx2Var;
                }
                return null;
            case 1:
                zx2 zx2Var = (zx2) obj;
                zx2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", zx2Var);
                return sjf.e;
            default:
                sj7 sj7Var = (sj7) obj;
                Map a = sj7Var.a();
                LinkedHashMap linkedHashMap = sj7Var.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            zj8 zj8Var = (zj8) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String c = uf5.c(System.currentTimeMillis());
                            if (set.contains(c)) {
                                Object[] objArr = {c};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    sj7Var.c(zj8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    lq5.q(obj2, "duplicate element: ");
                                }
                            } else {
                                zj8Var.getClass();
                                sj7Var.b();
                                linkedHashMap.remove(zj8Var);
                            }
                        }
                    } else {
                        zj8 zj8Var2 = uf5.c;
                        if (j == 0) {
                            zj8Var2.getClass();
                            sj7Var.b();
                            linkedHashMap.remove(zj8Var2);
                        } else {
                            sj7Var.c(zj8Var2, Long.valueOf(j));
                        }
                    }
                }
                return null;
        }
    }

    public /* synthetic */ nx2(byte b) {
        this.a = b;
    }
}
