package ac;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ac.d, still in use, count: 1, list:
  (r4v1 ac.d) from 0x0033: FILLED_NEW_ARRAY (r1v1 ac.d), (r0v0 ac.d), (r5v1 ac.d), (r4v1 ac.d) A[WRAPPED] (LINE:52) elemType: ac.d
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    d(2);

    public static final d[] e;
    public final int a;

    static {
        d dVar = b;
        d dVar2 = c;
        d dVar3 = d;
        e = new d[]{dVar2, dVar, dVar3, r4};
    }

    public d(int i10) {
        this.a = i10;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f.clone();
    }
}
