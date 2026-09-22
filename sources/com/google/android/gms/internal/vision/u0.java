package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
