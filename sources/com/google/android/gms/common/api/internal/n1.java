package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n1 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                lf.d dVar = new lf.d();
                dVar.a = new byte[4096];
                return dVar;
            case 2:
                return new Random();
            default:
                return 0L;
        }
    }
}
