package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fl0 {
    public static final fl0 a;
    public static final fl0 b;
    public static final /* synthetic */ fl0[] c;

    static {
        fl0 fl0Var = new fl0("LINE", 0);
        a = fl0Var;
        fl0 fl0Var2 = new fl0("TAB", 1);
        b = fl0Var2;
        c = new fl0[]{fl0Var, fl0Var2};
    }

    public static fl0 valueOf(String str) {
        return (fl0) Enum.valueOf(fl0.class, str);
    }

    public static fl0[] values() {
        return (fl0[]) c.clone();
    }
}
