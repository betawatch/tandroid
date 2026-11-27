// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cp9 {
    public static final cp9 a;
    public static final cp9 b;
    public static final /* synthetic */ cp9[] c;

    static {
        cp9 cp9Var = new cp9("FRONT", 0);
        a = cp9Var;
        cp9 cp9Var2 = new cp9("BACK", 1);
        b = cp9Var2;
        c = new cp9[]{cp9Var, cp9Var2};
    }

    public static cp9 valueOf(String str) {
        return (cp9) Enum.valueOf(cp9.class, str);
    }

    public static cp9[] values() {
        return (cp9[]) c.clone();
    }
}
