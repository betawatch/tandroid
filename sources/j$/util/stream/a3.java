package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

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
final class a3 {
    public static final a3 DISTINCT;
    public static final a3 ORDERED;
    public static final a3 SHORT_CIRCUIT;
    public static final a3 SIZED;
    public static final a3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ a3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) v.clone();
    }

    static {
        Z2 z2 = Z2.SPLITERATOR;
        Y2 u2 = u(z2);
        Z2 z22 = Z2.STREAM;
        u2.a(z22);
        Z2 z23 = Z2.OP;
        u2.a.put((EnumMap) z23, (Z2) 3);
        a3 a3Var = new a3("DISTINCT", 0, 0, u2);
        DISTINCT = a3Var;
        Y2 u3 = u(z2);
        u3.a(z22);
        u3.a.put((EnumMap) z23, (Z2) 3);
        a3 a3Var2 = new a3("SORTED", 1, 1, u3);
        SORTED = a3Var2;
        Y2 u4 = u(z2);
        u4.a(z22);
        EnumMap enumMap = u4.a;
        enumMap.put((EnumMap) z23, (Z2) 3);
        Z2 z24 = Z2.TERMINAL_OP;
        enumMap.put((EnumMap) z24, (Z2) 2);
        Z2 z25 = Z2.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) z25, (Z2) 2);
        a3 a3Var3 = new a3("ORDERED", 2, 2, u4);
        ORDERED = a3Var3;
        Y2 u5 = u(z2);
        u5.a(z22);
        u5.a.put((EnumMap) z23, (Z2) 2);
        a3 a3Var4 = new a3("SIZED", 3, 3, u5);
        SIZED = a3Var4;
        Y2 u6 = u(z23);
        u6.a(z24);
        a3 a3Var5 = new a3("SHORT_CIRCUIT", 4, 12, u6);
        SHORT_CIRCUIT = a3Var5;
        v = new a3[]{a3Var, a3Var2, a3Var3, a3Var4, a3Var5};
        f = j(z2);
        g = j(z22);
        h = j(z23);
        j(z24);
        j(z25);
        int i2 = 0;
        for (a3 a3Var6 : values()) {
            i2 |= a3Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        a3 a3Var7 = DISTINCT;
        m = a3Var7.c;
        n = a3Var7.d;
        a3 a3Var8 = SORTED;
        o = a3Var8.c;
        p = a3Var8.d;
        a3 a3Var9 = ORDERED;
        q = a3Var9.c;
        r = a3Var9.d;
        a3 a3Var10 = SIZED;
        s = a3Var10.c;
        t = a3Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    private static Y2 u(Z2 z2) {
        Y2 y2 = new Y2(new EnumMap(Z2.class));
        y2.a(z2);
        return y2;
    }

    private a3(String str, int i2, int i3, Y2 y2) {
        Z2[] values = Z2.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = y2.a;
            if (i4 < length) {
                Map.-EL.a(enumMap, values[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    final boolean m(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean r(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }

    private static int j(Z2 z2) {
        int i2 = 0;
        for (a3 a3Var : values()) {
            i2 |= ((Integer) a3Var.a.get(z2)).intValue() << a3Var.b;
        }
        return i2;
    }

    static int i(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    static int v(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int l(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
