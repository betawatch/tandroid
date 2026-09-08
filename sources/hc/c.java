package hc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 hc.c, still in use, count: 1, list:
  (r4v1 hc.c) from 0x0031: FILLED_NEW_ARRAY (r1v1 hc.c), (r0v0 hc.c), (r5v1 hc.c), (r4v1 hc.c) A[WRAPPED] (LINE:50) elemType: hc.c
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
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(2);

    public static final c[] d;
    public final int a;

    static {
        c cVar = b;
        c cVar2 = c;
        d = new c[]{cVar2, cVar, r5, r4};
    }

    public c(int i10) {
        this.a = i10;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }
}
