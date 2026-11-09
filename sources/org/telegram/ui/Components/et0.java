package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class et0 {
    public static final et0 a;
    public static final et0 b;
    public static final /* synthetic */ et0[] c;

    static {
        et0 et0Var = new et0("DEFAULT", 0);
        a = et0Var;
        et0 et0Var2 = new et0("RECORDING", 1);
        b = et0Var2;
        c = new et0[]{et0Var, et0Var2};
    }

    public static et0 valueOf(String str) {
        return (et0) Enum.valueOf(et0.class, str);
    }

    public static et0[] values() {
        return (et0[]) c.clone();
    }
}
