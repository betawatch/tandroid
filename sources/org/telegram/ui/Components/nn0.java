package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nn0 {
    public static final nn0 a;
    public static final nn0 b;
    public static final /* synthetic */ nn0[] c;

    static {
        nn0 nn0Var = new nn0("LINE", 0);
        a = nn0Var;
        nn0 nn0Var2 = new nn0("TAB", 1);
        b = nn0Var2;
        c = new nn0[]{nn0Var, nn0Var2};
    }

    public static nn0 valueOf(String str) {
        return (nn0) Enum.valueOf(nn0.class, str);
    }

    public static nn0[] values() {
        return (nn0[]) c.clone();
    }
}
