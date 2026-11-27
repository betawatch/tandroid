// default package

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 el7, still in use, count: 1, list:
  (r0v0 el7) from 0x0128: INVOKE (r2v11 android.util.SparseArray), (0 int), (r0v0 el7) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:297)
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
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class el7 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(9),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(12),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(13),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(14),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(15),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(16),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(17),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(18),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(19),
    /* JADX INFO: Fake field, exist only in values array */
    EF236(100);

    public static final SparseArray a;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(5, r9);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r12);
        sparseArray.put(11, r10);
        sparseArray.put(12, r8);
        sparseArray.put(13, r6);
        sparseArray.put(14, r4);
        sparseArray.put(15, r2);
        sparseArray.put(16, r6);
        sparseArray.put(17, r4);
        sparseArray.put(18, r2);
        sparseArray.put(19, r6);
    }

    public el7(int i) {
    }

    public static el7 valueOf(String str) {
        return (el7) Enum.valueOf(el7.class, str);
    }

    public static el7[] values() {
        return (el7[]) b.clone();
    }
}
