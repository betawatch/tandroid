package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
