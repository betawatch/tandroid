package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a41 {
    public static final a41 a;
    public static final a41 b;
    public static final a41 c;
    public static final /* synthetic */ a41[] d;

    static {
        a41 a41Var = new a41("TOP", 0);
        a = a41Var;
        a41 a41Var2 = new a41("LEFT", 1);
        b = a41Var2;
        a41 a41Var3 = new a41("BOTTOM", 2);
        c = a41Var3;
        d = new a41[]{a41Var, a41Var2, a41Var3};
    }

    public static a41 valueOf(String str) {
        return (a41) Enum.valueOf(a41.class, str);
    }

    public static a41[] values() {
        return (a41[]) d.clone();
    }
}
