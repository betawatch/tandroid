// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
