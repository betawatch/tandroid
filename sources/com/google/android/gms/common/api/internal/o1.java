package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                xe.e eVar = new xe.e();
                eVar.a = new byte[4096];
                return eVar;
        }
    }
}
