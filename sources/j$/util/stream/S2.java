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
public final class S2 {
    public static final S2 DISTINCT;
    public static final S2 ORDERED;
    public static final S2 SHORT_CIRCUIT;
    public static final S2 SIZED;
    public static final S2 SORTED;
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
    public static final /* synthetic */ S2[] v;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static S2 valueOf(String str) {
        return (S2) Enum.valueOf(S2.class, str);
    }

    public static S2[] values() {
        return (S2[]) v.clone();
    }

    static {
        R2 r2 = R2.SPLITERATOR;
        j$.time.t r3 = r(r2);
        R2 r22 = R2.STREAM;
        r3.H(r22);
        R2 r23 = R2.OP;
        ((EnumMap) r3.b).put((EnumMap) r23, (R2) 3);
        S2 s2 = new S2("DISTINCT", 0, 0, r3);
        DISTINCT = s2;
        j$.time.t r4 = r(r2);
        r4.H(r22);
        ((EnumMap) r4.b).put((EnumMap) r23, (R2) 3);
        S2 s22 = new S2("SORTED", 1, 1, r4);
        SORTED = s22;
        j$.time.t r5 = r(r2);
        r5.H(r22);
        EnumMap enumMap = (EnumMap) r5.b;
        enumMap.put((EnumMap) r23, (R2) 3);
        R2 r24 = R2.TERMINAL_OP;
        enumMap.put((EnumMap) r24, (R2) 2);
        R2 r25 = R2.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) r25, (R2) 2);
        S2 s23 = new S2("ORDERED", 2, 2, r5);
        ORDERED = s23;
        j$.time.t r6 = r(r2);
        r6.H(r22);
        ((EnumMap) r6.b).put((EnumMap) r23, (R2) 2);
        S2 s24 = new S2("SIZED", 3, 3, r6);
        SIZED = s24;
        j$.time.t r7 = r(r23);
        r7.H(r24);
        int i2 = 0;
        S2 s25 = new S2("SHORT_CIRCUIT", 4, 12, r7);
        SHORT_CIRCUIT = s25;
        v = new S2[]{s2, s22, s23, s24, s25};
        f = o(r2);
        g = o(r22);
        h = o(r23);
        o(r24);
        o(r25);
        for (S2 s26 : values()) {
            i2 |= s26.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        S2 s27 = DISTINCT;
        m = s27.c;
        n = s27.d;
        S2 s28 = SORTED;
        o = s28.c;
        p = s28.d;
        S2 s29 = ORDERED;
        q = s29.c;
        r = s29.d;
        S2 s210 = SIZED;
        s = s210.c;
        t = s210.d;
        u = SHORT_CIRCUIT.c;
    }

    public static j$.time.t r(R2 r2) {
        j$.time.t tVar = new j$.time.t(11, new EnumMap(R2.class));
        tVar.H(r2);
        return tVar;
    }

    public S2(String str, int i2, int i3, j$.time.t tVar) {
        R2[] values = R2.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = (EnumMap) tVar.b;
            if (i4 < length) {
                Map.-EL.putIfAbsent(enumMap, values[i4], 0);
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

    public final boolean q(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int o(R2 r2) {
        int i2 = 0;
        for (S2 s2 : values()) {
            i2 |= ((Integer) s2.a.get(r2)).intValue() << s2.b;
        }
        return i2;
    }

    public static int l(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int p(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
