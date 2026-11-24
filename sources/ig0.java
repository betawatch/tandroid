// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ig0 extends BasePendingResult implements jg0 {
    public final wn o;
    public final yn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(yn ynVar, x1d x1dVar) {
        super(x1dVar);
        fre.i(x1dVar, "GoogleApiClient must not be null");
        fre.i(ynVar, "Api must not be null");
        this.o = ynVar.b;
        this.p = ynVar;
    }

    public abstract void n(xx4 xx4Var);

    public final void o(Status status) {
        fre.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
