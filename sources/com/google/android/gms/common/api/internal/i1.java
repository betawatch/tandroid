package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
