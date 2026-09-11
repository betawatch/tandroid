package com.google.android.gms.common.api.internal;

import java.util.Random;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n1 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                mf.d dVar = new mf.d();
                dVar.a = new byte[4096];
                return dVar;
            case 2:
                return new Random();
            default:
                return 0L;
        }
    }
}
