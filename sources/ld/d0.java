package ld;

import k7.p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 a;
    public static final /* synthetic */ d0[] b;

    static {
        d0 d0Var = new d0("DEFAULT", 0);
        a = d0Var;
        d0[] d0VarArr = {d0Var, new d0("LAZY", 1), new d0("ATOMIC", 2), new d0("UNDISPATCHED", 3)};
        b = d0VarArr;
        p8.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) b.clone();
    }
}
