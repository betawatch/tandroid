package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class d extends BasePendingResult implements e {
    public final com.google.android.gms.common.api.d o;
    public final com.google.android.gms.common.api.e p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        q6.m.i(mVar, "GoogleApiClient must not be null");
        q6.m.i(eVar, "Api must not be null");
        this.o = eVar.b;
        this.p = eVar;
    }

    public abstract void n(com.google.android.gms.common.api.c cVar);

    public final void o(Status status) {
        q6.m.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
