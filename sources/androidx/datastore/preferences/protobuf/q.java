package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q {
    public static final /* synthetic */ int c = 0;
    public final e1 a = new e1(16);
    public boolean b;

    static {
        new q(0);
    }

    public q() {
    }

    public static void b(k kVar, a2 a2Var, int i10, Object obj) {
        if (a2Var == a2.d) {
            kVar.R(i10, 3);
            ((a) obj).c(kVar);
            kVar.R(i10, 4);
        }
        kVar.R(i10, a2Var.b);
        switch (a2Var.ordinal()) {
            case 0:
                kVar.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                kVar.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                kVar.V(((Long) obj).longValue());
                break;
            case 3:
                kVar.V(((Long) obj).longValue());
                break;
            case 4:
                kVar.N(((Integer) obj).intValue());
                break;
            case 5:
                kVar.L(((Long) obj).longValue());
                break;
            case 6:
                kVar.J(((Integer) obj).intValue());
                break;
            case 7:
                kVar.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    kVar.Q((String) obj);
                    break;
                } else {
                    kVar.H((g) obj);
                    break;
                }
            case 9:
                ((a) obj).c(kVar);
                break;
            case 10:
                a aVar = (a) obj;
                kVar.getClass();
                kVar.T(aVar.a());
                aVar.c(kVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    kVar.T(length);
                    kVar.E(bArr, 0, length);
                    break;
                } else {
                    kVar.H((g) obj);
                    break;
                }
            case 12:
                kVar.T(((Integer) obj).intValue());
                break;
            case 13:
                kVar.N(((Integer) obj).intValue());
                break;
            case 14:
                kVar.J(((Integer) obj).intValue());
                break;
            case 15:
                kVar.L(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                kVar.T((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                kVar.V((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        e1 e1Var = this.a;
        if (!e1Var.d) {
            if (e1Var.b.size() > 0) {
                e1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = e1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!e1Var.d) {
            e1Var.c = e1Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(e1Var.c);
            e1Var.f = e1Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(e1Var.f);
            e1Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        q qVar = new q();
        e1 e1Var = this.a;
        if (e1Var.b.size() > 0) {
            Map.Entry c3 = e1Var.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = e1Var.d().iterator();
        if (!it.hasNext()) {
            return qVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.a.equals(((q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public q(int i10) {
        a();
        a();
    }
}
