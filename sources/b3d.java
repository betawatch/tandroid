// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class b3d {
    public static final b3d a;
    public static final b3d b;
    public static final b3d c;
    public static final b3d d;
    public static final b3d e;
    public static final b3d f;
    public static final b3d h;
    public static final b3d n;
    public static final b3d r;
    public static final /* synthetic */ b3d[] s;

    static {
        b3d b3dVar = new b3d("INT", 0);
        a = b3dVar;
        b3d b3dVar2 = new b3d("LONG", 1);
        b = b3dVar2;
        b3d b3dVar3 = new b3d("FLOAT", 2);
        c = b3dVar3;
        b3d b3dVar4 = new b3d("DOUBLE", 3);
        d = b3dVar4;
        b3d b3dVar5 = new b3d("BOOLEAN", 4);
        e = b3dVar5;
        b3d b3dVar6 = new b3d("STRING", 5);
        f = b3dVar6;
        n51 n51Var = n51.c;
        b3d b3dVar7 = new b3d("BYTE_STRING", 6);
        h = b3dVar7;
        b3d b3dVar8 = new b3d("ENUM", 7);
        n = b3dVar8;
        b3d b3dVar9 = new b3d("MESSAGE", 8);
        r = b3dVar9;
        s = new b3d[]{b3dVar, b3dVar2, b3dVar3, b3dVar4, b3dVar5, b3dVar6, b3dVar7, b3dVar8, b3dVar9};
    }

    public static b3d valueOf(String str) {
        return (b3d) Enum.valueOf(b3d.class, str);
    }

    public static b3d[] values() {
        return (b3d[]) s.clone();
    }
}
