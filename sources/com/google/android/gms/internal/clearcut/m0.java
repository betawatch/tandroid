package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class m0 {
    public static l0 a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (!l0Var2.isEmpty()) {
            if (!l0Var.a) {
                if (l0Var.isEmpty()) {
                    l0Var = new l0();
                } else {
                    l0 l0Var3 = new l0(l0Var);
                    l0Var3.a = true;
                    l0Var = l0Var3;
                }
            }
            l0Var.a();
            if (!l0Var2.isEmpty()) {
                l0Var.putAll(l0Var2);
            }
        }
        return l0Var;
    }
}
