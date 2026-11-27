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
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class b7 {
    public static final b7 DISTINCT;
    public static final b7 ORDERED;
    public static final b7 SHORT_CIRCUIT;
    public static final b7 SIZED;
    public static final b7 SORTED;
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
    public static final /* synthetic */ b7[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        a7 a7Var = a7.SPLITERATOR;
        z6 o2 = o(a7Var);
        a7 a7Var2 = a7.STREAM;
        o2.a(a7Var2);
        a7 a7Var3 = a7.OP;
        ((EnumMap) o2.a).put((EnumMap) a7Var3, (a7) 3);
        b7 b7Var = new b7("DISTINCT", 0, 0, o2);
        DISTINCT = b7Var;
        z6 o3 = o(a7Var);
        o3.a(a7Var2);
        ((EnumMap) o3.a).put((EnumMap) a7Var3, (a7) 3);
        b7 b7Var2 = new b7("SORTED", 1, 1, o3);
        SORTED = b7Var2;
        z6 o4 = o(a7Var);
        o4.a(a7Var2);
        ((EnumMap) o4.a).put((EnumMap) a7Var3, (a7) 3);
        a7 a7Var4 = a7.TERMINAL_OP;
        ((EnumMap) o4.a).put((EnumMap) a7Var4, (a7) 2);
        a7 a7Var5 = a7.UPSTREAM_TERMINAL_OP;
        ((EnumMap) o4.a).put((EnumMap) a7Var5, (a7) 2);
        b7 b7Var3 = new b7("ORDERED", 2, 2, o4);
        ORDERED = b7Var3;
        z6 o5 = o(a7Var);
        o5.a(a7Var2);
        ((EnumMap) o5.a).put((EnumMap) a7Var3, (a7) 2);
        b7 b7Var4 = new b7("SIZED", 3, 3, o5);
        SIZED = b7Var4;
        z6 o6 = o(a7Var3);
        o6.a(a7Var4);
        int i2 = 0;
        b7 b7Var5 = new b7("SHORT_CIRCUIT", 4, 12, o6);
        SHORT_CIRCUIT = b7Var5;
        v = new b7[]{b7Var, b7Var2, b7Var3, b7Var4, b7Var5};
        f = k(a7Var);
        g = k(a7Var2);
        h = k(a7Var3);
        k(a7Var4);
        k(a7Var5);
        for (b7 b7Var6 : values()) {
            i2 |= b7Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        b7 b7Var7 = DISTINCT;
        m = b7Var7.c;
        n = b7Var7.d;
        b7 b7Var8 = SORTED;
        o = b7Var8.c;
        p = b7Var8.d;
        b7 b7Var9 = ORDERED;
        q = b7Var9.c;
        r = b7Var9.d;
        b7 b7Var10 = SIZED;
        s = b7Var10.c;
        t = b7Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public b7(String str, int i2, int i3, z6 z6Var) {
        for (a7 a7Var : a7.values()) {
            Map.-EL.putIfAbsent(z6Var.a, a7Var, 0);
        }
        this.a = z6Var.a;
        int i4 = i3 << 1;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int j(int i2, int i3) {
        return (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1)))) | i2;
    }

    public static int k(a7 a7Var) {
        int i2 = 0;
        for (b7 b7Var : values()) {
            i2 |= ((Integer) ((EnumMap) b7Var.a).get(a7Var)).intValue() << b7Var.b;
        }
        return i2;
    }

    public static int l(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    public static z6 o(a7 a7Var) {
        z6 z6Var = new z6(new EnumMap(a7.class));
        z6Var.a(a7Var);
        return z6Var;
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) v.clone();
    }

    public final boolean n(int i2) {
        return (i2 & this.e) == this.c;
    }
}
