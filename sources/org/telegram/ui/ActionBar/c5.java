package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c5 {
    public static final c5 a;
    public static final c5 b;
    public static final /* synthetic */ c5[] c;

    static {
        c5 c5Var = new c5("BACK", 0);
        a = c5Var;
        c5 c5Var2 = new c5("MENU", 1);
        b = c5Var2;
        c = new c5[]{c5Var, c5Var2};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) c.clone();
    }
}
