package b6;

import a8.aa;
import a8.ng;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends c8.b {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.c = revocationBoundService;
    }

    @Override // c8.b
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 == 1) {
                    K0();
                    b a2 = b.a(revocationBoundService);
                    GoogleSignInAccount b10 = a2.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.v;
                    if (b10 != null) {
                        String d10 = a2.d("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(d10) && (d = a2.d(b.f("googleSignInOptions", d10))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(d);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    a6.a a10 = a.a.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        s0 s0Var = a10.h;
                        Context context = a10.a;
                        boolean z10 = a10.h() == 3;
                        h.a.j("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (!z10) {
                            g gVar = new g(s0Var, 1);
                            s0Var.b.d(1, gVar);
                            basePendingResult = gVar;
                        } else if (d11 == null) {
                            ng ngVar = c.c;
                            Status status = new Status(4, null, null, null);
                            o6.l.a("Status code must not be SUCCESS", !status.b());
                            basePendingResult = new s(status);
                            basePendingResult.a(status);
                        } else {
                            c cVar = new c(d11);
                            new Thread(cVar).start();
                            basePendingResult = cVar.b;
                        }
                        o6.l.n(basePendingResult, new u7.s(14));
                    } else {
                        a10.g();
                    }
                } else if (i10 == 2) {
                    K0();
                    i.e0(revocationBoundService).g0();
                }
                break;
            default:
                if (i10 == 1) {
                    Status status2 = (Status) j7.f.a(parcel, Status.CREATOR);
                    y5.f fVar = (y5.f) j7.f.a(parcel, y5.f.CREATOR);
                    j7.f.b(parcel);
                    aa.a(status2, fVar, (TaskCompletionSource) obj);
                    break;
                }
                break;
        }
        return true;
    }

    public void K0() {
        if (!v6.b.e((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(ic.a.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.c = taskCompletionSource;
    }
}
