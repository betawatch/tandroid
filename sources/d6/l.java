package d6;

import a8.k8;
import a8.q;
import a8.u7;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b9.j0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import org.telegram.messenger.d1;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends q {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 7);
        this.c = revocationBoundService;
    }

    @Override // a8.q
    public final boolean j1(int i7, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String e10;
        int i10 = this.b;
        Object obj = this.c;
        boolean z9 = false;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i7 == 1) {
                    m1();
                    b a10 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a10.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.w;
                    if (b10 != null) {
                        String e11 = a10.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e11) && (e10 = a10.e(b.f("googleSignInOptions", e11))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e10);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    j0 a11 = u7.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        n0 n0Var = a11.i;
                        Context context = a11.a;
                        boolean z10 = a11.h() == 3;
                        h.a.a("Revoking access", new Object[0]);
                        String e12 = b.a(context).e("refreshToken");
                        h.b(context);
                        if (!z10) {
                            g gVar = new g(n0Var, 1);
                            n0Var.b.d(1, gVar);
                            basePendingResult = gVar;
                        } else if (e12 == null) {
                            d1 d1Var = c.c;
                            Status status = new Status(4, null, null, null);
                            m.a("Status code must not be SUCCESS", !status.b());
                            basePendingResult = new s(status);
                            basePendingResult.a(status);
                        } else {
                            c cVar = new c(e12);
                            new Thread(cVar).start();
                            basePendingResult = cVar.b;
                        }
                        m.m(basePendingResult, new w7.s(21, z9));
                    } else {
                        a11.g();
                    }
                } else if (i7 == 2) {
                    m1();
                    i.o0(revocationBoundService).p0();
                }
                break;
            default:
                if (i7 == 1) {
                    Status status2 = (Status) l7.f.a(parcel, Status.CREATOR);
                    a6.f fVar = (a6.f) l7.f.a(parcel, a6.f.CREATOR);
                    l7.f.b(parcel);
                    k8.a(status2, fVar, (TaskCompletionSource) obj);
                    break;
                }
                break;
        }
        return true;
    }

    public void m1() {
        if (!x6.b.e((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(jg.g.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 7);
        this.c = taskCompletionSource;
    }
}
