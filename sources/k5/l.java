package k5;

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
import g7.g5;
import g7.m8;
import org.json.JSONException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends b7.a {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 9);
        this.c = revocationBoundService;
    }

    @Override // b7.a
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String d;
        int i11 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 == 1) {
                    J0();
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
                    v0 a3 = m8.a(revocationBoundService, googleSignInOptions);
                    if (b10 != null) {
                        t0 t0Var = a3.h;
                        Context context = a3.a;
                        boolean z10 = a3.h() == 3;
                        h.a.e("Revoking access", new Object[0]);
                        String d11 = b.a(context).d("refreshToken");
                        h.b(context);
                        if (!z10) {
                            g gVar = new g(t0Var, 1);
                            t0Var.b.d(1, gVar);
                            basePendingResult = gVar;
                        } else if (d11 == null) {
                            b6.a aVar = c.c;
                            Status status = new Status(4, null, null, null);
                            y5.l.a("Status code must not be SUCCESS", !status.b());
                            basePendingResult = new s(status);
                            basePendingResult.a(status);
                        } else {
                            c cVar = new c(d11);
                            new Thread(cVar).start();
                            basePendingResult = cVar.b;
                        }
                        y5.l.n(basePendingResult, new xa.a(26));
                    } else {
                        a3.g();
                    }
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    J0();
                    i.H(revocationBoundService).I();
                }
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) t6.f.a(parcel, Status.CREATOR);
                h5.f fVar = (h5.f) t6.f.a(parcel, h5.f.CREATOR);
                t6.f.b(parcel);
                g5.a(status2, fVar, (TaskCompletionSource) obj);
                return true;
        }
    }

    public void J0() {
        if (!f6.b.e((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(i0.a.l(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 9);
        this.c = taskCompletionSource;
    }
}
