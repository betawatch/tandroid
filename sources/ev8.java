// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ev8 {
    public static final ev8 a;
    public static final /* synthetic */ ev8[] b;

    static {
        ev8 ev8Var = new ev8("DEFAULT", 0);
        a = ev8Var;
        ev8 ev8Var2 = new ev8("UNMETERED_ONLY", 1);
        ev8 ev8Var3 = new ev8("UNMETERED_OR_DAILY", 2);
        ev8 ev8Var4 = new ev8("FAST_IF_RADIO_AWAKE", 3);
        ev8 ev8Var5 = new ev8("NEVER", 4);
        ev8 ev8Var6 = new ev8("UNRECOGNIZED", 5);
        b = new ev8[]{ev8Var, ev8Var2, ev8Var3, ev8Var4, ev8Var5, ev8Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ev8Var);
        sparseArray.put(1, ev8Var2);
        sparseArray.put(2, ev8Var3);
        sparseArray.put(3, ev8Var4);
        sparseArray.put(4, ev8Var5);
        sparseArray.put(-1, ev8Var6);
    }

    public static ev8 valueOf(String str) {
        return (ev8) Enum.valueOf(ev8.class, str);
    }

    public static ev8[] values() {
        return (ev8[]) b.clone();
    }
}
