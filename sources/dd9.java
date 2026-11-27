// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dd9 {
    public static final dd9 a;
    public static final dd9 b;
    public static final dd9 c;
    public static final /* synthetic */ dd9[] d;

    static {
        dd9 dd9Var = new dd9("BY_PRICE", 0);
        a = dd9Var;
        dd9 dd9Var2 = new dd9("BY_DATE", 1);
        b = dd9Var2;
        dd9 dd9Var3 = new dd9("BY_NUMBER", 2);
        c = dd9Var3;
        d = new dd9[]{dd9Var, dd9Var2, dd9Var3};
    }

    public static dd9 valueOf(String str) {
        return (dd9) Enum.valueOf(dd9.class, str);
    }

    public static dd9[] values() {
        return (dd9[]) d.clone();
    }
}
