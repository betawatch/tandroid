package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
