package c6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.d {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i3) {
        super(y5.a.a, mVar);
        this.q = i3;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void a(q qVar) {
        a(qVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ q d(Status status) {
        int i3 = this.q;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.m();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.F;
                Parcel L0 = kVar.L0();
                int i3 = k7.f.a;
                L0.writeStrongBinder(fVar);
                k7.f.c(L0, googleSignInOptions);
                kVar.M0(L0, hs.n1);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.m();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.F;
                Parcel L02 = kVar2.L0();
                int i10 = k7.f.a;
                L02.writeStrongBinder(fVar2);
                k7.f.c(L02, googleSignInOptions2);
                kVar2.M0(L02, hs.o1);
                break;
        }
    }
}
