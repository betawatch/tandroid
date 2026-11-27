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
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class a3d {
    public static final w2d c;
    public static final x2d d;
    public static final y2d e;
    public static final /* synthetic */ a3d[] f;
    public final b3d a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    a3d EF0;

    /* JADX INFO: Fake field, exist only in values array */
    a3d EF1;

    /* JADX INFO: Fake field, exist only in values array */
    a3d EF2;

    static {
        a3d a3dVar = new a3d("DOUBLE", 0, b3d.d, 1);
        a3d a3dVar2 = new a3d("FLOAT", 1, b3d.c, 5);
        b3d b3dVar = b3d.b;
        a3d a3dVar3 = new a3d("INT64", 2, b3dVar, 0);
        a3d a3dVar4 = new a3d("UINT64", 3, b3dVar, 0);
        b3d b3dVar2 = b3d.a;
        a3d a3dVar5 = new a3d("INT32", 4, b3dVar2, 0);
        a3d a3dVar6 = new a3d("FIXED64", 5, b3dVar, 1);
        a3d a3dVar7 = new a3d("FIXED32", 6, b3dVar2, 5);
        a3d a3dVar8 = new a3d("BOOL", 7, b3d.e, 0);
        w2d w2dVar = new w2d("STRING", 8, b3d.f, 2);
        c = w2dVar;
        b3d b3dVar3 = b3d.r;
        x2d x2dVar = new x2d("GROUP", 9, b3dVar3, 3);
        d = x2dVar;
        y2d y2dVar = new y2d("MESSAGE", 10, b3dVar3, 2);
        e = y2dVar;
        f = new a3d[]{a3dVar, a3dVar2, a3dVar3, a3dVar4, a3dVar5, a3dVar6, a3dVar7, a3dVar8, w2dVar, x2dVar, y2dVar, new z2d("BYTES", 11, b3d.h, 2), new a3d("UINT32", 12, b3dVar2, 0), new a3d("ENUM", 13, b3d.n, 0), new a3d("SFIXED32", 14, b3dVar2, 5), new a3d("SFIXED64", 15, b3dVar, 1), new a3d("SINT32", 16, b3dVar2, 0), new a3d("SINT64", 17, b3dVar, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3d(String str, int i, b3d b3dVar, int i2) {
        this.a = b3dVar;
        this.b = i2;
    }

    public static a3d valueOf(String str) {
        return (a3d) Enum.valueOf(a3d.class, str);
    }

    public static a3d[] values() {
        return (a3d[]) f.clone();
    }
}
