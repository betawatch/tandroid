package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class e extends BasePendingResult implements f {
    public final com.google.android.gms.common.api.d o;
    public final com.google.android.gms.common.api.e p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        n6.l.i(mVar, "GoogleApiClient must not be null");
        n6.l.i(eVar, "Api must not be null");
        this.o = eVar.b;
        this.p = eVar;
    }

    public abstract void n(com.google.android.gms.common.api.c cVar);

    public final void o(Status status) {
        n6.l.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
