// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aq2 {
    public static final aq2 a;
    public static final /* synthetic */ aq2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    aq2 EF0;

    static {
        aq2 aq2Var = new aq2("NOT_SET", 0);
        aq2 aq2Var2 = new aq2("EVENT_OVERRIDE", 1);
        a = aq2Var2;
        b = new aq2[]{aq2Var, aq2Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, aq2Var);
        sparseArray.put(5, aq2Var2);
    }

    public static aq2 valueOf(String str) {
        return (aq2) Enum.valueOf(aq2.class, str);
    }

    public static aq2[] values() {
        return (aq2[]) b.clone();
    }
}
