package b6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i10) {
        super(x5.a.a, mVar);
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
                GoogleSignInOptions googleSignInOptions = eVar.U;
                Parcel J0 = kVar.J0();
                int i10 = j7.f.a;
                J0.writeStrongBinder(fVar);
                j7.f.c(J0, googleSignInOptions);
                kVar.K0(J0, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.U;
                Parcel J02 = kVar2.J0();
                int i11 = j7.f.a;
                J02.writeStrongBinder(fVar2);
                j7.f.c(J02, googleSignInOptions2);
                kVar2.K0(J02, 103);
                break;
        }
    }
}
