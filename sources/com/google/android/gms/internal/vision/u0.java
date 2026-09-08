package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u0 {
    public static volatile u0 a;
    public static volatile u0 b;
    public static final u0 c;

    static {
        u0 u0Var = new u0();
        Map map = Collections.EMPTY_MAP;
        c = u0Var;
    }

    public static void a() {
        if (a == null) {
            synchronized (u0.class) {
                try {
                    if (a == null) {
                        a = c;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
