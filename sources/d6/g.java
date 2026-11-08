package d6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.d {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i7) {
        super(z5.a.a, mVar);
        this.q = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void a(q qVar) {
        a(qVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ q d(Status status) {
        int i7 = this.q;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.n();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.F;
                Parcel l1 = kVar.l1();
                int i7 = l7.f.a;
                l1.writeStrongBinder(fVar);
                l7.f.c(l1, googleSignInOptions);
                kVar.m1(l1, qs.n1);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.n();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.F;
                Parcel l12 = kVar2.l1();
                int i10 = l7.f.a;
                l12.writeStrongBinder(fVar2);
                l7.f.c(l12, googleSignInOptions2);
                kVar2.m1(l12, qs.o1);
                break;
        }
    }
}
