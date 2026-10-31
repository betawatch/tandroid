package a6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.e {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i10) {
        super(w5.a.a, mVar);
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
                k kVar = (k) eVar.v();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.U;
                Parcel L0 = kVar.L0();
                int i10 = i7.f.a;
                L0.writeStrongBinder(fVar);
                i7.f.c(L0, googleSignInOptions);
                kVar.M0(L0, zs.n1);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.v();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.U;
                Parcel L02 = kVar2.L0();
                int i11 = i7.f.a;
                L02.writeStrongBinder(fVar2);
                i7.f.c(L02, googleSignInOptions2);
                kVar2.M0(L02, zs.o1);
                break;
        }
    }
}
