// default package

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h6d extends jh0 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6d(z3d z3dVar, byte b) {
        super(o50.a, z3dVar);
        this.q = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, kh0
    public final /* bridge */ /* synthetic */ void a(uc9 uc9Var) {
        a(uc9Var);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ uc9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override // jh0
    public final void n(zz4 zz4Var) {
        switch (this.q) {
            case 0:
                b6d b6dVar = (b6d) zz4Var;
                l6d l6dVar = (l6d) b6dVar.k();
                e6d e6dVar = new e6d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = b6dVar.F;
                Parcel e = l6dVar.e();
                int i = y5d.a;
                e.writeStrongBinder(e6dVar);
                y5d.c(e, googleSignInOptions);
                l6dVar.f(e, nm7.m1);
                break;
            default:
                b6d b6dVar2 = (b6d) zz4Var;
                l6d l6dVar2 = (l6d) b6dVar2.k();
                e6d e6dVar2 = new e6d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = b6dVar2.F;
                Parcel e2 = l6dVar2.e();
                int i2 = y5d.a;
                e2.writeStrongBinder(e6dVar2);
                y5d.c(e2, googleSignInOptions2);
                l6dVar2.f(e2, nm7.n1);
                break;
        }
    }
}
