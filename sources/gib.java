// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gib {
    public static final gib a;
    public static final gib b;
    public static final gib c;
    public static final /* synthetic */ gib[] d;

    static {
        gib gibVar = new gib("LEFT", 0);
        a = gibVar;
        gib gibVar2 = new gib("CENTER", 1);
        b = gibVar2;
        gib gibVar3 = new gib("RIGHT", 2);
        c = gibVar3;
        d = new gib[]{gibVar, gibVar2, gibVar3};
    }

    public static gib valueOf(String str) {
        return (gib) Enum.valueOf(gib.class, str);
    }

    public static gib[] values() {
        return (gib[]) d.clone();
    }
}
