package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q {
    public static final /* synthetic */ int c = 0;
    public final d1 a = new d1(16);
    public boolean b;

    static {
        new q(0);
    }

    public q() {
    }

    public static void b(k kVar, z1 z1Var, int i10, Object obj) {
        if (z1Var == z1.d) {
            kVar.R(i10, 3);
            ((a) obj).c(kVar);
            kVar.R(i10, 4);
        }
        kVar.R(i10, z1Var.b);
        switch (z1Var.ordinal()) {
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
        d1 d1Var = this.a;
        if (!d1Var.d) {
            if (d1Var.b.size() > 0) {
                d1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = d1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d1Var.d) {
            d1Var.c = d1Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d1Var.c);
            d1Var.f = d1Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d1Var.f);
            d1Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        q qVar = new q();
        d1 d1Var = this.a;
        if (d1Var.b.size() > 0) {
            Map.Entry c10 = d1Var.c(0);
            if (c10.getKey() != null) {
                throw new ClassCastException();
            }
            c10.getValue();
            throw null;
        }
        Iterator it = d1Var.d().iterator();
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
