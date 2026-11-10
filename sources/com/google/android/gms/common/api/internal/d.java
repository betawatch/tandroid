package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class d extends BasePendingResult implements e {
    public final com.google.android.gms.common.api.d o;
    public final com.google.android.gms.common.api.e p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        q6.m.h(mVar, "GoogleApiClient must not be null");
        q6.m.h(eVar, "Api must not be null");
        this.o = eVar.b;
        this.p = eVar;
    }

    public abstract void n(com.google.android.gms.common.api.c cVar);

    public final void o(Status status) {
        q6.m.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
