package com.google.android.gms.common.api.internal;

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o1 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                ef.d dVar = new ef.d();
                dVar.a = new byte[TLObject.FLAG_12];
                return dVar;
            case 2:
                return new Random();
            case 3:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            default:
                return 0L;
        }
    }
}
