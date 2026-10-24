package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jn0 {
    public static final jn0 a;
    public static final jn0 b;
    public static final /* synthetic */ jn0[] c;

    static {
        jn0 jn0Var = new jn0("LINE", 0);
        a = jn0Var;
        jn0 jn0Var2 = new jn0("TAB", 1);
        b = jn0Var2;
        c = new jn0[]{jn0Var, jn0Var2};
    }

    public static jn0 valueOf(String str) {
        return (jn0) Enum.valueOf(jn0.class, str);
    }

    public static jn0[] values() {
        return (jn0[]) c.clone();
    }
}
