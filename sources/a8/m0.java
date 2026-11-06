package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m0 {
    public static final m0 a;
    public static final /* synthetic */ m0[] b;

    static {
        m0 m0Var = new m0("DEFAULT", 0);
        a = m0Var;
        b = new m0[]{m0Var, new m0("SIGNED", 1), new m0("FIXED", 2)};
    }

    public static m0[] values() {
        return (m0[]) b.clone();
    }
}
