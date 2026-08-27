package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class v6 {
    public static final v6 DISTINCT;
    public static final v6 ORDERED;
    public static final v6 SHORT_CIRCUIT;
    public static final v6 SIZED;
    public static final v6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ v6[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static v6 valueOf(String str) {
        return (v6) Enum.valueOf(v6.class, str);
    }

    public static v6[] values() {
        return (v6[]) v.clone();
    }

    static {
        u6 u6Var = u6.SPLITERATOR;
        j$.time.t q6 = q(u6Var);
        u6 u6Var2 = u6.STREAM;
        q6.D(u6Var2);
        u6 u6Var3 = u6.OP;
        ((EnumMap) ((Map) q6.b)).put((EnumMap) u6Var3, (u6) 3);
        v6 v6Var = new v6("DISTINCT", 0, 0, q6);
        DISTINCT = v6Var;
        j$.time.t q9 = q(u6Var);
        q9.D(u6Var2);
        ((EnumMap) ((Map) q9.b)).put((EnumMap) u6Var3, (u6) 3);
        v6 v6Var2 = new v6("SORTED", 1, 1, q9);
        SORTED = v6Var2;
        j$.time.t q10 = q(u6Var);
        q10.D(u6Var2);
        ((EnumMap) ((Map) q10.b)).put((EnumMap) u6Var3, (u6) 3);
        u6 u6Var4 = u6.TERMINAL_OP;
        ((EnumMap) ((Map) q10.b)).put((EnumMap) u6Var4, (u6) 2);
        u6 u6Var5 = u6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) q10.b)).put((EnumMap) u6Var5, (u6) 2);
        v6 v6Var3 = new v6("ORDERED", 2, 2, q10);
        ORDERED = v6Var3;
        j$.time.t q11 = q(u6Var);
        q11.D(u6Var2);
        ((EnumMap) ((Map) q11.b)).put((EnumMap) u6Var3, (u6) 2);
        v6 v6Var4 = new v6("SIZED", 3, 3, q11);
        SIZED = v6Var4;
        j$.time.t q12 = q(u6Var3);
        q12.D(u6Var4);
        int i10 = 0;
        v6 v6Var5 = new v6("SHORT_CIRCUIT", 4, 12, q12);
        SHORT_CIRCUIT = v6Var5;
        v = new v6[]{v6Var, v6Var2, v6Var3, v6Var4, v6Var5};
        f = k(u6Var);
        g = k(u6Var2);
        h = k(u6Var3);
        k(u6Var4);
        k(u6Var5);
        for (v6 v6Var6 : values()) {
            i10 |= v6Var6.e;
        }
        i = i10;
        int i11 = g;
        j = i11;
        int i12 = i11 << 1;
        k = i12;
        l = i11 | i12;
        v6 v6Var7 = DISTINCT;
        m = v6Var7.c;
        n = v6Var7.d;
        v6 v6Var8 = SORTED;
        o = v6Var8.c;
        p = v6Var8.d;
        v6 v6Var9 = ORDERED;
        q = v6Var9.c;
        r = v6Var9.d;
        v6 v6Var10 = SIZED;
        s = v6Var10.c;
        t = v6Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public static j$.time.t q(u6 u6Var) {
        j$.time.t tVar = new j$.time.t(11, new EnumMap(u6.class));
        tVar.D(u6Var);
        return tVar;
    }

    public v6(String str, int i10, int i11, j$.time.t tVar) {
        for (u6 u6Var : u6.values()) {
            Map.-EL.putIfAbsent((java.util.Map) tVar.b, u6Var, 0);
        }
        this.a = (java.util.Map) tVar.b;
        int i12 = i11 * 2;
        this.b = i12;
        this.c = 1 << i12;
        this.d = 2 << i12;
        this.e = 3 << i12;
    }

    public final boolean m(int i10) {
        return (i10 & this.e) == this.c;
    }

    public static int k(u6 u6Var) {
        int i10 = 0;
        for (v6 v6Var : values()) {
            i10 |= ((Integer) v6Var.a.get(u6Var)).intValue() << v6Var.b;
        }
        return i10;
    }

    public static int j(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = i;
        } else {
            i12 = ~(((j & i10) << 1) | i10 | ((k & i10) >> 1));
        }
        return i10 | (i11 & i12);
    }

    public static int l(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i10 = characteristics & 4;
        int i11 = f;
        return (i10 == 0 || spliterator.getComparator() == null) ? characteristics & i11 : characteristics & i11 & (-5);
    }
}
