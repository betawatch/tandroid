// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
