package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 a;
    public static final /* synthetic */ d0[] b;

    static {
        d0 d0Var = new d0("DEFAULT", 0);
        a = d0Var;
        b = new d0[]{d0Var, new d0("SIGNED", 1), new d0("FIXED", 2)};
    }

    public static d0[] values() {
        return (d0[]) b.clone();
    }
}
