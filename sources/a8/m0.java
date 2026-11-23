package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
