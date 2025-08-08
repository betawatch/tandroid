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
final class Q2 {
    public static final Q2 DISTINCT;
    public static final Q2 ORDERED;
    public static final Q2 SHORT_CIRCUIT;
    public static final Q2 SIZED;
    public static final Q2 SORTED;
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
    private static final /* synthetic */ Q2[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public static Q2 valueOf(String str) {
        return (Q2) Enum.valueOf(Q2.class, str);
    }

    public static Q2[] values() {
        return (Q2[]) v.clone();
    }

    static {
        P2 p2 = P2.SPLITERATOR;
        O2 l2 = l(p2);
        P2 p22 = P2.STREAM;
        l2.a(p22);
        P2 p23 = P2.OP;
        l2.a.put((EnumMap) p23, (P2) 3);
        Q2 q2 = new Q2("DISTINCT", 0, 0, l2);
        DISTINCT = q2;
        O2 l3 = l(p2);
        l3.a(p22);
        l3.a.put((EnumMap) p23, (P2) 3);
        Q2 q22 = new Q2("SORTED", 1, 1, l3);
        SORTED = q22;
        O2 l4 = l(p2);
        l4.a(p22);
        EnumMap enumMap = l4.a;
        enumMap.put((EnumMap) p23, (P2) 3);
        P2 p24 = P2.TERMINAL_OP;
        enumMap.put((EnumMap) p24, (P2) 2);
        P2 p25 = P2.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) p25, (P2) 2);
        Q2 q23 = new Q2("ORDERED", 2, 2, l4);
        ORDERED = q23;
        O2 l5 = l(p2);
        l5.a(p22);
        l5.a.put((EnumMap) p23, (P2) 2);
        Q2 q24 = new Q2("SIZED", 3, 3, l5);
        SIZED = q24;
        O2 l6 = l(p23);
        l6.a(p24);
        Q2 q25 = new Q2("SHORT_CIRCUIT", 4, 12, l6);
        SHORT_CIRCUIT = q25;
        v = new Q2[]{q2, q22, q23, q24, q25};
        f = g(p2);
        g = g(p22);
        h = g(p23);
        g(p24);
        g(p25);
        int i2 = 0;
        for (Q2 q26 : values()) {
            i2 |= q26.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        Q2 q27 = DISTINCT;
        m = q27.c;
        n = q27.d;
        Q2 q28 = SORTED;
        o = q28.c;
        p = q28.d;
        Q2 q29 = ORDERED;
        q = q29.c;
        r = q29.d;
        Q2 q210 = SIZED;
        s = q210.c;
        t = q210.d;
        u = SHORT_CIRCUIT.c;
    }

    private static O2 l(P2 p2) {
        O2 o2 = new O2(new EnumMap(P2.class));
        o2.a(p2);
        return o2;
    }

    private Q2(String str, int i2, int i3, O2 o2) {
        P2[] values = P2.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = o2.a;
            if (i4 < length) {
                Map.-EL.b(enumMap, values[i4], 0);
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

    final boolean i(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean j(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }

    private static int g(P2 p2) {
        int i2 = 0;
        for (Q2 q2 : values()) {
            i2 |= ((Integer) q2.a.get(p2)).intValue() << q2.b;
        }
        return i2;
    }

    static int f(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    static int m(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int h(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
