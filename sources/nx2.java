// default package

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                rj7 rj7Var = (rj7) obj;
                Map a = rj7Var.a();
                LinkedHashMap linkedHashMap = rj7Var.a;
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
                                    rj7Var.c(zj8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    lq5.q(obj2, "duplicate element: ");
                                }
                            } else {
                                zj8Var.getClass();
                                rj7Var.b();
                                linkedHashMap.remove(zj8Var);
                            }
                        }
                    } else {
                        zj8 zj8Var2 = uf5.c;
                        if (j == 0) {
                            zj8Var2.getClass();
                            rj7Var.b();
                            linkedHashMap.remove(zj8Var2);
                        } else {
                            rj7Var.c(zj8Var2, Long.valueOf(j));
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
