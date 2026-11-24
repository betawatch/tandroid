// default package

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class f4d extends ig0 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4d(x1d x1dVar, byte b) {
        super(o40.a, x1dVar);
        this.q = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, jg0
    public final /* bridge */ /* synthetic */ void a(ua9 ua9Var) {
        a(ua9Var);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ ua9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override // ig0
    public final void n(xx4 xx4Var) {
        switch (this.q) {
            case 0:
                z3d z3dVar = (z3d) xx4Var;
                j4d j4dVar = (j4d) z3dVar.k();
                c4d c4dVar = new c4d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = z3dVar.F;
                Parcel e = j4dVar.e();
                int i = w3d.a;
                e.writeStrongBinder(c4dVar);
                w3d.c(e, googleSignInOptions);
                j4dVar.f(e, kk7.m1);
                break;
            default:
                z3d z3dVar2 = (z3d) xx4Var;
                j4d j4dVar2 = (j4d) z3dVar2.k();
                c4d c4dVar2 = new c4d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = z3dVar2.F;
                Parcel e2 = j4dVar2.e();
                int i2 = w3d.a;
                e2.writeStrongBinder(c4dVar2);
                w3d.c(e2, googleSignInOptions2);
                j4dVar2.f(e2, kk7.n1);
                break;
        }
    }
}
