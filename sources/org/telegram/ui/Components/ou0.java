package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ou0 {
    public static final ou0 a;
    public static final ou0 b;
    public static final /* synthetic */ ou0[] c;

    static {
        ou0 ou0Var = new ou0("DEFAULT", 0);
        a = ou0Var;
        ou0 ou0Var2 = new ou0("RECORDING", 1);
        b = ou0Var2;
        c = new ou0[]{ou0Var, ou0Var2};
    }

    public static ou0 valueOf(String str) {
        return (ou0) Enum.valueOf(ou0.class, str);
    }

    public static ou0[] values() {
        return (ou0[]) c.clone();
    }
}
