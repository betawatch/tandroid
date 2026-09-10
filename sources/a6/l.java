package a6;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.clearcut.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import t7.u;
import v7.f5;
import w7.d9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l extends b8.b {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.c = revocationBoundService;
    }

    @Override // b8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 == 1) {
                    L0();
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
                    v0 a10 = d9.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a10.h;
                        Context context = a10.a;
                        boolean z10 = a10.h() == 3;
                        h.a.f("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (!z10) {
                            g gVar = new g(t0Var, 1);
                            t0Var.b.d(1, gVar);
                            basePendingResult = gVar;
                        } else if (d11 == null) {
                            a5.a aVar = c.c;
                            Status status = new Status(4, null, null, null);
                            n6.l.a("Status code must not be SUCCESS", !status.b());
                            basePendingResult = new s(status);
                            basePendingResult.a(status);
                        } else {
                            c cVar = new c(d11);
                            new Thread(cVar).start();
                            basePendingResult = cVar.b;
                        }
                        n6.l.n(basePendingResult, new u());
                    } else {
                        a10.g();
                    }
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    L0();
                    i.L(revocationBoundService).N();
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) i7.f.a(parcel, Status.CREATOR);
                x5.f fVar = (x5.f) i7.f.a(parcel, x5.f.CREATOR);
                i7.f.b(parcel);
                f5.a(status2, fVar, (TaskCompletionSource) obj);
                return true;
        }
    }

    public void L0() {
        if (!u6.b.e((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(hc.b.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.c = taskCompletionSource;
    }
}
