package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
