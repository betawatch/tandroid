package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class v1 {
    public static final r1 c;
    public static final s1 d;
    public static final t1 e;
    public static final /* synthetic */ v1[] f;
    public final w1 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF2;

    static {
        v1 v1Var = new v1("DOUBLE", 0, w1.d, 1);
        v1 v1Var2 = new v1("FLOAT", 1, w1.c, 5);
        w1 w1Var = w1.b;
        v1 v1Var3 = new v1("INT64", 2, w1Var, 0);
        v1 v1Var4 = new v1("UINT64", 3, w1Var, 0);
        w1 w1Var2 = w1.a;
        v1 v1Var5 = new v1("INT32", 4, w1Var2, 0);
        v1 v1Var6 = new v1("FIXED64", 5, w1Var, 1);
        v1 v1Var7 = new v1("FIXED32", 6, w1Var2, 5);
        v1 v1Var8 = new v1("BOOL", 7, w1.e, 0);
        r1 r1Var = new r1("STRING", 8, w1.f, 2);
        c = r1Var;
        w1 w1Var3 = w1.r;
        s1 s1Var = new s1("GROUP", 9, w1Var3, 3);
        d = s1Var;
        t1 t1Var = new t1("MESSAGE", 10, w1Var3, 2);
        e = t1Var;
        f = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, r1Var, s1Var, t1Var, new u1("BYTES", 11, w1.h, 2), new v1("UINT32", 12, w1Var2, 0), new v1("ENUM", 13, w1.n, 0), new v1("SFIXED32", 14, w1Var2, 5), new v1("SFIXED64", 15, w1Var, 1), new v1("SINT32", 16, w1Var2, 0), new v1("SINT64", 17, w1Var, 0)};
    }

    public v1(String str, int i7, w1 w1Var, int i10) {
        this.a = w1Var;
        this.b = i10;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) f.clone();
    }
}
