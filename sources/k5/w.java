package k5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w {
    public static final w a;
    public static final /* synthetic */ w[] b;

    static {
        w wVar = new w("DEFAULT", 0);
        a = wVar;
        w wVar2 = new w("UNMETERED_ONLY", 1);
        w wVar3 = new w("UNMETERED_OR_DAILY", 2);
        w wVar4 = new w("FAST_IF_RADIO_AWAKE", 3);
        w wVar5 = new w("NEVER", 4);
        w wVar6 = new w("UNRECOGNIZED", 5);
        b = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wVar);
        sparseArray.put(1, wVar2);
        sparseArray.put(2, wVar3);
        sparseArray.put(3, wVar4);
        sparseArray.put(4, wVar5);
        sparseArray.put(-1, wVar6);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) b.clone();
    }
}
