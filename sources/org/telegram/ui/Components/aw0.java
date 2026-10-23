package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class aw0 {
    public static final aw0 a;
    public static final aw0 b;
    public static final /* synthetic */ aw0[] c;

    static {
        aw0 aw0Var = new aw0("DEFAULT", 0);
        a = aw0Var;
        aw0 aw0Var2 = new aw0("RECORDING", 1);
        b = aw0Var2;
        c = new aw0[]{aw0Var, aw0Var2};
    }

    public static aw0 valueOf(String str) {
        return (aw0) Enum.valueOf(aw0.class, str);
    }

    public static aw0[] values() {
        return (aw0[]) c.clone();
    }
}
