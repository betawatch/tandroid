// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o5d implements d58 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ rhb b;

    public o5d(rhb rhbVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(rhbVar);
        this.b = rhbVar;
    }

    @Override // d58
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
