package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
