// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fx8 {
    public static final fx8 a;
    public static final /* synthetic */ fx8[] b;

    static {
        fx8 fx8Var = new fx8("DEFAULT", 0);
        a = fx8Var;
        fx8 fx8Var2 = new fx8("UNMETERED_ONLY", 1);
        fx8 fx8Var3 = new fx8("UNMETERED_OR_DAILY", 2);
        fx8 fx8Var4 = new fx8("FAST_IF_RADIO_AWAKE", 3);
        fx8 fx8Var5 = new fx8("NEVER", 4);
        fx8 fx8Var6 = new fx8("UNRECOGNIZED", 5);
        b = new fx8[]{fx8Var, fx8Var2, fx8Var3, fx8Var4, fx8Var5, fx8Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, fx8Var);
        sparseArray.put(1, fx8Var2);
        sparseArray.put(2, fx8Var3);
        sparseArray.put(3, fx8Var4);
        sparseArray.put(4, fx8Var5);
        sparseArray.put(-1, fx8Var6);
    }

    public static fx8 valueOf(String str) {
        return (fx8) Enum.valueOf(fx8.class, str);
    }

    public static fx8[] values() {
        return (fx8[]) b.clone();
    }
}
