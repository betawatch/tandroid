package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rm0 {
    public static final rm0 a;
    public static final rm0 b;
    public static final /* synthetic */ rm0[] c;

    static {
        rm0 rm0Var = new rm0("LINE", 0);
        a = rm0Var;
        rm0 rm0Var2 = new rm0("TAB", 1);
        b = rm0Var2;
        c = new rm0[]{rm0Var, rm0Var2};
    }

    public static rm0 valueOf(String str) {
        return (rm0) Enum.valueOf(rm0.class, str);
    }

    public static rm0[] values() {
        return (rm0[]) c.clone();
    }
}
