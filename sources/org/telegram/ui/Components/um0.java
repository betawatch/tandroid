package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class um0 {
    public static final um0 a;
    public static final um0 b;
    public static final /* synthetic */ um0[] c;

    static {
        um0 um0Var = new um0("LINE", 0);
        a = um0Var;
        um0 um0Var2 = new um0("TAB", 1);
        b = um0Var2;
        c = new um0[]{um0Var, um0Var2};
    }

    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    public static um0[] values() {
        return (um0[]) c.clone();
    }
}
