// default package

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dy2 implements rr4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ dy2(rf5 rf5Var) {
        this.a = (byte) 2;
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ay2 ay2Var = (ay2) obj;
                if (ay2Var instanceof fy2) {
                    return (fy2) ay2Var;
                }
                return null;
            case 1:
                py2 py2Var = (py2) obj;
                py2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", py2Var);
                return dhf.e;
            default:
                lj7 lj7Var = (lj7) obj;
                Map a = lj7Var.a();
                LinkedHashMap linkedHashMap = lj7Var.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            ni8 ni8Var = (ni8) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String c = rf5.c(System.currentTimeMillis());
                            if (set.contains(c)) {
                                Object[] objArr = {c};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    lj7Var.c(ni8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    u36.i(obj2, "duplicate element: ");
                                }
                            } else {
                                ni8Var.getClass();
                                lj7Var.b();
                                linkedHashMap.remove(ni8Var);
                            }
                        }
                    } else {
                        ni8 ni8Var2 = rf5.c;
                        if (j == 0) {
                            ni8Var2.getClass();
                            lj7Var.b();
                            linkedHashMap.remove(ni8Var2);
                        } else {
                            lj7Var.c(ni8Var2, Long.valueOf(j));
                        }
                    }
                }
                return null;
        }
    }

    public /* synthetic */ dy2(byte b) {
        this.a = b;
    }
}
