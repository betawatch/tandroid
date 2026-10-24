package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c5 {
    public static final c5 a;
    public static final c5 b;
    public static final /* synthetic */ c5[] c;

    static {
        c5 c5Var = new c5("BACK", 0);
        a = c5Var;
        c5 c5Var2 = new c5("MENU", 1);
        b = c5Var2;
        c = new c5[]{c5Var, c5Var2};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) c.clone();
    }
}
