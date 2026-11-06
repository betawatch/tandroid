package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o {
    public final o5.p a;
    public volatile m b;

    public o(Looper looper, Object obj, String str) {
        this.a = new o5.p(looper);
        q6.m.h(obj, "Listener must not be null");
        q6.m.e(str);
        this.b = new m(obj, str);
    }

    public final void a(n nVar) {
        this.a.execute(new l0(this, nVar));
    }
}
