package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class s {
    public static final /* synthetic */ int c = 0;
    public final d1 a = d1.g();
    public boolean b;

    static {
        new s(0);
    }

    public s() {
    }

    public static void b(m mVar, v1 v1Var, int i7, Object obj) {
        if (v1Var == v1.d) {
            mVar.B(i7, 3);
            ((a) obj).b(mVar);
            mVar.B(i7, 4);
        }
        mVar.B(i7, v1Var.b);
        switch (v1Var.ordinal()) {
            case 0:
                mVar.v(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mVar.t(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mVar.F(((Long) obj).longValue());
                break;
            case 3:
                mVar.F(((Long) obj).longValue());
                break;
            case 4:
                mVar.x(((Integer) obj).intValue());
                break;
            case 5:
                mVar.v(((Long) obj).longValue());
                break;
            case 6:
                mVar.t(((Integer) obj).intValue());
                break;
            case 7:
                mVar.n(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof h)) {
                    mVar.A((String) obj);
                    break;
                } else {
                    mVar.r((h) obj);
                    break;
                }
            case 9:
                ((a) obj).b(mVar);
                break;
            case 10:
                a aVar = (a) obj;
                mVar.getClass();
                mVar.D(((z) aVar).a(null));
                aVar.b(mVar);
                break;
            case 11:
                if (!(obj instanceof h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    mVar.D(length);
                    mVar.o(bArr, 0, length);
                    break;
                } else {
                    mVar.r((h) obj);
                    break;
                }
            case 12:
                mVar.D(((Integer) obj).intValue());
                break;
            case 13:
                mVar.x(((Integer) obj).intValue());
                break;
            case 14:
                mVar.t(((Integer) obj).intValue());
                break;
            case 15:
                mVar.v(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                mVar.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                mVar.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        d1 d1Var = this.a;
        int size = d1Var.a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry d = d1Var.d(i7);
            if (d.getValue() instanceof z) {
                z zVar = (z) d.getValue();
                zVar.getClass();
                y0 y0Var = y0.c;
                y0Var.getClass();
                y0Var.a(zVar.getClass()).d(zVar);
                zVar.h();
            }
        }
        if (!d1Var.c) {
            if (d1Var.a.size() > 0) {
                d1Var.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = d1Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d1Var.c) {
            d1Var.b = d1Var.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d1Var.b);
            d1Var.e = d1Var.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d1Var.e);
            d1Var.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        s sVar = new s();
        d1 d1Var = this.a;
        if (d1Var.a.size() > 0) {
            Map.Entry d = d1Var.d(0);
            if (d.getKey() != null) {
                throw new ClassCastException();
            }
            d.getValue();
            throw null;
        }
        Iterator it = d1Var.e().iterator();
        if (!it.hasNext()) {
            return sVar;
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
        if (obj instanceof s) {
            return this.a.equals(((s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public s(int i7) {
        a();
        a();
    }
}
