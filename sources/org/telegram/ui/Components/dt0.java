package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dt0 {
    public static final dt0 a;
    public static final dt0 b;
    public static final /* synthetic */ dt0[] c;

    static {
        dt0 dt0Var = new dt0("DEFAULT", 0);
        a = dt0Var;
        dt0 dt0Var2 = new dt0("RECORDING", 1);
        b = dt0Var2;
        c = new dt0[]{dt0Var, dt0Var2};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) c.clone();
    }
}
