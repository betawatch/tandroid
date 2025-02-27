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
final class R2 {
    public static final R2 DISTINCT;
    public static final R2 ORDERED;
    public static final R2 SHORT_CIRCUIT;
    public static final R2 SIZED;
    public static final R2 SORTED;
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
    private static final /* synthetic */ R2[] v;
    private final Map a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        Q2 q2 = Q2.SPLITERATOR;
        P2 f2 = f(q2);
        Q2 q22 = Q2.STREAM;
        f2.a(q22);
        Q2 q23 = Q2.OP;
        f2.a.put(q23, 3);
        R2 r2 = new R2("DISTINCT", 0, 0, f2);
        DISTINCT = r2;
        P2 f3 = f(q2);
        f3.a(q22);
        f3.a.put(q23, 3);
        R2 r22 = new R2("SORTED", 1, 1, f3);
        SORTED = r22;
        P2 f4 = f(q2);
        f4.a(q22);
        Map map = f4.a;
        map.put(q23, 3);
        Q2 q24 = Q2.TERMINAL_OP;
        map.put(q24, 2);
        Q2 q25 = Q2.UPSTREAM_TERMINAL_OP;
        map.put(q25, 2);
        R2 r23 = new R2("ORDERED", 2, 2, f4);
        ORDERED = r23;
        P2 f5 = f(q2);
        f5.a(q22);
        f5.a.put(q23, 2);
        R2 r24 = new R2("SIZED", 3, 3, f5);
        SIZED = r24;
        P2 f6 = f(q23);
        f6.a(q24);
        R2 r25 = new R2("SHORT_CIRCUIT", 4, 12, f6);
        SHORT_CIRCUIT = r25;
        v = new R2[]{r2, r22, r23, r24, r25};
        f = b(q2);
        g = b(q22);
        h = b(q23);
        b(q24);
        b(q25);
        int i2 = 0;
        for (R2 r26 : values()) {
            i2 |= r26.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        R2 r27 = DISTINCT;
        m = r27.c;
        n = r27.d;
        R2 r28 = SORTED;
        o = r28.c;
        p = r28.d;
        R2 r29 = ORDERED;
        q = r29.c;
        r = r29.d;
        R2 r210 = SIZED;
        s = r210.c;
        t = r210.d;
        u = SHORT_CIRCUIT.c;
    }

    private R2(String str, int i2, int i3, P2 p2) {
        Q2[] values = Q2.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            Map map = p2.a;
            if (i4 >= length) {
                this.a = map;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            Map.-EL.b(map, values[i4], 0);
            i4++;
        }
    }

    static int a(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ((((j & i2) << 1) | i2) | ((k & i2) >> 1)) ^ (-1)));
    }

    private static int b(Q2 q2) {
        int i2 = 0;
        for (R2 r2 : values()) {
            i2 |= ((Integer) r2.a.get(q2)).intValue() << r2.b;
        }
        return i2;
    }

    static int c(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    private static P2 f(Q2 q2) {
        P2 p2 = new P2(new EnumMap(Q2.class));
        p2.a(q2);
        return p2;
    }

    static int g(int i2) {
        return i2 & ((i2 ^ (-1)) >> 1) & j;
    }

    public static R2 valueOf(String str) {
        return (R2) Enum.valueOf(R2.class, str);
    }

    public static R2[] values() {
        return (R2[]) v.clone();
    }

    final boolean d(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean e(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }
}
