package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bt0 {
    public static final bt0 a;
    public static final bt0 b;
    public static final /* synthetic */ bt0[] c;

    static {
        bt0 bt0Var = new bt0("DEFAULT", 0);
        a = bt0Var;
        bt0 bt0Var2 = new bt0("RECORDING", 1);
        b = bt0Var2;
        c = new bt0[]{bt0Var, bt0Var2};
    }

    public static bt0 valueOf(String str) {
        return (bt0) Enum.valueOf(bt0.class, str);
    }

    public static bt0[] values() {
        return (bt0[]) c.clone();
    }
}
