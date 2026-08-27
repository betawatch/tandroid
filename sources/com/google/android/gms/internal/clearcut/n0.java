package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class n0 {
    public static m0 a(Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.a) {
                if (m0Var.isEmpty()) {
                    m0Var = new m0();
                } else {
                    m0 m0Var3 = new m0(m0Var);
                    m0Var3.a = true;
                    m0Var = m0Var3;
                }
            }
            m0Var.a();
            if (!m0Var2.isEmpty()) {
                m0Var.putAll(m0Var2);
            }
        }
        return m0Var;
    }
}
