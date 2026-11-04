package c6;

import a9.j0;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import b8.h1;
import b8.y9;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;
import k2.p1;
import org.json.JSONException;
import org.telegram.messenger.d1;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends o {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.c = revocationBoundService;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean J0(int i3, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String e10;
        int i10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i3 == 1) {
                    M0();
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
                    j0 a11 = h1.a(revocationBoundService, googleSignInOptions);
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
                        m.m(basePendingResult, new mb.b(21));
                    } else {
                        a11.g();
                    }
                } else if (i3 == 2) {
                    M0();
                    i.D(revocationBoundService).G();
                }
                break;
            default:
                if (i3 == 1) {
                    Status status2 = (Status) k7.f.a(parcel, Status.CREATOR);
                    z5.f fVar = (z5.f) k7.f.a(parcel, z5.f.CREATOR);
                    k7.f.b(parcel);
                    y9.a(status2, fVar, (TaskCompletionSource) obj);
                    break;
                }
                break;
        }
        return true;
    }

    public void M0() {
        if (!w6.b.e((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(p1.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.c = taskCompletionSource;
    }
}
