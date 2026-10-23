package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
