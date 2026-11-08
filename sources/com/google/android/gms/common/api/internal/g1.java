package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g1 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ y0 b;

    public g1(y0 y0Var, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(y0Var);
        this.b = y0Var;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        ((Map) this.b.a).remove(this.a);
    }
}
