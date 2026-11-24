// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m0d {
    public static final m0d a;
    public static final m0d b;
    public static final m0d c;
    public static final m0d d;
    public static final m0d e;
    public static final m0d f;
    public static final m0d h;
    public static final m0d n;
    public static final m0d r;
    public static final /* synthetic */ m0d[] s;

    static {
        m0d m0dVar = new m0d("INT", 0);
        a = m0dVar;
        m0d m0dVar2 = new m0d("LONG", 1);
        b = m0dVar2;
        m0d m0dVar3 = new m0d("FLOAT", 2);
        c = m0dVar3;
        m0d m0dVar4 = new m0d("DOUBLE", 3);
        d = m0dVar4;
        m0d m0dVar5 = new m0d("BOOLEAN", 4);
        e = m0dVar5;
        m0d m0dVar6 = new m0d("STRING", 5);
        f = m0dVar6;
        m61 m61Var = m61.c;
        m0d m0dVar7 = new m0d("BYTE_STRING", 6);
        h = m0dVar7;
        m0d m0dVar8 = new m0d("ENUM", 7);
        n = m0dVar8;
        m0d m0dVar9 = new m0d("MESSAGE", 8);
        r = m0dVar9;
        s = new m0d[]{m0dVar, m0dVar2, m0dVar3, m0dVar4, m0dVar5, m0dVar6, m0dVar7, m0dVar8, m0dVar9};
    }

    public static m0d valueOf(String str) {
        return (m0d) Enum.valueOf(m0d.class, str);
    }

    public static m0d[] values() {
        return (m0d[]) s.clone();
    }
}
