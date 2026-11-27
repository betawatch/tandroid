// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
