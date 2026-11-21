package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x11 {
    public static final x11 a;
    public static final x11 b;
    public static final x11 c;
    public static final /* synthetic */ x11[] d;

    static {
        x11 x11Var = new x11("TOP", 0);
        a = x11Var;
        x11 x11Var2 = new x11("LEFT", 1);
        b = x11Var2;
        x11 x11Var3 = new x11("BOTTOM", 2);
        c = x11Var3;
        d = new x11[]{x11Var, x11Var2, x11Var3};
    }

    public static x11 valueOf(String str) {
        return (x11) Enum.valueOf(x11.class, str);
    }

    public static x11[] values() {
        return (x11[]) d.clone();
    }
}
