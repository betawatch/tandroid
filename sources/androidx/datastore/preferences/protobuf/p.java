package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p {
    public static final /* synthetic */ int c = 0;
    public final d1 a = new d1(16);
    public boolean b;

    static {
        new p(0);
    }

    public p() {
    }

    public static void b(j jVar, z1 z1Var, int i10, Object obj) {
        if (z1Var == z1.d) {
            jVar.R(i10, 3);
            ((a) obj).c(jVar);
            jVar.R(i10, 4);
        }
        jVar.R(i10, z1Var.b);
        switch (z1Var.ordinal()) {
            case 0:
                jVar.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                jVar.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                jVar.V(((Long) obj).longValue());
                break;
            case 3:
                jVar.V(((Long) obj).longValue());
                break;
            case 4:
                jVar.N(((Integer) obj).intValue());
                break;
            case 5:
                jVar.L(((Long) obj).longValue());
                break;
            case 6:
                jVar.J(((Integer) obj).intValue());
                break;
            case 7:
                jVar.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    jVar.Q((String) obj);
                    break;
                } else {
                    jVar.H((g) obj);
                    break;
                }
            case 9:
                ((a) obj).c(jVar);
                break;
            case 10:
                a aVar = (a) obj;
                jVar.getClass();
                jVar.T(aVar.a());
                aVar.c(jVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    jVar.T(length);
                    jVar.E(bArr, 0, length);
                    break;
                } else {
                    jVar.H((g) obj);
                    break;
                }
            case 12:
                jVar.T(((Integer) obj).intValue());
                break;
            case 13:
                jVar.N(((Integer) obj).intValue());
                break;
            case 14:
                jVar.J(((Integer) obj).intValue());
                break;
            case 15:
                jVar.L(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                jVar.T((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                jVar.V((longValue >> 63) ^ (longValue << 1));
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
        p pVar = new p();
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
            return pVar;
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
        if (obj instanceof p) {
            return this.a.equals(((p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public p(int i10) {
        a();
        a();
    }
}
