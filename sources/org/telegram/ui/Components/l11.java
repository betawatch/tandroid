package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l11 {
    public static final l11 a;
    public static final l11 b;
    public static final l11 c;
    public static final /* synthetic */ l11[] d;

    static {
        l11 l11Var = new l11("TOP", 0);
        a = l11Var;
        l11 l11Var2 = new l11("LEFT", 1);
        b = l11Var2;
        l11 l11Var3 = new l11("BOTTOM", 2);
        c = l11Var3;
        d = new l11[]{l11Var, l11Var2, l11Var3};
    }

    public static l11 valueOf(String str) {
        return (l11) Enum.valueOf(l11.class, str);
    }

    public static l11[] values() {
        return (l11[]) d.clone();
    }
}
