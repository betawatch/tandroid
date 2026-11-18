package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class i1 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ a1 b;

    public i1(a1 a1Var, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(a1Var);
        this.b = a1Var;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        ((Map) this.b.a).remove(this.a);
    }
}
