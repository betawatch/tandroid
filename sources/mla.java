// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mla {
    public static final mla a;
    public static final mla b;
    public static final /* synthetic */ mla[] c;

    static {
        mla mlaVar = new mla("GLASS", 0);
        a = mlaVar;
        mla mlaVar2 = new mla("ACCENT", 1);
        b = mlaVar2;
        c = new mla[]{mlaVar, mlaVar2};
    }

    public static mla valueOf(String str) {
        return (mla) Enum.valueOf(mla.class, str);
    }

    public static mla[] values() {
        return (mla[]) c.clone();
    }
}
