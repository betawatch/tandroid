package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ev0 {
    public static final ev0 a;
    public static final ev0 b;
    public static final /* synthetic */ ev0[] c;

    static {
        ev0 ev0Var = new ev0("DEFAULT", 0);
        a = ev0Var;
        ev0 ev0Var2 = new ev0("RECORDING", 1);
        b = ev0Var2;
        c = new ev0[]{ev0Var, ev0Var2};
    }

    public static ev0 valueOf(String str) {
        return (ev0) Enum.valueOf(ev0.class, str);
    }

    public static ev0[] values() {
        return (ev0[]) c.clone();
    }
}
