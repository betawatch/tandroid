// default package

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 g54, still in use, count: 1, list:
  (r4v1 g54) from 0x0033: FILLED_NEW_ARRAY (r1v1 g54), (r0v0 g54), (r5v1 g54), (r4v1 g54) A[WRAPPED] (LINE:52) elemType: g54
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g54 {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    d(2);

    public static final g54[] e;
    public final byte a;

    static {
        g54 g54Var = b;
        g54 g54Var2 = c;
        g54 g54Var3 = d;
        e = new g54[]{g54Var2, g54Var, g54Var3, r4};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g54(int i) {
        this.a = i;
    }

    public static g54 valueOf(String str) {
        return (g54) Enum.valueOf(g54.class, str);
    }

    public static g54[] values() {
        return (g54[]) f.clone();
    }
}
