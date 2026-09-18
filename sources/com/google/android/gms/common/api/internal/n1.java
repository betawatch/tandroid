package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
