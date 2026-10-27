package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b41 {
    public static final b41 a;
    public static final b41 b;
    public static final b41 c;
    public static final /* synthetic */ b41[] d;

    static {
        b41 b41Var = new b41("TOP", 0);
        a = b41Var;
        b41 b41Var2 = new b41("LEFT", 1);
        b = b41Var2;
        b41 b41Var3 = new b41("BOTTOM", 2);
        c = b41Var3;
        d = new b41[]{b41Var, b41Var2, b41Var3};
    }

    public static b41 valueOf(String str) {
        return (b41) Enum.valueOf(b41.class, str);
    }

    public static b41[] values() {
        return (b41[]) d.clone();
    }
}
