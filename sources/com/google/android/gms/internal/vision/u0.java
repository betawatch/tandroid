package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
