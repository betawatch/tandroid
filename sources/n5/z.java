package n5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class z {
    public static final z a;
    public static final /* synthetic */ z[] b;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z("NOT_SET", 0);
        z zVar2 = new z("EVENT_OVERRIDE", 1);
        a = zVar2;
        b = new z[]{zVar, zVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) b.clone();
    }
}
