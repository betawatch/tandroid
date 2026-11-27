// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class jg0 extends BasePendingResult implements kg0 {
    public final xn o;
    public final zn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(zn znVar, o6d o6dVar) {
        super(o6dVar);
        xve.i(o6dVar, "GoogleApiClient must not be null");
        xve.i(znVar, "Api must not be null");
        this.o = znVar.b;
        this.p = znVar;
    }

    public abstract void n(d05 d05Var);

    public final void o(Status status) {
        xve.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
