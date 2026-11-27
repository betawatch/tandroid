// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
