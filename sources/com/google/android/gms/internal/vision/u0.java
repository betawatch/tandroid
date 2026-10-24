package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
