package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qv0 {
    public static final qv0 a;
    public static final qv0 b;
    public static final /* synthetic */ qv0[] c;

    static {
        qv0 qv0Var = new qv0("DEFAULT", 0);
        a = qv0Var;
        qv0 qv0Var2 = new qv0("RECORDING", 1);
        b = qv0Var2;
        c = new qv0[]{qv0Var, qv0Var2};
    }

    public static qv0 valueOf(String str) {
        return (qv0) Enum.valueOf(qv0.class, str);
    }

    public static qv0[] values() {
        return (qv0[]) c.clone();
    }
}
