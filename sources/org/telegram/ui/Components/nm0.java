package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nm0 {
    public static final nm0 a;
    public static final nm0 b;
    public static final /* synthetic */ nm0[] c;

    static {
        nm0 nm0Var = new nm0("LINE", 0);
        a = nm0Var;
        nm0 nm0Var2 = new nm0("TAB", 1);
        b = nm0Var2;
        c = new nm0[]{nm0Var, nm0Var2};
    }

    public static nm0 valueOf(String str) {
        return (nm0) Enum.valueOf(nm0.class, str);
    }

    public static nm0[] values() {
        return (nm0[]) c.clone();
    }
}
