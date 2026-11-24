// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hp2 {
    public static final hp2 a;
    public static final /* synthetic */ hp2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    hp2 EF0;

    static {
        hp2 hp2Var = new hp2("NOT_SET", 0);
        hp2 hp2Var2 = new hp2("EVENT_OVERRIDE", 1);
        a = hp2Var2;
        b = new hp2[]{hp2Var, hp2Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, hp2Var);
        sparseArray.put(5, hp2Var2);
    }

    public static hp2 valueOf(String str) {
        return (hp2) Enum.valueOf(hp2.class, str);
    }

    public static hp2[] values() {
        return (hp2[]) b.clone();
    }
}
