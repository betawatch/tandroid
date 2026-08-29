package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wu0 {
    public static final wu0 a;
    public static final wu0 b;
    public static final /* synthetic */ wu0[] c;

    static {
        wu0 wu0Var = new wu0("DEFAULT", 0);
        a = wu0Var;
        wu0 wu0Var2 = new wu0("RECORDING", 1);
        b = wu0Var2;
        c = new wu0[]{wu0Var, wu0Var2};
    }

    public static wu0 valueOf(String str) {
        return (wu0) Enum.valueOf(wu0.class, str);
    }

    public static wu0[] values() {
        return (wu0[]) c.clone();
    }
}
