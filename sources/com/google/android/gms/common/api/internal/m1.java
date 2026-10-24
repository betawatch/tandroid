package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class m1 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                nf.d dVar = new nf.d();
                dVar.a = new byte[4096];
                return dVar;
            case 2:
                return new Random();
            default:
                return 0L;
        }
    }
}
