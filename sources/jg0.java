// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
