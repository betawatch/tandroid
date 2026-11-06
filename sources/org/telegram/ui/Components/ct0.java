package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ct0 {
    public static final ct0 a;
    public static final ct0 b;
    public static final /* synthetic */ ct0[] c;

    static {
        ct0 ct0Var = new ct0("DEFAULT", 0);
        a = ct0Var;
        ct0 ct0Var2 = new ct0("RECORDING", 1);
        b = ct0Var2;
        c = new ct0[]{ct0Var, ct0Var2};
    }

    public static ct0 valueOf(String str) {
        return (ct0) Enum.valueOf(ct0.class, str);
    }

    public static ct0[] values() {
        return (ct0[]) c.clone();
    }
}
