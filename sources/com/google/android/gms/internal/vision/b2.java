package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b2 {
    public static a2 a(Object obj, Object obj2) {
        a2 a2Var = (a2) obj;
        a2 a2Var2 = (a2) obj2;
        if (!a2Var2.isEmpty()) {
            if (!a2Var.a) {
                if (a2Var.isEmpty()) {
                    a2Var = new a2();
                } else {
                    a2 a2Var3 = new a2(a2Var);
                    a2Var3.a = true;
                    a2Var = a2Var3;
                }
            }
            a2Var.b();
            if (!a2Var2.isEmpty()) {
                a2Var.putAll(a2Var2);
            }
        }
        return a2Var;
    }

    public static void b(Object obj, Object obj2) {
        a2 a2Var = (a2) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (a2Var.isEmpty()) {
            return;
        }
        Iterator it = a2Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
