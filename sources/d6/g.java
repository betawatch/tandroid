package d6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                Parcel L0 = kVar.L0();
                int i7 = l7.f.a;
                L0.writeStrongBinder(fVar);
                l7.f.c(L0, googleSignInOptions);
                kVar.M0(L0, qs.n1);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.n();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.F;
                Parcel L02 = kVar2.L0();
                int i10 = l7.f.a;
                L02.writeStrongBinder(fVar2);
                l7.f.c(L02, googleSignInOptions2);
                kVar2.M0(L02, qs.o1);
                break;
        }
    }
}
