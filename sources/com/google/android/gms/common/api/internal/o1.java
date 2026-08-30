package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o1 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return new Random();
            case 2:
                return 0L;
            default:
                ye.d dVar = new ye.d();
                dVar.a = new byte[4096];
                return dVar;
        }
    }
}
