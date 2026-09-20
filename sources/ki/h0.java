package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h0 {
    public static final h0 a;
    public static final h0 b;
    public static final /* synthetic */ h0[] c;

    static {
        h0 h0Var = new h0("FRONT", 0);
        a = h0Var;
        h0 h0Var2 = new h0("BACK", 1);
        b = h0Var2;
        c = new h0[]{h0Var, h0Var2};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) c.clone();
    }
}
