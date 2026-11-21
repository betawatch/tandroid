package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x7 {
    public static final x7 a;
    public static final x7 b;
    public static final x7 c;
    public static final /* synthetic */ x7[] d;

    static {
        x7 x7Var = new x7("BY_PRICE", 0);
        a = x7Var;
        x7 x7Var2 = new x7("BY_DATE", 1);
        b = x7Var2;
        x7 x7Var3 = new x7("BY_NUMBER", 2);
        c = x7Var3;
        d = new x7[]{x7Var, x7Var2, x7Var3};
    }

    public static x7 valueOf(String str) {
        return (x7) Enum.valueOf(x7.class, str);
    }

    public static x7[] values() {
        return (x7[]) d.clone();
    }
}
