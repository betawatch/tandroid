// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class d8d implements r68 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ zhc b;

    public d8d(zhc zhcVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(zhcVar);
        this.b = zhcVar;
    }

    @Override // r68
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
