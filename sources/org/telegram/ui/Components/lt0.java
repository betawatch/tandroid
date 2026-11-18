package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class lt0 {
    public static final lt0 a;
    public static final lt0 b;
    public static final /* synthetic */ lt0[] c;

    static {
        lt0 lt0Var = new lt0("DEFAULT", 0);
        a = lt0Var;
        lt0 lt0Var2 = new lt0("RECORDING", 1);
        b = lt0Var2;
        c = new lt0[]{lt0Var, lt0Var2};
    }

    public static lt0 valueOf(String str) {
        return (lt0) Enum.valueOf(lt0.class, str);
    }

    public static lt0[] values() {
        return (lt0[]) c.clone();
    }
}
