package m5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i10) {
        super(i5.a.a, mVar);
        this.q = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.f
    public final /* bridge */ /* synthetic */ void a(q qVar) {
        a(qVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ q d(Status status) {
        int i10 = this.q;
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
                int i10 = u6.f.a;
                I0.writeStrongBinder(fVar);
                u6.f.c(I0, googleSignInOptions);
                kVar.J0(I0, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.Q;
                Parcel I02 = kVar2.I0();
                int i11 = u6.f.a;
                I02.writeStrongBinder(fVar2);
                u6.f.c(I02, googleSignInOptions2);
                kVar2.J0(I02, 103);
                break;
        }
    }
}
