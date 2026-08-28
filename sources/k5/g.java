package k5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i9) {
        super(g5.a.a, mVar);
        this.q = i9;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.f
    public final /* bridge */ /* synthetic */ void a(q qVar) {
        a(qVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ q d(Status status) {
        int i9 = this.q;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.Q;
                Parcel I0 = kVar.I0();
                int i9 = s6.f.a;
                I0.writeStrongBinder(fVar);
                s6.f.c(I0, googleSignInOptions);
                kVar.J0(I0, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.Q;
                Parcel I02 = kVar2.I0();
                int i10 = s6.f.a;
                I02.writeStrongBinder(fVar2);
                s6.f.c(I02, googleSignInOptions2);
                kVar2.J0(I02, 103);
                break;
        }
    }
}
