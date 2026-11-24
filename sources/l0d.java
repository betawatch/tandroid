// default package

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
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class l0d {
    public static final h0d c;
    public static final i0d d;
    public static final j0d e;
    public static final /* synthetic */ l0d[] f;
    public final m0d a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    l0d EF0;

    /* JADX INFO: Fake field, exist only in values array */
    l0d EF1;

    /* JADX INFO: Fake field, exist only in values array */
    l0d EF2;

    static {
        l0d l0dVar = new l0d("DOUBLE", 0, m0d.d, 1);
        l0d l0dVar2 = new l0d("FLOAT", 1, m0d.c, 5);
        m0d m0dVar = m0d.b;
        l0d l0dVar3 = new l0d("INT64", 2, m0dVar, 0);
        l0d l0dVar4 = new l0d("UINT64", 3, m0dVar, 0);
        m0d m0dVar2 = m0d.a;
        l0d l0dVar5 = new l0d("INT32", 4, m0dVar2, 0);
        l0d l0dVar6 = new l0d("FIXED64", 5, m0dVar, 1);
        l0d l0dVar7 = new l0d("FIXED32", 6, m0dVar2, 5);
        l0d l0dVar8 = new l0d("BOOL", 7, m0d.e, 0);
        h0d h0dVar = new h0d("STRING", 8, m0d.f, 2);
        c = h0dVar;
        m0d m0dVar3 = m0d.r;
        i0d i0dVar = new i0d("GROUP", 9, m0dVar3, 3);
        d = i0dVar;
        j0d j0dVar = new j0d("MESSAGE", 10, m0dVar3, 2);
        e = j0dVar;
        f = new l0d[]{l0dVar, l0dVar2, l0dVar3, l0dVar4, l0dVar5, l0dVar6, l0dVar7, l0dVar8, h0dVar, i0dVar, j0dVar, new k0d("BYTES", 11, m0d.h, 2), new l0d("UINT32", 12, m0dVar2, 0), new l0d("ENUM", 13, m0d.n, 0), new l0d("SFIXED32", 14, m0dVar2, 5), new l0d("SFIXED64", 15, m0dVar, 1), new l0d("SINT32", 16, m0dVar2, 0), new l0d("SINT64", 17, m0dVar, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0d(String str, int i, m0d m0dVar, int i2) {
        this.a = m0dVar;
        this.b = i2;
    }

    public static l0d valueOf(String str) {
        return (l0d) Enum.valueOf(l0d.class, str);
    }

    public static l0d[] values() {
        return (l0d[]) f.clone();
    }
}
