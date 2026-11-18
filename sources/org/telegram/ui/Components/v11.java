package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v11 {
    public static final v11 a;
    public static final v11 b;
    public static final v11 c;
    public static final /* synthetic */ v11[] d;

    static {
        v11 v11Var = new v11("TOP", 0);
        a = v11Var;
        v11 v11Var2 = new v11("LEFT", 1);
        b = v11Var2;
        v11 v11Var3 = new v11("BOTTOM", 2);
        c = v11Var3;
        d = new v11[]{v11Var, v11Var2, v11Var3};
    }

    public static v11 valueOf(String str) {
        return (v11) Enum.valueOf(v11.class, str);
    }

    public static v11[] values() {
        return (v11[]) d.clone();
    }
}
